package july31;

public class program3 {

    public static void main(String[] args) {
        String input = "swiss";  // You can change this to test other strings
        char result = firstNonRepeatingChar(input);

        if (result == '\0') {
            System.out.println("No non-repeating character found.");
        } else {
            System.out.println("First non-repeating character is: " + result);
        }
    }

    public static char firstNonRepeatingChar(String str) {
        int[] charCount = new int[256];  // ASCII character count

        // Count frequency of each character
        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }

        // Find first character with count 1
        for (int i = 0; i < str.length(); i++) {
            if (charCount[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }

        return '\0';  // Return null char if none found
    }
}
