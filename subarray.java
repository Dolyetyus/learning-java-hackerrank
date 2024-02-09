import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();;
        }
        scan.close();
        
        int count = 0;
        
        for (int i=0; i<a.length; i++){
            for (int ii = i; ii<a.length; ii++) {
                int temp = 0;
                for (int iii = i; iii <= ii; iii++) {
                    temp += a[iii];
                }
                
                if (temp<0) count++;
            }
        }
        
        System.out.println(count);
    }
}
