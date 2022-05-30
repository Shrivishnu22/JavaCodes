/*
Find sum of all prime numbers in the array, except the largest prime number:

Madhav has been assigned the task of finding the sum of all prime numbers in a given array, except the largest prime number in the array. Madhav approaches you to help him do this by writing a program.

Given an array of numbers, you are expected to find the sum of all prime numbers in the given array. You must however exclude the largest prime number while performing this addition.

For Example -

If input1={10,41,18,50,43,31,29,25,59,96,67) representing the given array, and, input2 = 11 representing the number of elements in the array, then the expected output is 203, which is the sum of all prime numbers in this array except the largest prime number 67.

Explanation: The prime numbers in this array are 41, 43, 31, 29, 59 and 67.

The largest prime number in this array is 67. So, let us leave out 67 and add all the other prime numbers to get the output.

Therefore, output = 41+43+31+29+59 = 203

Special conditions to be taken care:

Note: If the array does NOT contain any prime number, the output should be the sum of all numbers in the array except the largest number.

For example, If input1={10,20,30,40) and input2 = 4 representing the number of elements in the array, then the expected output = 10+20+30= 60.
*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int len,res=0,maxi=0;
	    boolean flag=true;
	    Scanner sc = new Scanner(System.in);
	    len=sc.nextInt();
	    int arr[] = new int[len];
	    for(int i=0;i<len;i++){
	        arr[i]=sc.nextInt();
	    }
	    Arrays.sort(arr);
	    for(int i=0;i<len;i++){
	        flag=true;
	        for(int j=2;j*j<=arr[i];j++){
	            if(arr[i]%j==0){
	                flag=false;
	                break;
	            }
	        }
	        if(flag){
	           res+=arr[i];
	           maxi=arr[i];
	       }
	    }
	    System.out.println(res-maxi);
	}
}
