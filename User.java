import java.util.*;

public class User {

    protected static TreeMap <String, String> teacher = new TreeMap<>();
    protected static TreeMap <String, String> student = new TreeMap<>();
    protected static TreeMap <String, String> admin = new TreeMap<>();
    private String name;
    private String id;

    public User ()
    {}

    public User(String name, String id){
        this.name = name;
        this.id = id;
    }

    public Set<String> getIDTeacher ()
    {
        return teacher.keySet();
    }

    public Set<String> getIDStudent ()
    {
        return student.keySet();
    }

    public Set<String> getIDAdmin ()
    {
        return admin.keySet();
    }

    


}
