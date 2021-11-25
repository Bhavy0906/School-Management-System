import java.util.*;

public class Index {

    // Linear-search function to find the index of an element
    public int findIndex(String arr[], String t) {

       
        // find length of array
        int len = arr.length;
        int i = 0;

        // traverse in the array
        while (i < len) {

            // if the i-th element is t
            // then return the index
            if (arr[i].equals(t)) {
                return i;
            } else {
                i = i + 1;
            }
        }
        return -1;
    }
}
