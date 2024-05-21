import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet", value = "/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            response.setContentType("text/html");

            double numberOne = Double.parseDouble(request.getParameter("numberOne"));
            double numberTwo = Double.parseDouble(request.getParameter("numberTwo"));
            String operator = request.getParameter("operator");
            double result = Calculator.calculate(numberOne, numberTwo, operator);


            PrintWriter writer = response.getWriter();
            writer.println("<html><head><title>Calculator Result</title></head><body>");
            writer.println("<h2>Result: </h2>" + "<br>");
            writer.println(numberOne + " " + operator + " " + numberTwo + " = " + result + "<br>");
            writer.println("</body></html>");
        } catch (ArithmeticException e) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, e.getMessage());
        }
    }
}







