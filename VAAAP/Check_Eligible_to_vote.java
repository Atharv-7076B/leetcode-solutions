import java.util.Scanner;

public class Check_Eligible_to_vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age:");
        int age = sc.nextInt();

        if (age < 18)
            System.out.println("Not Eligible");
        else
            System.out.println("Eligible");
        sc.close();
    }
}