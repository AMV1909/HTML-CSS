package controller;

import dao.EmployeeDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Employee;

@WebServlet(name = "EmployeeServlet", urlPatterns = {"/EmployeeServlet"})
public class EmployeeServlet extends HttpServlet {
    private Employee employee = null;
    private EmployeeDAO employeeDAO = null;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String process = request.getParameter("Login");
        employeeDAO = new EmployeeDAO();
        if(process.equals("Ingresar")) {
            String User = request.getParameter("User");
            String Password = request.getParameter("Password");

            boolean Login = employeeDAO.Login(User, Password);

            if(Login) {
                    response.sendRedirect("/WebApp/views/Functions.html");
            }else {
                    response.sendRedirect("/WebApp/views/Login.jsp?Finded="+Login);
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
