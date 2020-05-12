package hu.alkfejl.model;

import hu.alkfejl.model.bean.Survey;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SurveyDAOImpl implements SurveyDAO {


    private static final String LIST_SURVEYS = "SELECT * FROM Survey;";
    private static final String SELECT_SURVEY = "SELECT * FROM Survey WHERE id=?";



    public SurveyDAOImpl() {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        }
    }

    @Override
    public List<Survey> listSurveys() {

        List<Survey> surveys = new ArrayList<>();
        try (Connection c = DriverManager.getConnection(DBConfig
        .DB_CONN_STR); Statement st = c.createStatement()) {

            ResultSet rs = st.executeQuery(LIST_SURVEYS);

            while (rs.next()) {
                surveys.add(new Survey(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getBoolean(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getInt(10)
                ));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return surveys;

    }

    @Override
    public Survey getSurvey(int id) {
        Survey s = new Survey();
        try (Connection c = DriverManager.getConnection(DBConfig
                .DB_CONN_STR); PreparedStatement st = c.prepareStatement(SELECT_SURVEY)) {
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                s = new Survey(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getBoolean(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getInt(10)
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return s;
    }
}
