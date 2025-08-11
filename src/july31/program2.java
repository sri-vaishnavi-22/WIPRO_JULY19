package july31;

public class program2 {

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1}; // Sample array
        int secondLargest = findSecondLargest(arr);
        
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("Second largest number is: " + secondLargest);
        }
    }
    
    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }
        
        return secondLargest;
    }
}
