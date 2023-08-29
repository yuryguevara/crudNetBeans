
import java.sql.*;

public class conexionmysql {
    
    private static Connection conn = null;
    private String driver;
    private String url;
    private String usuario;
    private String password;
    
    private conexionmysql() {

        String url = "jdbc:mysql://localhost:3306/cliente";
        String driver = "com.mysql.cj.jdbc.Driver";
        String usuario = "root";
        String password = "20131995dahianA";

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, usuario, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    } // Fin constructor

    public static Connection getConnection() {

        if (conn == null) {
            new conexionmysql();
        }
        return conn;
    } // Fin getConnection
}
