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
        //Creates instance of the sign up class
        Login login = new Login();
        //Creates instance of the login class
        Type type = new Type();
        //Creates instance of the type class
        //The class asks whether you are a student or a teacher or admin

        int t = 0;
        //Saves whether the user is a student, or a teacher, or admin
        TreeMap<String, String> tree;
        MapReturn mapReturn = new MapReturn();
        //Creates instance of the class which returns the tree map of student, teacher or admin
        Input input = new Input();
        //Takes user ID and password input from the user
        String userID = "";
        String password = "";
        int enter = 0;
        //Stores whether user wants to signup or login

        Outer:
        do {
            enter = Integer.parseInt(br.readLine());
            t = type.post();
            //post method defines whether user is a student or a teacher or admin.
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
                    if(signup.setUserID(userID, password, tree))
                        continue;
                    break Outer;
                case 2:
                    if(!login.loginCheck(userID, password, tree))                   
                        break Outer;
                    break;
                default:
                    break Outer;
                }
            } else{
                System.out.println("Password format incorrect");
                System.out.println("Try again");
                break;
            }
            if (t == 1)
            


        } while (false);

    }
}