import java.util.Arrays;

/*

     14. Longest Common Prefix

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".



Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.


Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters if it is non-empty.

 */
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs){
        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length-1];

        int minLen = Math.min(first.length(),last.length());

        int i=0;
        while(i<minLen && first.charAt(i) == last.charAt(i)){
            i++;
        }

        return first.substring(0,i);
    }
    public static void main(String[] args) {

        String[] s = {"flower","flow","flight"};
//        String[] s = {"dog","racecar","car"};
        String result = longestCommonPrefix(s);
        System.out.println(result);
    }
}
