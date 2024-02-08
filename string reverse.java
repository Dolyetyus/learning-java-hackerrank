import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        System.out.println(Solve(A));
        sc.close();
    }
    
    public static String Solve(String A){
        StringBuffer sbr = new StringBuffer(A);
        sbr.reverse();
        
        if (A.equals(sbr.toString())){
            return "Yes";
        }
        else{
            return "No";
        }
    }
}
