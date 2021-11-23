import java.io.*;

public class Login extends User{

    private String userID;
    private String password;
    static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    
    boolean loginCheck (String userID, String password)throws IOException
    {
        System.out.println("Please enter 1 if you are student, 2 if you are a teacher, and 3 if you are the admin");
        int choice = Integer.parseInt(br.readLine());
        String arr[] = {"Student", "Teacher", "Admin"};
        switch (choice)
        {
            case 1:
            loginDetails(userID, password, super.student);

        }
        if (this.userID.equals(userID))
        {
            if (this.password.equals(this.password))
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

    boolean loginDetails (String userID, String password, TreeMap check)
    {
        
    }
    
    
}
