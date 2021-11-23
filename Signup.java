import java.io.*;
import java.util.*;

public class Signup extends User {

    private String userID;
    private String password;

    public Signup ()
    {
        userID = "";
        password = "";
    }

    public boolean setUserID (String userID, String password, TreeMap type)
    {
        if (!type.containsKey(userID))
        {
            type.put(userID, password);
            return true;
        }
        return false;
    }

    // public boolean
    
}
