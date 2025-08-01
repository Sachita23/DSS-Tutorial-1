import java.util.Scanner;

public class MultiplicationTheorem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter P(A): ");
        double pA = sc.nextDouble();

        System.out.print("Enter P(B | A): ");
        double pBGivenA = sc.nextDouble();

        double result = pA * pBGivenA;
        System.out.println("P(A and B) = " + result);

        sc.close();
    }
}
