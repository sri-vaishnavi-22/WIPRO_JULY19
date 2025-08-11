package july31;

public class program1 {

    public static void main(String[] args) {
        String input = "a2b3c4";
        StringBuilder output = new StringBuilder();

        // Loop through the input string by 2 characters at a time
        for (int i = 0; i < input.length(); i += 2) {
            char ch = input.charAt(i); // character
            int count = Character.getNumericValue(input.charAt(i + 1)); // digit to repeat

            // Append the character 'count' times to output
            for (int j = 0; j < count; j++) {
                output.append(ch);
            }
        }

        System.out.println(output.toString());
    }
}
