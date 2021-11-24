import java.util.*;

public class MapReturn extends User {
    
    public TreeMap type (int ch)
    {
        TreeMap <String, String> tree = new TreeMap<>();
        switch (ch)
        {
            case 1:
                return student;
            case 2:
                return teacher;
            case 3:
                return admin;
            default: 
                return tree;
        }
    }

}
