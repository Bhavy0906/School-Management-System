import java.io.IOException;

import com.opencsv.exceptions.CsvException;

public class Admin extends User {

    private String studentName;
    private String teacherName;
    private String name;
    private String id;

    public Admin ()
    {}

    public Admin (String name, String id)
    {
        this.name = name;
        this.id = id;
    }

    public void basicDetails ()
    {
        System.out.println("Hello Admin");
        System.out.println("Welcome to the School");
        System.out.println("Enter 1 for making new records of Teacher, 2 for making new records of Student");
    }    

    static void delete(String userID, int choice) throws IOException, CsvException{
        FileManagement fm = new FileManagement(); 
        fm.deleteEntry(userID, choice);
    }
}
