package july31;

public class program4 {

    public static void main(String[] args) {
        System.out.println("Numbers from 1 to 100:");
        printAscending(1, 100);

        System.out.println("\nNumbers from 100 to 1:");
        printDescending(100);
    }

    // Recursive method to print from start to end
    public static void printAscending(int current, int end) {
        if (current > end) {
            return;
        }
        System.out.print(current + " ");
        printAscending(current + 1, end);
    }

    // Recursive method to print from n down to 1
    public static void printDescending(int n) {
        if (n < 1) {
            return;
        }
        System.out.print(n + " ");
        printDescending(n - 1);
    }
}
