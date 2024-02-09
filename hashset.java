import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        Map<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < t; i++) {
            String pair = pair_left[i] + ", " + pair_right[i];
            map.put(pair, map.getOrDefault(pair, 0) + 1);
            System.out.println(map.size());
        }

        s.close();
   }
}
