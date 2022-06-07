// The code provided is supposed replace all the dots . in the specified String str with dashes -

// But it's not working properly.


public class Replace_Dots {
    
    public static void main(String args[])
    {

    }

    public static String replaceDots(final String str) {
        String s = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '.')
                s += '-';
            else
                s += str.charAt(i);
        }
        return s;
    }
}
