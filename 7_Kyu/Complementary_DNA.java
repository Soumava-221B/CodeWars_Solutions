/*
Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and carries the "instructions" for the development and functioning of living organisms.

If you want to know more: http://en.wikipedia.org/wiki/DNA

In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G". Your function receives one side of the DNA (string, except for Haskell); you need to return the other complementary side. DNA strand is never empty or there is no DNA at all (again, except for Haskell).

More similar exercise are found here: http://rosalind.info/problems/list-view/ (source)

Example: (input --> output)

"ATTGC" --> "TAACG"
"GTAT" --> "CATA"


*/

public class DnaStrand {
  public static String makeComplement(String dna) {
    char[] chars = dna.toCharArray();
      int i = 0;
      for (char chr : chars) {
        if (chr == 'A')
          chars[i] = 'T';
        else if (chr == 'T')
          chars[i] = 'A';
        else if (chr == 'G')
          chars[i] = 'C';
        else if (chr == 'C')
          chars[i] = 'G';
        i++;
      }
    String str = new String(chars);
    return str;
  }
}