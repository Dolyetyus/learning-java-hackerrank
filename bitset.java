import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        
        while(m !=0) {
            m--;
            
            String op = scan.next();
            int op1 = scan.nextInt();
            int op2 = scan.nextInt();
            
            switch(op) {
                case "AND" :
                   if(op1 == 1){
                       b1.and(b2);
                       break;
                   }
                   b2.and(b1);
                   break;
                   
                case "OR"  :
                    if(op1 == 1) {
                        b1.or(b2);
                        break;
                    }
                    b2.or(b1);
                    break;
                    
                case "XOR" :
                    if(op1 == 1) {
                        b1.xor(b2);
                        break;
                    }
                    b2.xor(b1);
                    break;
                    
                case "FLIP":
                    if(op1 == 1) {
                        b1.flip(op2);
                        break;
                    }
                    b2.flip(op2);
                    break;
                    
                case "SET" :
                    if(op1 == 1) {
                        b1.set(op2);
                        break;
                    }
                    b2.set(op2);
                    break;
            }
            System.out.println(b1.cardinality()+" "+b2.cardinality());
        }
        scan.close();
    }
}
