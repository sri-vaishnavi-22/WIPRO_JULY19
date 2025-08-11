package july21;
import java.util.Scanner;
public class multiplicationtableusingforloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	



        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        sc.close();
    }
}
