package july21;
import java.util.Scanner;

public class divisibleby5and11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 5 == 0 && num % 11 == 0) {
            System.out.println(num + " is divisible by both 5 and 11");
        } 
        else if (num % 5 == 0) {
            System.out.println(num + " is divisible only by 5");
        } 
        else if (num % 11 == 0) {
            System.out.println(num + " is divisible only by 11");
        } 
        else {
            System.out.println(num + " is not divisible by 5 or 11");
        }

        sc.close();
    }
}

