import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        Details details = new Details();
        // Details class displays the basic information and various print statements
        // guiding the user through the code.

        User user = new User();
        // Contains information about about the school

        details.basicDisplay();
        // Displays the front page of the school
        TreeMap<String, String> tree;
        Type type = new Type();
        tree = type.post();

        Signup signup = new Signup();
        Login login = new Login();

        if (tree == User.student) {
            details.enterLogin();
            login.loginValueCheck(tree);

        } else if (tree == User.teacher) {
            details.enterLogin();
            login.loginValueCheck(tree);

        } else if (tree == User.admin) {
            details.enterLogin();
            login.loginValueCheck(tree);

            details.enterSignup();
            int value = signup.checkSignUp();
            if (value == 1) {
                signup.createNewUser(User.student);
                Student std = new Student(signup.userID, signup.userName);
                std.getDetails();
            }
            if (value == 2) {
                signup.createNewUser(User.teacher);
                Teacher tch = new Teacher(signup.userID, signup.userName);
            }

        }

    }
    

}