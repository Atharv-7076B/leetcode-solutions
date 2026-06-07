public class Pattern16 {
    public static void main(String[] args) {
        int n = 5;
        char ch = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
            ch = ((char) (ch + 1));
        }
    }
}

// output:
// A
// B B
// C C C
// D D D D
// E E E E E