package BasicMaths;

public class AmstrongNum {
    public static void main(String[] args) {
        int n = 153;
        int originalNum = n;
        int k = String.valueOf(n).length();
        int num = 0;
        while (n > 0) {
            int ld = n % 10;
            num += Math.pow(ld, k);
            n /= 10;
        }
        System.out.println(num == originalNum);
    }
}
