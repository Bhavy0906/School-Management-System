import java.io.*;

//Displays the basic information and various print statements guiding the user through the code.

public class Details {

    public void basicDisplay ()
    {
        System.out.println("******************Welcome to Birla Institute of Technology and Science******************");
        System.out.println("The School welcomes you ");


        System.out.println("");
    }

    public void loginDetails ()
    {
        System.out.println("Please enter 1 if you are student, 2 if you are a teacher, and 3 if you are the admin");
    }

    public void invalidLoginDetails ()
    {
        System.out.println("The value entered cannot be recognised by the system.");
        System.out.println("Please check it once and try again");
    }

    public void signupDetails ()
    {
        System.out.println("Enter ");
    }

    public void enterLogin ()
    {
        System.out.println("Enter 1 if you are an existing user and want to login into you system");
    }
    public void enterSignup(){
        System.out.println("Enter 1 for Student Signup.           Enter 2 for Teacher Signup.");
    }
    
    public void incorrectPassword(){
        System.out.println("\n**Incorrect password, Please enter again**");
    }

    // public void studentSignup(){
    //     System.out.println("\nEnter 1 to add a new Student");
    // }

    // public void teacherSignup(){
    //     System.out.println("Enter 2 to add a new Teacher");
    // }
}
