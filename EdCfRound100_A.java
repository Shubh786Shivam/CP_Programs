import java.util.*;
public class Main {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       while(t-- > 0){
           int a = sc.nextInt();
           int b = sc.nextInt();
           int c = sc.nextInt();
           int totalDamage = a + b + c;
           int k = totalDamage/9;
           int min = Math.min(a, Math.min(b, c));
           if(totalDamage % 9 == 0 && min >= k)
              System.out.println("Yes");
            else
                System.out.println("No");
            
       }

    }
}