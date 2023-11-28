import java.sql.Connection;
import java.util.Scanner;

public class Connexion {

    private String Password;

    private String Email;

    private Connection connection;

    private Scanner userInput;


    public Connexion(){
        Scanner userInput = new Scanner(System.in);
        this.userInput = userInput;
        set_Email();
        set_Password();
        connection = null;
    }

    public void set_Password(){

        System .out.println("Mot de passe :");
        String password = userInput.next();
        this.Password = password;
    }

    public void set_Email(){
        System .out.println("Email :");
        String email = userInput.next();
        this.Email = email;
    }

    public void set_connection(Connection connection){
        this.connection=connection;
    }

    public String getPassword() {
        return Password;
    }

    public String getEmail() {
        return Email;
    }

    public Connection getConnection() {
        return connection;
    }

    public Scanner getUserInput() {
        return userInput;
    }
}
