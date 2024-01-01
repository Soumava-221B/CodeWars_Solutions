/*
Complete the solution so that the function will break up camel casing, using a space between words.
Example

"camelCasing"  =>  "camel Casing"
"identifier"   =>  "identifier"
""             =>  ""

*/

class Solution {
  public static String camelCase(String input) {
    StringBuilder builder = new StringBuilder();
    for (char c : input.toCharArray()) {
      if (Character.isUpperCase(c)) {
        builder.append(" ");
      }
      builder.append(c);
    }
    return builder.toString();
  }
}