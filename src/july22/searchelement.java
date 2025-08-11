package july22;
import java.util.Scanner;
public class searchelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
        Scanner sc = new Scanner(System.in);

        // Taking array input
        System.out.print("Enter size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Element to search
        System.out.print("Enter element to search: ");
        int searchElement = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (arr[i] == searchElement) {
                System.out.println(searchElement + " found at position " + (i + 1));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(searchElement + " not found in the array.");
        }

        sc.close();
    }
}
