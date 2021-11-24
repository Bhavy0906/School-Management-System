import java.io.*;

public class Type {

    public int post() throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        Details details = new Details();
        details.loginDetails();
        int ch = Integer.parseInt(br.readLine());
        return ch;
    }
    
}
