import java.util.Scanner;

public class BayesTheorem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter P(A): ");
        double pA = sc.nextDouble();

        System.out.print("Enter P(B | A): ");
        double pBGivenA = sc.nextDouble();

        System.out.print("Enter P(B | not A): ");
        double pBGivenNotA = sc.nextDouble();

        double pNotA = 1 - pA;
        double pB = (pBGivenA * pA) + (pBGivenNotA * pNotA);
        double result = (pBGivenA * pA) / pB;

        System.out.printf("P(A | B) = %.4f\n", result);

        sc.close();
    }
}
