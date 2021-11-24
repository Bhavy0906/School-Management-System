/**
 * Teacher
 */

import java.util.*;

public class Teacher extends User{
    private String name;
    private String id;
    Set <String> idOfStudents = new TreeSet<String>();
    private String marks;
    private String grades;
    private String attendence;
    TreeMap <String, String[]> detailMap = new TreeMap<>();

    public Teacher ()
    {

    }

    public Teacher(String id, String name){
        this.id = id;
        this.name = name;
        User.teacher.put(id, name);
        marks = "";
        grades = "NC";
        attendence = "";
    } 

    public void basicDetails ()
    {
        System.out.println("Hello " + name);
        System.out.println("Welcome to the school");
        System.out.println("Enter 1 for ");
    }
    
    void idOfStudent(){
        idOfStudents = getIDStudent();
    }

    void setDetails(String id, String course, String marks, String grade, String attendence){
        String[] details = {course, marks, grade, attendence};
        detailMap.put(id, details);
    }   
    

}