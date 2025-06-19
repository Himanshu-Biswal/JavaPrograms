package Driver;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet_20_Circle extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        ServletConfig s = getServletConfig();
        String pi = s.getInitParameter("pi");
        double pii = Double.parseDouble(pi);
        int r = 7;

        Servlet_21_Area_oF_Geometric_Shape se = new Servlet_21_Area_oF_Geometric_Shape();
        double area = se.circle(r);

        double res = pii * (r * r);

        PrintWriter out = resp.getWriter();
        out.print("<h1>Area Of Circle: " + res + ", " + area + "</h1>");
    }
}
