public class Pattern19 {
    public static void main(String[] args) {
        int n = 5;
        int initialSpace= 2 * n - 2;
        // Upper Half
        for (int i = 0; i < n; i++) {
            // Stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            // Spaces
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half
        for (int i = 0; i < n; i++) {
            // Stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces
            for (int j = 0; j < initialSpace ; j++) {
                System.out.print(" ");
            }
            // //stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            initialSpace -=2;
            System.out.println();
        }
    }
}


//Output
// **********
// ****  ****
// ***    ***
// **      **
// *        *
// *        *
// **      **
// ***    ***
// ****  ****
// **********