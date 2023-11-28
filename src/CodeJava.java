import java.sql.*;

public class CodeJava {
    static final String CONN_URL = "jdbc:oracle:thin:@oracle1.ensimag.fr:1521:oracle1";
    public static void main(String[] args) {
        try {
            // Enregistrement du driver Oracle
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        } catch (SQLException e) {
            System.err.println("failed !");
            e.printStackTrace();
        }

        Connexion connexion = null;
        String memberID = null;
        while (memberID == null) {
            try {
                connexion = new Connexion();
                String url = "";
                String user = "elfatihr";
                String password = "elfatihr";
                connexion.set_connection(DriverManager.getConnection(url, user, password));
                memberID = getMemberID(connexion);
            } catch (SQLException e) {
                System.err.println("failed !");
                e.printStackTrace();
            }
        }
    }



}
