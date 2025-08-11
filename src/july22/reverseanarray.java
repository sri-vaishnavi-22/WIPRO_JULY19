package july22;
import java.util.Scanner;
public class reverseanarray {

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

        // Reversing the array
        System.out.println("Array in reverse order:");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
