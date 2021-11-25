import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        FileManagement fm = new FileManagement();
        // fm.adminDetails();

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
        //Creates instance of the sign up class
        Login login = new Login();

        if (tree == User.student) {
            details.enterLogin();
            login.loginValueCheck(1);

        } else if (tree == User.teacher) {
            details.enterLogin();
            login.loginValueCheck(2);

        } else if (tree == User.admin) {
            details.enterLogin();
            login.loginValueCheck(3);

            details.enterSignup();
            int value = signup.checkSignUp();
            if (value == 1) {
                signup.createNewUser(value);
                Student std = new Student(signup.userID, signup.userName, signup.password);
                std.getDetails();
            }
            if (value == 2) {
                signup.createNewUser(value);
                Teacher tch = new Teacher(signup.userID, signup.userName, signup.password);
            }

        }





        //Different Approach
        //Will be added only if it works fine
        // Outer:
        // do {
        //     enter = Integer.parseInt(br.readLine());
        //     t = type.post();
        //     //post method defines whether user is a student or a teacher or admin.
        //     if (t == 1 || t == 2 || t == 3) {
        //         tree = mapReturn.type(t);
        //     } else {
        //         details.invalidLoginDetails();
        //         break;
        //     }
        //     userID = input.userID();
        //     password = input.password();
        //     if (password != "") {
        //         if(!login.loginCheck(userID, password, tree))                   
        //             break Outer;
        //         } else{
        //         System.out.println("Password format incorrect");
        //         System.out.println("Try again");
        //         break;
        //     }
        //     User object;
        //     if (t == 1)
        //     {
        //         object = new Student ();
        //     }
        //     if (t == 2)
        //     {
        //         object = new Teacher ();
        //     }
        //     if (t == 3)
        //     {
        //         object = new Admin ();
        //     }
            



        // } while (false);
    }
    

}