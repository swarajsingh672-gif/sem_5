import java.util.Scanner;

public class LCMPrimeFactorization {
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int a = num1, b = num2;
        int lcm = 1;
        int prime = 2; // start with smallest prime

        while (a > 1 || b > 1) {
            if (a % prime == 0 || b % prime == 0) {
                lcm *= prime;
                if (a % prime == 0) {
                    a /= prime;
                }
                if (b % prime == 0) {
                    b /= prime;
                }
            } else {
                prime++; // check next number
            }
        }

        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
}
