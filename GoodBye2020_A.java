import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();

            }
            Set<Integer> s 
            = new HashSet<Integer>(); 

            for(int i = 0; i < n-1; i++){
               for(int j = i+1; j < n; j++){
                    s.add(Math.abs(a[i] - a[j]));
               }

            }
            System.out.println(s.size());
        }
    }
}