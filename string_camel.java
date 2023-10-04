/*
Complete the method/function so that it converts dash/underscore delimited words into camel casing. The first word within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case). The next words should be always capitalized.
Examples

"the-stealth-warrior" gets converted to "theStealthWarrior"

"The_Stealth_Warrior" gets converted to "TheStealthWarrior"

"The_Stealth-Warrior" gets converted to "TheStealthWarrior
*/

import java.lang.StringBuilder;
class Solution{

  static String toCamelCase(String s){
     StringBuilder result = new StringBuilder();

      boolean nextUpper = false;

      for (char c : s.toCharArray()) {

        if (c == '-' || c == '_') {
          nextUpper = true;
          continue;
        } 

        if (nextUpper) {
          result.append(Character.toUpperCase(c));
          nextUpper = false;
        } else {
          result.append(c);  
        }
      }

      return result.toString();  
  }
}