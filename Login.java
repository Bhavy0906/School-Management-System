import java.io.*;
import java.util.*;

public class Login extends User{

    private String userID;
    private String password;
    static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    private int num;
    public Login()
    {
        userID = "";
        password = "";
    }

    void loginValueCheck(TreeMap<String,String> tree) throws IOException{
        num = Integer.parseInt(br.readLine());
        Details dtl = new Details();
        while(num !=  1){
            dtl.invalidLoginDetails();
            dtl.loginDetails();
            num = Integer.parseInt(br.readLine());
            continue;
        }
            Input in = new Input();
            userID = in.userID();
            // while(!tree.containsValue(userID)){
            //     System.out.println("Username Incorrect");
            //     userID = in.userID();
            // }
            password = in.password();
            boolean check = loginCheck(userID, password, tree);
            while(!check){
              dtl.incorrectPassword();
              password = in.password();
              check = loginCheck(userID, password, tree);
            }
            System.err.println("Login Successful");

        }
    
    boolean loginCheck (String userID, String password, TreeMap<String, String> type)throws IOException
    { 
        if (type.containsKey(userID)) 
        {
            if (type.get(userID) == password)
                return true;
            else
                return false;
        }
        return false;
    }

    public void setUserID (String userID)
    {
        this.userID = userID;
    }

    public void setPassword (String password)
    {
        this.password = password;
    }
    
}
