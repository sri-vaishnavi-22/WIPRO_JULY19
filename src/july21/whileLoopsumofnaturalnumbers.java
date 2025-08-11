package july21;
import java.util.Scanner; // Import Scanner class

public class whileLoopsumofnaturalnumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum += i; // sum = sum + i
            i++;
        }

        System.out.println("Sum of first " + n + " natural numbers = " + sum);
        sc.close();
    }
}
