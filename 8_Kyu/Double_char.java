// Given a string, you have to return a string in which each character (case-sensitive) is repeated once.

class Double_char {
    public static void main(String args[])
    {
    //     String s = "Hello World";
    //    assertEquals("SSttrriinngg",Solution.doubleChar("String"));
    //    assertEquals("HHeelllloo  WWoorrlldd",Solution.doubleChar("Hello World"));
    //    assertEquals("11223344!!__  ",Solution.doubleChar("1234!_ "));
    }
    

    public static String doubleChar(String s) {
        String newstring = "";
        for (int i = 0; i < s.length(); i++) {
            newstring += s.substring(i, i + 1) + s.substring(i, i + 1);
        }
        return newstring;
    }
}