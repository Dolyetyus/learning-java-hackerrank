import java.io.*;
import java.util.*;
import java.math.BigDecimal;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String a = scanner.next();
        String b = scanner.next();
        
        BigDecimal ab = new BigDecimal(a);
        BigDecimal bb = new BigDecimal(b);
        
        System.out.println(ab.add(bb));
        System.out.println(ab.multiply(bb));
        
        scanner.close();
    }
}
