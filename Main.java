import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            // Step 1: find minimum value M
            int min = a[0];
            for (int i = 1; i < n; i++) {
                if (a[i] < min) {
                    min = a[i];
                }
            }

            // Step 2: count how many elements are greater than M
            int operations = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] > min) {
                    operations++;
                }
            }

            // Step 3: print result
            System.out.println(operations);
        }
    }
}
