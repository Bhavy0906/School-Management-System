import java.io.*;
import java.util.*;

public class Signup extends User {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String userID;
    String password;
    String userName;

    public Signup() {
    }

    public void createNewUser(int number) throws IOException {
        Input in = new Input();
        FileManagement fm = new FileManagement();
        userID = in.userID();
        password = fm.loginSearch(userID, number);
        while (!password.equals("")) {
            System.out.println("Username Already Exists");
            userID = in.userID();
            password = fm.loginSearch(userID, number);
            continue;
        }
        System.out.println("Enter User Name");
        userName = br.readLine();
        password = in.password();
        
        // 
    }

    public int checkSignUp() throws IOException {
        int val = Integer.parseInt(br.readLine());
        while (val != 1 && val != 2) {
            System.out.println("Invalid Input, Please try again");
            val = Integer.parseInt(br.readLine());
            continue;
        }
        return val;
    }
    // public boolean

}
