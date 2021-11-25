import java.io.*;
import java.util.TreeMap;

public class Type {

    public TreeMap <String, String>  post() throws IOException {
        TreeMap <String, String> tree = new TreeMap<>();
        while (true) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Details details = new Details();
            details.loginDetails();
            int ch = Integer.parseInt(br.readLine());
            if (ch == 1 || ch == 2 || ch == 3) {
                MapReturn mp = new MapReturn();
                tree = mp.type(ch);
                break;
            } else {
                details.invalidLoginDetails();
            }

        }
        return tree;
    }

}
