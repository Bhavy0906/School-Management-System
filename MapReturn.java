import java.util.*;

public class MapReturn extends User {
    
    public TreeMap type (int ch)
    {
        TreeMap <String, String> tree = new TreeMap<>();
        switch (ch)
        {
            case 1:
            tree = super.student;
            break;
            case 2:
            tree = super.teacher;
            break;
            case 3:
            tree = super.admin;
            break;
        }
        return tree;
    }

}
