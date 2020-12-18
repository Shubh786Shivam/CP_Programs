public class Main {
    public static void main(String args[]) {
        probability();
    }
    public static void probability(){
        double n = 1;
        double probTillNow = 1;
        double probRequired = 0;

        while(Math.floor(probRequired*100) < 50){
            probTillNow *= (365 - n)/365;
            probRequired = 1 - probTillNow;
            n++;
        }

        System.out.println(n);
    }
}