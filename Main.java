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
        Type type = new Type();
        int t = 0;
        switch (enter)
        {
            case 1:
            t = type.post();
            if (t == 1 || t == 2 || t == 3)
            {

            }
            else 
                details.
            signup.setUserID(userID, password, type)
        }

    }
}