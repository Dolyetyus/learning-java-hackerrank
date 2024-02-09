import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> a = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            int num = scan.nextInt();
            a.add(num);
        }
        
        int m = scan.nextInt();
        while (m>0){
            m--;
            
            String command = scan.next();
            int where = scan.nextInt();
            
            if (command.equals("Insert")){
                int what = scan.nextInt();
                a.add(where, what);
            }
            else{
                a.remove(where);
            }
        }
        
        scan.close();
        
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i)+" ");
        }
    }
}
