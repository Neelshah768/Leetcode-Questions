import java.util.Stack;

/*

    20. Valid Parentheses

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


Example 1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true

Example 3:

Input: s = "(]"

Output: false

Example 4:

Input: s = "([])"

Output: true

Example 5:

Input: s = "([)]"

Output: false



Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.


 */
public class ValidParentheses {
    public static boolean checkClosingBracket(char c, Stack<Character> stack){

        if(stack.empty()){
            return false;
        }
        if(c == ')' && stack.peek() == '('){
            stack.pop();
            return true;
        } else if (c == ']' && stack.peek() == '[') {
            stack.pop();
            return true;
        } else if (c == '}' && stack.peek() == '{') {
            stack.pop();
            return true;
        }
        return false;
    }

    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<Character>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }else{
//                boolean result = checkClosingBracket(s.charAt(i),stack);
                if(!checkClosingBracket(s.charAt(i),stack)){
                    return false;
                }
            }

        }

        if(stack.empty()){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {

//        String s = "()";
//        String s = "()[]{}";
//        String s = "(]";
//        String s = "([])";
//        String s = "([)]";
        String s = "]";
        boolean result = isValid(s);
        System.out.println(result);
    }
}
