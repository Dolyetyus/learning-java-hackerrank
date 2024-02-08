import java.util.Scanner;
import java.util.Arrays;

public class Solution {

    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        int[] countA = new int[26];
        int[] countB = new int[26];

        for (char ch: a.toCharArray()) {
            if (Character.isLetter(ch)) {
                countA[ch - 'a']++;
            }
        }

        for (char ch: b.toCharArray()) {
            if (Character.isLetter(ch)) {
                countB[ch - 'a']++;
            }
        }

        return Arrays.equals(countA, countB);
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
