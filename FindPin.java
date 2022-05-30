/*
Find PIN:

You are at Level-1 of a Maths game.

You are provided with 4 numbers: input1, input2, input3 and input4 and are expected to find a secret PIN

The three numbers input1, input2 and input3 are four digit numbers within the range

>=1000 and <-9999, i.e.
1000 <=input1 <= 9999
1000 <=input2 <= 9999
1000<input3 <= 9999

input4 is a positive integer number.

PIN = ((MAX digit of input1 x MIN digit of input1) x (MAX digit of input2 x MIN digit of input2) x (MAX digit of input3 x MIN digit of input3)) - input4

Example - If input1 = 3521, input2=2452, input3=1352, and input4=38, then PIN = ((5 x 1) x (5 x2) x (5x 1)) - 38 = (5 x 10 x 5) - 38 = 212

Assuming that the 4 numbers are passed to the given function, Complete the function to find and return the PIN.
*/

import java.util.*;
public class Main
{
    public static int digit(int a){
        int mini=Integer.MAX_VALUE,maxi=Integer.MIN_VALUE;
        while(a>0){
            int temp = a%10;
            mini=Math.min(mini,temp);
            maxi=Math.max(maxi,temp);
            a/=10;
        }
        return maxi*mini;
        
    }
	public static void main(String[] args) {
	    int a,b,c,d;
	    Scanner sc = new Scanner(System.in);
	    a=sc.nextInt();
	    b=sc.nextInt();
	    c=sc.nextInt();
	    d=sc.nextInt();
	    int res1=digit(a);
	    int res2=digit(b);
	    int res3=digit(c);
	    System.out.println((res1*res2*res3)-d);
	    
	}
}
