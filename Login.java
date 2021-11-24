import java.io.*;
import java.util.*;

public class Login extends User{

    private String userID;
    private String password;
    static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

    public Login ()
    {
        userID = "";
        password = "";
    }
    
    boolean loginCheck (String userID, String password, TreeMap<String, String> type)throws IOException
    { 
        if (type.containsKey(userID)) 
        {
            if (type.containsValue(password))
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
