import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        Set<Integer> set = new HashSet<>();
        
        int n = in.nextInt();
        int m = in.nextInt();
        int unique = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            set.add(num);
            
            if (deque.size() == m+1) {
                int top = deque.remove();
                if (!deque.contains(top)) {
                    set.remove(top);
                }
            }
            
            if (deque.size() == m) {
                unique = Math.max(unique, set.size());
            }
        }
        
        System.out.println(unique);
        in.close();
    }
}
