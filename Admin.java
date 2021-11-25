
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

    
}
