package july21;
import java.util.Scanner;
public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int first = 0, second = 1;
        System.out.print(first + " " + second);

        for (int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.print(" " + next);
            first = second;
            second = next;
        }
        sc.close();
    }
}
