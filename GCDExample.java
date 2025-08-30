public class GCDExample {

    // Function to find GCD using Euclidean algorithm
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int a1 = 20, b1 = 28;
        System.out.println("GCD of " + a1 + " and " + b1 + " is " + gcd(a1, b1));

        int a2 = 60, b2 = 36;
        System.out.println("GCD of " + a2 + " and " + b2 + " is " + gcd(a2, b2));
    }
}
