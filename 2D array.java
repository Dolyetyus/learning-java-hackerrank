import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } 
            catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        
        Solve(arr);

        bufferedReader.close();
    }
    
    public static void Solve(List<List<Integer>> arr){
        int sum = -9999999;
        for (int i = 1; i<5; i++){
            for (int ii = 1; ii<5; ii++){
                int temp = computeAdjacentSum(arr, i, ii);
                temp -= arr.get(i).get(ii-1)+arr.get(i).get(ii+1);
                if (temp>sum) sum = temp;
            }
        }
        
        System.out.println(sum);
    }
    
    private static int computeAdjacentSum(List<List<Integer>> arr, int row, int col) {
        int sum = 0;

        for (int i = row - 1; i<=row+1; i++) {
            for (int ii = col - 1; ii <= col + 1; ii++) {
                if (i>=0 && i<arr.size() && ii>=0 && ii<arr.get(i).size()) {
                    sum += arr.get(i).get(ii);
                }
            }
        }

        return sum;
    }
}
