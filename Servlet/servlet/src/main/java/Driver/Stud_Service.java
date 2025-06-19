package Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Stud_Service {
    private static String url = "jdbc:postgresql://localhost:5432/School";
    private static String user = "postgres";
    private static String pswd = "Himanshu@123";
    private static Connection con = null;

    static {
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url, user, pswd);
            System.out.println("Database connected successfully.");
        } catch (ClassNotFoundException e) {
            System.err.println("PostgreSQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Database connection failed.");
            e.printStackTrace();
        }
    }

    public int addDetails(Stud_Details s) {
        if (con == null) {
            System.err.println("Database connection is not established.");
            return 0;
        }

        int res = 0;
        String sql = "INSERT INTO student (id, name, age, gender, mail) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement pstm = con.prepareStatement(sql)) {
            pstm.setInt(1, s.getId());
            pstm.setString(2, s.getName());
            pstm.setInt(3, s.getAge());
            pstm.setString(4, s.getGender());
            pstm.setString(5, s.getMail());
            res = pstm.executeUpdate();
            System.out.println("Data Added!");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return res;
    }


}
