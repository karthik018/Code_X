import java.util.*;
import java.lang.*;
import java.io.*;
class CheckPower
 {
	public static void main (String[] args)
	 {
	    Scanner in = new Scanner(System.in);
	    int t = in.nextInt();
	    for(int i = 0; i < t; i++){
	        int res = 0;
	        int x = in.nextInt();
	        int y = in.nextInt();
	        float temp = (float)y;
	        if(x == 1)
	            res = 0;
	        else{
	            while(temp > 1){
	                temp /= x;
	            }
	            if(temp == 1)
	                res = 1;
	            else
	                res = 0;
	        }
	        System.out.println(res);
	    }
	 }
}
