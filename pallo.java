public class PalindromeNumber {

    public static boolean isPalindrome(int num) {
        int originalNum = num; // Store the original number
        int reverse = 0;

        while (num != 0) {
            int lastDigit = num % 10; // Get the last digit
            reverse = reverse * 10 + lastDigit; // Build the reversed number
            num /= 10; // Remove the last digit from the original number
        }

        return originalNum == reverse; // Compare original and reversed numbers
    }

    public static void main(String[] args) {
        int number1 = 12321;
        int number2 = 12345;

        if (isPalindrome(number1)) {
            System.out.println(number1 + " is a palindrome number.");
        } else {
            System.out.println(number1 + " is not a palindrome number.");
        }

        if (isPalindrome(number2)) {
            System.out.println(number2 + " is a palindrome number.");
        } else {
            System.out.println(number2 + " is not a palindrome number.");
        }
    }
}
