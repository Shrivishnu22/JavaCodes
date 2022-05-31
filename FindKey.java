/*Find Key:

You are provided with 3 numbers inputt, input2 and input3. Each of these are four digit numbers within the range 
>= 1000 and <-9999
1000<inputt < 9999
1000<input2- 9999
1000<input3 - 9999

You are expected to find the Key using the below formula
Key (Thousands digit of inputt x Hundreds digit of input2)+(Smallest digit of input3)
For e g it inputt-3521 input2-2452 input3-1352, then Key (3 x 4)+1=13
Assuming that the 3 numbers are passed to the given function Complete the function to find and return the Key

*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int input1 = 3521;
	    int input2 = 2452;
	    int input3 = 1352;
	    int min=10;
	    int a = input1/1000;
	    int b = input2/100;
	    b=b%10;
	    while(input3>0)
	    {
	        int rem = input3%10;
	        if(min>rem){
	            min=rem;
	        }
	        input3/=10;
	    }
	    System.out.println((a*b)+min);
	}
}

//OUTPUT:
13
