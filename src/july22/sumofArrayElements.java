package july22;
import java.util.Scanner;
public class sumofArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);

        // Input array
        System.out.print("Enter size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Calculating sum
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        System.out.println("Sum of array elements: " + sum);

        sc.close();
    }
}
