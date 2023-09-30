/*
Take 2 strings s1 and s2 including only letters from a to z. Return a new sorted string, the longest possible, containing distinct letters - each taken only once - coming from s1 or s2.
Examples:

a = "xyaabbbccccdefww"
b = "xxxxyyyyabklmopq"
longest(a, b) -> "abcdefklmopqwxy"

a = "abcdefghijklmnopqrstuvwxyz"
longest(a, a) -> "abcdefghijklmnopqrstuvwxyz"
*/

public class TwoToOne {
    
    public static String longest (String s1, String s2) {
        int[] count = new int[26];
      
      for(char c: s1.toCharArray())     // Enhanced for loop
        count[c - 'a']++;
      
      for (char c: s2.toCharArray()) 
        count[c - 'a']++;
      
      StringBuilder result = new StringBuilder();
      
      for(int i = 0; i < 26; i++) {
        if (count[i] > 0) 
          result.append((char) (i + 'a'));
      }
      return result.toString();
    }
}