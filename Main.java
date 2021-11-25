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
        // Creates instance of the sign up class
        Login login = new Login();
        Teacher tch;

        if (tree == User.admin) {
            details.enterLogin();
            login.loginValueCheck(3);

            details.enterSignup();
            int value = signup.checkSignUp();
            if (value == 1) {
                signup.createNewUser(value);
                String[] course = new String[5];
                System.out.println("Enter the courses taken(5).Please enter every in a new line");
                for (int i = 0; i < 5; i++) {
                    String cr = br.readLine();
                    course[i] = cr;
                }
                System.out.println("Signup Successful");
                Student std = new Student(signup.userID, signup.userName, signup.password, course);
            }
            if (value == 2) {
                signup.createNewUser(value);
                String[] course = new String[3];
                System.out.println("Enter the courses taken(3).Please enter every in a new line");
                for (int i = 0; i < 3; i++) {
                    String cr = br.readLine();
                    course[i] = cr;
                }
                System.out.println("Signup Successful");
                tch = new Teacher(signup.userID, signup.userName, signup.password, course);
                // tch.setDetails("Bhavy", "Meow", 50);
                // tch.setDetails("Uday", "Opti", 50);
            }

        } else if (tree == User.student) {
            details.enterLogin();
            String userID = login.loginValueCheck(1);
            Student.getDetails(userID);

        } else if (tree == User.teacher) {
            details.enterLogin();
            String userID = login.loginValueCheck(2);
            // Teacher.setDetails("Bhavy", "Meow", 50);
            System.out.println("Enter student user id");
            String id = br.readLine();
            System.out.println("Enter course name");
            String course = br.readLine();
            System.out.println("Enter course marks");
            int marks = Integer.parseInt(br.readLine());
            Teacher.setDetails(id, course, marks);

        }
    }
}
