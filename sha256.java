import java.io.*;
import java.util.*;
import java.security.*;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String hash = scanner.next();
        
        try{
            MessageDigest m = MessageDigest.getInstance("SHA-256");
            m.reset();
            m.update(scanner.nextLine().getBytes());
            for (byte i : m.digest()) {
                System.out.print(String.format("%02x", i));
            }
        }
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        
        scanner.close();
    }
}
