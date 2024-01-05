import java.util.Scanner;

public class VowelCounter {
    public static int countVowels(String inputString) {
        int vowelCount = 0;
        for (char character : inputString.toCharArray()) {
            if ("AEIOUaeiou".indexOf(character) != -1) {
                vowelCount++;
            }
        }
        return vowelCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputStr = scanner.nextLine();

        int result = countVowels(inputStr);
        System.out.println("The number of vowels in the given string is: " + result);

        scanner.close();
    }
}