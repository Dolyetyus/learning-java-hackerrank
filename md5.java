import java.io.*;
import java.util.*;
import java.security.*;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hash = scanner.next();
        
        try{
            MessageDigest md=MessageDigest.getInstance("MD5");

            byte[] messageDigest = md.digest(hash.getBytes());
            BigInteger no = new BigInteger(1, messageDigest);
            
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            
            System.out.println(hashtext);
        }
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        
        scanner.close();
    }
}
