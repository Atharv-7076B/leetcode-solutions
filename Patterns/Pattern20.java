public class Pattern20 {
    public static void main(String[] args) {
        int n = 5;
        int initialspace = 2 * n - 2;

        // Upper half
        for (int i = 0; i < n; i++) {
            // stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 0; j < initialspace; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            initialspace -= 2;
            System.out.println();
        }
        // Lower half
        for (int i = 0; i < n; i++) {
            // Stars
            for (int j = 1; j <= n - i - 1; j++) {
                System.out.print("*");
            }
            // Spaces
            for (int j = 0; j <= 2 * i + 1; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//output
// *        *
// **      **
// ***    ***
// ****  ****
// **********
// ****  ****
// ***    ***
// **      **
// *        *