import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc  = new Scanner(System.in);
        int a  = 5;
        int n = 3;
        System.out.println(pow(a, n));
    }
    public static int pow(int a , int n){
        if(n == 0){
            return 1;
        }
        int subProblem = pow(a, n/2);
        if((n & 1) == 1){
            return a * subProblem * subProblem;
        }
        return subProblem * subProblem;
    }
}