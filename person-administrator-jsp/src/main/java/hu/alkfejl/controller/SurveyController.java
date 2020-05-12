package hu.alkfejl.controller;


import hu.alkfejl.model.SurveyDAO;
import hu.alkfejl.model.SurveyDAOImpl;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/SurveyController")
public class SurveyController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private SurveyDAO dao = new SurveyDAOImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("surveyList", dao.listSurveys());
    }

}
