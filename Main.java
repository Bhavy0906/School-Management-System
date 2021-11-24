import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        Details details = new Details();
        //Details class displays the basic information and various print statements guiding the user through the code.

        User user = new User();
        //Contains information about about the school

        details.basicDisplay();
        //Displays the front page of the school
        details.enterInto();
        //Asks the user whether he wants to log in or sign in the system.

        Signup signup = new Signup();
        Login login = new Login();
        Type type = new Type();

        int t = 0;
        TreeMap<String, String> tree;
        MapReturn mapReturn = new MapReturn();
        Input input = new Input();
        String userID = "";
        String password = "";
        int enter = 0;

        do {
            enter = Integer.parseInt(br.readLine());
            t = type.post();
            if (t == 1 || t == 2 || t == 3) {
                tree = mapReturn.type(t);
            } else {
                details.invalidLoginDetails();
                break;
            }
            userID = input.userID();
            password = input.password();
            if (password != "") {
                switch (enter) {
                case 1:
                    signup.setUserID(userID, password, tree);
                    break;
                case 2:
                    login.loginCheck(userID, password, tree);
                    break;
                }
            } else
                break;
        } while (false);

    }
}