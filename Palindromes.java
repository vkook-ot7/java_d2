import java.util.Scanner;

public class Palindromes {
    
    // Method to check palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // mismatch found
            }
            left++;
            right--;
        }
        return true; // all characters matched
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        if (isPalindrome(word)) {
            System.out.println(word + " is a palindrome!");
        } else {
            System.out.println(word + " is NOT a palindrome.");
        }

        sc.close();
    }
}