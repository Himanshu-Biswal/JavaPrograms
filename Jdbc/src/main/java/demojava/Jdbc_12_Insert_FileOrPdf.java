package demojava;

import java.sql.*;
import java.io.*;

public class Jdbc_12_Insert_FileOrPdf {
    private static String url = "jdbc:postgresql://localhost:5432/File";
    private static String user = "postgres";
    private static String pswd = "Himanshu@123";

    public static void main(String[] args) {
        String filePath = "C:/Users/himan/OneDrive/Desktop/JAVA/exmp.pdf";
        String sql = "INSERT INTO documents (id, name, data) VALUES (?, ?, ?)";

        File file = new File(filePath);
        if (!file.exists()) {
            System.out.println("File not found: " + filePath);
            return;
        }

        try (Connection conn = DriverManager.getConnection(url, user, pswd);
             PreparedStatement stmt = conn.prepareStatement(sql);
             FileInputStream input = new FileInputStream(file)) {

            stmt.setInt(1, 1);
            stmt.setString(2, file.getName());
            stmt.setBinaryStream(3, input, file.length());

            int rowsInserted = stmt.executeUpdate();
            System.out.println(rowsInserted + " file inserted.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
