import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int line = 1;
        
        while (scanner.hasNext()){
            String text = scanner.nextLine();
            System.out.printf("%d %s\n", line, text);
            line++;
        }
        
        scanner.close();
    }
}
