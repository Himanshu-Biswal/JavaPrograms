package Driver;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/save")
public class Servlet_05_Student extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Triggered");

        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        int age = Integer.parseInt(req.getParameter("age"));
        String gender = req.getParameter("gender");
        String mail = req.getParameter("mid");

        Stud_Details s = new Stud_Details();
        s.setId(id);
        s.setName(name);
        s.setAge(age);
        s.setGender(gender);
        s.setMail(mail);

        Stud_Service se = new Stud_Service();
        int res = se.addDetails(s); // ✅ passing the filled object

        resp.setContentType("text/html");
        PrintWriter p = resp.getWriter();

        if (res != 0) {
            p.print("<h2>Data Saved Successfully</h2>");
        } else {
            p.print("<h2>Failed to Save Data</h2>");
        }

        p.print("<h3>ID: " + id + "</h3>");
        p.print("<h3>Name: " + name + "</h3>");
        p.print("<h3>Age: " + age + "</h3>");
        p.print("<h3>Gender: " + gender + "</h3>");
        p.print("<h3>Email: " + mail + "</h3>");
    }
}
