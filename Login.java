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

    void loginValueCheck(int number) throws IOException{
        num = Integer.parseInt(br.readLine());
        Details dtl = new Details();
        while(num !=  1){
            dtl.invalidLoginDetails();
            dtl.loginDetails();
            num = Integer.parseInt(br.readLine());
            continue;
        }
            Input in = new Input();
            FileManagement fm = new FileManagement();
            userID = in.userID();
            password = fm.loginSearch(userID, number);
            while(password.equals("")){
                System.out.println("Username Incorrect");
                userID = in.userID();
                password = fm.loginSearch(userID, number);
                continue;
            }
            String pass = in.password();
            while(!pass.equals(password)){
                dtl.incorrectPassword();
                pass = in.password();
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
