import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            a.add(new ArrayList<>());
            int m = scan.nextInt();
            for (int ii = 0; ii < m; ii++) {
                a.get(i).add(scan.nextInt());
            }
        }
        
        int queries = scan.nextInt();
        
        for (int i = 0; i<queries; i++) {
            int first = scan.nextInt();
            int second = scan.nextInt();
            
            try{
                System.out.println(a.get(first-1).get(second-1));
            }
            catch(Exception e){
                System.out.println("ERROR!");
            }
        }
        
        scan.close();
    }
}
