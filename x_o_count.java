/*
Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive. The string can contain any char.

Examples input/output:

XO("ooxx") => true
XO("xooxx") => false
XO("ooxXm") => true
XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
XO("zzoo") => false
*/

public class XO {
  
  public static boolean getXO (String str) {
    
    int no_x = 0;
    int no_o = 0;
    
    for(int i = 0; i < str.length(); i++) {
       char c = str.charAt(i);
      
       if(Character.toLowerCase(c) == 'x') {
         no_x++;
       } else if(Character.toLowerCase(c) == 'o') {
         no_o++;
       }
    }
    return no_x == no_o;
  }
}