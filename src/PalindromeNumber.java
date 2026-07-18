/*
Given an integer x, return true if x is a palindrome, and false otherwise.



        Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
        Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

Constraints:

-231 <= x <= 231 - 1


Follow up: Could you solve it without converting the integer to a string?

*/


public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        int sum = 0;
        int temp = x;

        while(x >0){
            sum = sum *10 +(x%10);

            x=x/10;
        }
        if(sum == temp){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int x = 121;
//        int x = 10;
//        int x = -121;

        boolean result = isPalindrome(x);
        System.out.println(result);
    }
}
