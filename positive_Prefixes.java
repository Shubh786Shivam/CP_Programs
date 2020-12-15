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
		int t  = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    int num = 0;
		    if(n % 2 == 0){
		        num = n/2;
		    }
		    else{
		        num = n/2 + 1;
		    }
		    ArrayList<Integer> list = new ArrayList<>();
		    for(int i = 0; i < n; i++){
		            if(i % 2 == 0){
		                list.add(i+1);
		            }
		            else{
		                list.add(-(i+1));
		            }
		        }
		        
		    if(num == k){
		        for(int l = 0; l < n; l++){
		            System.out.print(list.get(l) + " ");
		        }
		        System.out.println();
		        break;
		        
		    }
		    
		    if(num > k){
		        int cnt = num -k;
		        int j = 0;
		        for(int i = list.size() - 1; i >= 0; i--){
		            if(list.get(i) > 0 && j < cnt){
		                list.set(i, -(i+1));
		                j++;
		            }
		        }
		        
		        
		    }
		    if(num < k){
		        int cnt = k-num;
		        int j = 0;
		         
		        for(int i = list.size() - 1; i >= 0; i--){
		            if(list.get(i) < 0 && j < cnt){
		                list.set(i, (i+1));
		                j++;
		            }
		        }
		       
		    }
		    for(int l = 0; l < n; l++){
		            System.out.print(list.get(l) + " ");
		        }
		        System.out.println();
		        
		}
	}
}
