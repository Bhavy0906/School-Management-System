import java.io.*;
import java.util.*;

public class FileManagement {

    //The class will contain the basic code of file initiation and usage.
    //Just copy paste it to the relevant portions.

    //Format of the file storing UserID and Password
    //   UserID
    //   Password
    //Even places have User ID and Odd places have password

    //Will return the file name in which the the login details would be stored
    public String type (int ch)
    {
        if (ch == 1)
        return "Student.txt";
        if (ch == 2)
        return "Teacher.txt";
        if (ch == 3)
        return "Admin.txt";
        return "";
    }

    public void emptyFileCreation (int choice)throws IOException
    {
        Writer out = null;
        String str = "";
        try {
            out = new FileWriter(type(choice));
            out.write(str);
        } catch (Exception e) {
            System.err.println(e);
        }
        out.close();
    }
    
    public void loginInput(String userID, String password, int choice)throws IOException {
        //choice denotes the values assigned to student, teacher, and admin
        Writer out = null;
        try {
            out = new BufferedWriter(new FileWriter(type(choice), true));
            out.write(userID + "\n");
            out.write(password + "\n");
            //Will write the UserID and Password to the file and will store them
        } catch (Exception e) {
            System.err.println(e);
        }
        out.close();
    }

    public String loginSearch (String userID, int choice)throws IOException
    {
        BufferedReader input = null;
        String name = type(choice);
        String str = "";
        try {
            input = new BufferedReader (new FileReader(name));
            while ((str = input.readLine()) != null)
            {
                if (str.equals(userID))
                    return input.readLine();
            }
            input.close();
            return "";
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
}
