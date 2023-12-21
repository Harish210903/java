import java.util.Scanner;
class reverseWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String reversedString = reverseWord(input);


        System.out.println("Reverse String: " + reversedString);


        scanner.close();
    }

  
    private static String reverseWord(String input) {
        // Convert the string to a character array
        char[] charArray = input.toCharArray();

        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            // Swap characters at start and end positions
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

         
            start++;
            end--;
        }

        return new String(charArray);
    }
}
		