import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (scanner.hasNext()){
            String ip = scanner.nextLine();
            System.out.println(Solve(ip));
        }
    }
    
    public static boolean Solve(String ip){
        MyRegex regex = new MyRegex();
        
        if (ip.matches(regex.pattern)) {
            return true;
        }
        else{
            return false;
        }
    }
    
    private static class MyRegex {
        String pattern = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$"; //idk about regex patterns
    }
}
