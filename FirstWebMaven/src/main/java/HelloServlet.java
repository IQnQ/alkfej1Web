import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/survey")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //resp.setContentType("text/html");
        resp.getWriter().append("<body>\n" +
                "<div class=\"main-container\">\n" +
                "    <div class=\"ui container main-container\">\n" +
                "        <form class=\"ui form\" method=\"post\">\n" +
                "            <h1 class=\"ui header\">Alkfej kérdöiv 2020</h1>\n" +
                "            <div class=\"field\">\n" +
                "                <label for=\"firstname\">Keresztnév</label>\n" +
                "                <input name=\"firstname\" id=\"firstname\" type=\"text\" placeholder=\"Keresztnév\">\n" +
                "            </div>\n" +
                "            <div class=\"field\">\n" +
                "                <label for=\"lastname\">Vezetéknév</label>\n" +
                "                <input id=\"lastname\" type=\"lastname\" name=\"lastname\" placeholder=\"Vezetéknév\"/>\n" +
                "            </div>\n" +
                "            <button class=\"ui button fluid blue\" name=\"submit\" href=\"index.html\" type=\"submit\" id=\"submit\">Fill the survey</button>\n" +
                "        </form>\n" +
                "    </div>\n" +
                "    <div class=\"ui container text-container\">\n" +
                "        <br>\n" +
                "        <br>\n" +
                "        <br>\n" +
                "    </div>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "</body>");
        resp.getWriter().append("<body>" +
                "\n"   +
                "<div class=\"ui container\">\n" +
                "    <div class=\"main-container\">\n" +
                "        <div class=\"left-container\">\n" +
                "            <h2 id=\"show-counter\"></h2>\n" +
                "            <p id=\"show-data\">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla lobortis magna vel ipsum eleifend, sed\n" +
                "                pellentesque neque finibus.</p>\n" +
                "        </div>\n" +
                "\n" +
                "        <div class=\"right-container\">\n" +
                "            <button class=\"ui button survey-button\" id=\"answer1\">Strongly disagree</button>\n" + "<br>"+
                "            <button class=\"ui button survey-button\" id=\"answer2\" >Disagree</button>\n" + "<br>" +
                "            <button class=\"ui button survey-button\" id=\"answer3\">Neither agree nor disagree</button>\n" + "<br>" +
                "            <button class=\"ui button survey-button\" id=\"answer4\">Agree</button>\n" + "<br>" +
                "            <button class=\"ui button survey-button\" id=\"answer5\">Strongly agree</button>\n" +"<br>" +
                "        </div>\n" +
                "    </div>\n" +
                "    <br>\n" +
                "    <div class=\"navigation-controllers\">\n" +
                "        <button class=\"ui icon button left-arrow\" id=\"prev-data\">\n" +
                "            <i class=\"ui icon arrow left\"></i>\n" +
                "        </button>\n" +
                "        <button class=\"ui icon button right-arrow\" disabled id=\"next-data\">\n" +
                "            <i class=\"ui icon arrow right\"></i>\n" +
                "        </button>\n" +
                "        <button class=\"ui icon button\" disabled id=\"review-data\">\n" +
                "            Review Data\n" +
                "        </button>\n" +
                "\n" +
                "    </div>\n" +
                "</div>\n" +
                "</body>");
    }
}
