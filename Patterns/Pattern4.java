public class Pattern4 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                // Print the i because Outer will run for one and inner will for less or equal to i
                //  so print i
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

// Output:
// 1
// 2 2
// 3 3 3
// 4 4 4 4
// 5 5 5 5 5