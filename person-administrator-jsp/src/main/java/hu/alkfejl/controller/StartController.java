package hu.alkfejl.controller;

import hu.alkfejl.model.QuestionDAO;
import hu.alkfejl.model.QuestionDAOImpl;
import hu.alkfejl.model.SurveyDAO;
import hu.alkfejl.model.SurveyDAOImpl;
import hu.alkfejl.model.bean.Survey;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;


@WebServlet("/StartController")
public class StartController extends HttpServlet {
    private static final long serialVersionUID = 2L;
    private QuestionDAO dao = new QuestionDAOImpl();
    private SurveyDAO dao2 = new SurveyDAOImpl();
    int surveyID = 0;


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        String test = request.getParameter("id");
        try {
            int id = Integer.parseInt(test);
            this.surveyID = id;
            Survey s = dao2.getSurvey(id);
            System.out.println(s.getMaxTime());
            if (LocalDateTime.now().isBefore(s.getTo())) {
                if (LocalDateTime.now().isAfter(s.getFrom())) {
                    response.sendRedirect("pages/start.jsp");
                } else {
                    response.sendRedirect("pages/soon.jsp");
                }
            } else {
                response.sendRedirect("pages/expired.jsp");
            }

        } catch (Exception e) {
            System.out.println(e);
        }


    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("questionList", dao.listQuestions(this.surveyID));
    }

}
