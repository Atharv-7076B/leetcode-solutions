public class Sum_of_each_digit {
    public static void main(String[] args) {
        int number = 123;
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        System.out.println(sum);
    }
}
