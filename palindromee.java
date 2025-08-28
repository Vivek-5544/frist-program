import java.util.Scanner;

public class Palindromee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Convert to lowercase and remove spaces (optional, for clean checking)
        str = str.replaceAll("\\s+", "").toLowerCase();

        // Check palindrome
        if (isPalindrome(str)) {
            System.out.println("Yes, it is a palindrome.");
        } else {
            System.out.println("No, it is not a palindrome.");
        }

        sc.close();
    }

    // Function to check palindrome
    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false; // mismatch found
            }
            left++;
            right--;
        }
        return true; // no mismatch found
    }
}
