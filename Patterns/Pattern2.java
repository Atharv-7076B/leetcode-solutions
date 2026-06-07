public class Pattern2 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            // Here we want to print the * which is less than or equal to i for each row
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// Output:
// *
// * *
// * * *
// * * * *
// * * * * *