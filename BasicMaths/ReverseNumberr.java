package BasicMaths;

public class ReverseNumberr {
    public static void main(String[] args) {
        int n = 123456;
        int revnum = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            revnum = revnum * 10 + lastDigit;
            n /= 10;
        }

        System.out.println(revnum);
    }
}
