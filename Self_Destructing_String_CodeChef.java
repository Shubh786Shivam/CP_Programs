/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner sc = new Scanner(System.in);
	   int t = sc.nextInt();
	   while(t-- > 0){
	       String str = sc.next();
	       if(str.length() % 2 == 1){
	           System.out.println("-1");
	           continue;
	       }
	       int cnt1 = 0;
	       int cnt0 = 0;
	       for(int i = 0; i < str.length(); i++){
	           char ch = str.charAt(i);
	           if(ch == '1'){
	               cnt1++;
	           }
	           else{
	               cnt0++;
	           }
	       }
	       if(cnt0 == 0 || cnt1 == 0){
	           System.out.println("-1");
	           continue;
	       }
	       if(cnt0 == cnt1)
	          System.out.println("0");
	       else{
	       int num = str.length()/2;
	       System.out.println(Math.abs(num - cnt0));
	       }
	       
	   }
	}
}
