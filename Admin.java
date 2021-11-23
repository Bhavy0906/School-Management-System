
public class Admin extends User {

    private String studentName;
    private String teacherName;
    private String name;
    private String id;

    public Admin (String name, String id)
    {
        this.name = name;
        this.id = id;
        User.admin.put(id, name);
    }

    

    
}
