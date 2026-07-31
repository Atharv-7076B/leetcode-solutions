import java.util.*;

class MyRegex {
    String pattern = "^((25[0-5]|2[0-4]\\d|1\\d\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[0-4]\\d|1\\d\\d|[01]?\\d\\d?)$";
}

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MyRegex myRegex = new MyRegex();

        while (in.hasNext()) {
            System.out.println(in.next().matches(myRegex.pattern));
        }

        in.close();
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna