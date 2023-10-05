/*
Write a java function to display
accum("abcd") -> "A-Bb-Ccc-Dddd"
accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
accum("cwAt") -> "C-Ww-Aaa-Tttt"
*/

public class Accumul {
    
    public static String accum(String s) {
     StringBuilder ans = new StringBuilder(); 
     for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      ans.append(Character.toUpperCase(c));
      for (int j = 0; j < i; j++) {
        ans.append(Character.toLowerCase(c));    
      }
      ans.append("-");
    }
    return ans.deleteCharAt(ans.length()-1).toString();
      }
}