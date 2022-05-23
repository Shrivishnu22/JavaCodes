/*
Find SumeetSum: Sum of largest 3-digit numbers from given 5 numbers

Given 5 input numbers, Sumeet has to find the sum of the largest numbers that can be produced using 3 digits from each of the above 5 numbers. 

Example-1

If the 5 input numbers are 23792, 37221, 10270, 73391 and 12005,

The largest numbers that can be produced using 3 digits from each of these are 973, 732, 721, 973 and 521 respectively, and the sum of these largest numbers will be 3920 Therefore, the expected result is 3920

Example-2

If the 5 input numbers are 26674, 105, 37943, 95278 and 27845 The largest numbers that can be produced using 3 digits from each of these are 766, 510, 974, 987 and 875 respectively, and the sum of these largest numbers will be 4112. Therefore, the expected result is 4112.

NOTE All the given 5 numbers will be >=100 and <=99999

*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int arr[] = new int[5];
	    int out[] = new int[5];
	    int output=0;
	    Scanner sc = new Scanner(System.in);
	    for(int i=0;i<5;i++){
	        arr[i]=sc.nextInt();
	    }
	    for(int i=0;i<5;i++){
	        int num = arr[i];
	        int number=0,index=0;
	        int res[] = new int[5];
	        while(num>0){
	            int digit = num%10;
	            res[index]=digit;
	            num/=10;
	            index++;
	        }
	        Arrays.sort(res);
	        for(int k=4;k>1;k--){
	            number = ((number * 10) + res[k]);
	        }
	        out[i]=number;
	    }
	    for(int i=0;i<5;i++){
	        output+=out[i];
	    }
	    System.out.println(output);
	}
}
