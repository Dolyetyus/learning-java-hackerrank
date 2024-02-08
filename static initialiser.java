import java.io.*;
import java.util.*;

public class Solution {

    static Scanner scan = new Scanner(System.in);
    static int B = scan.nextInt();
    static int H = scan.nextInt();
    static boolean end = true;
    
    static{
        try{
            if(B <= 0 || H <= 0){
                end = false;
                throw new Exception("Breadth and height must be positive");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
    public static void main(String[] args){
        int area = B*H;
        if (end) System.out.print(area);  
    }

}
