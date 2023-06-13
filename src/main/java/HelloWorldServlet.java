import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("Hello World");


        String firstName = request.getParameter("firstname");
        System.out.println(firstName);
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if(firstName == null) {
            out.println("<html><h1>Hello, World!</h1></html>");
        }else {
            out.println("<html><h1>Hello, " + firstName + "!</h1></html>");
        }


    }


}
