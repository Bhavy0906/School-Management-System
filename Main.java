import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        Details details = new Details ();  
        User user = new User();      
        details.basicDisplay();
        details.enterInto();
        int enter = Integer.parseInt(br.readLine());
        Signup signup = new Signup();
        Login login = new Login ();
        Type type = new Type();
        int t = 0;
        TreeMap <String, String> tree;
        MapReturn mapReturn = new MapReturn();
        Input input = new Input();
        String userID = "";
        String password = "";
        t = type.post();
        if (t == 1 || t == 2 || t == 3)
        {
            tree = mapReturn.type(t);
        }
        else 
        {
            details.invalidLoginDetails();
            break;
        }    
        userID = input.userID();
        password = input.password();
        switch (enter)
        {
            case 1:
            
            if (password != "")
                signup.setUserID(userID, password, tree);
            else
                break;
            break;

            case 2:
            t = type.post();
            if (t == 1 || t == 2 || t == 3)
            {
                tree = mapReturn.type(t);
            }
            else 
            {
                details.invalidLoginDetails();
                break;
            }
            userID = input.userID();
            password = input.password();
            if (password != "")
                login.loginCheck(userID, password, tree);
            else
                break;
            break;
        }

    }
}