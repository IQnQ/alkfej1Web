package hu.alkfejl.model;

import hu.alkfejl.model.bean.Question;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class QuestionDAOImpl implements QuestionDAO{

    private static final String LIST_QUESTIONS = "SELECT * FROM Question WHERE survey_id=?";

    public QuestionDAOImpl() {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        }
    }

    @Override
    public List<Question> listQuestions(int surveyID) {

        List<Question> questions = new ArrayList<>();
        try (Connection c = DriverManager.getConnection(DBConfig
                .DB_CONN_STR); PreparedStatement st = c.prepareStatement(LIST_QUESTIONS)) {
            st.setInt(1, surveyID);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Question q = new Question(
                        rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getDate(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11),
                        rs.getString(12),
                        rs.getBoolean(13),
                        rs.getBoolean(14),
                        rs.getBoolean(15),
                        rs.getBoolean(16),
                        rs.getBoolean(17)
                );
                questions.add(q);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return questions;
    }
}
