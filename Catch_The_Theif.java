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
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int k = sc.nextInt();
		    int n = sc.nextInt();
		    int num = Math.abs(x-y);
		    if(num % 2 == 0){
		        if((num % k == 0) && ((num/k) % 2 == 0))
		          System.out.println("Yes");
		        else
		          System.out.println("No");
		    }
		    else
		        System.out.println("No");
		    
		    
		  
		  
		}
	}
}
