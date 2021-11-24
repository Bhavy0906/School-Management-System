import java.io.*;

public class Input {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public String userID() throws IOException {
        System.out.println("Enter the user id");
        return br.readLine();
    }

    public String password() throws IOException {
        passwordDetails();
        String pass = br.readLine();
        boolean valid = passwordCheck(pass);
        if (valid)
            return pass;
        return "";
    }

    public void passwordDetails() {
        System.out.println("Enter the password");
        System.out.println(
            "The password should be atleast 8 characters long and the maximum length of the password should be 15 characters");
        System.out.println(
            "The password should contain atleast one uppercase letter, one lowercase letter, and one numeric character");
    }

    public boolean passwordCheck(String pass) {
        boolean capital = false;
        boolean small = false;
        boolean number = false;
        int len = pass.length();

        if (len < 8 || len > 15) {
            return false;
        }

        for (int i = 0; i < len; i++) {
            char ch = pass.charAt(i);
            if (Character.isLowerCase(ch))
                small = true;
            if (Character.isUpperCase(ch))
                capital = true;
            if (Character.isDigit(ch))
                number = true;
            if (capital && small && number) {
                return true;
            }
        }
        return false;
    }
}
