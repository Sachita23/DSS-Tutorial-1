import java.util.Scanner;

public class AdditionTheorem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter P(A): ");
        double pA = sc.nextDouble();

        System.out.print("Enter P(B): ");
        double pB = sc.nextDouble();

        System.out.print("Enter P(A and B): ");
        double pAandB = sc.nextDouble();

        double result = pA + pB - pAandB;
        System.out.println("P(A or B) = " + result);

        sc.close();
    }
}
