/*
The scenario is as below

Five numbers are available with the kids.
These numbers are either stable or unstable.

A number is stable if each of its digit occur the same number of times, i.e. the frequency of each digit in the number is the same. For e.g. 2277, 4004, 11, 23,
583835, 1010 are examples of stable numbers.

Similarly. A number is unstable if the frequency of each digit in the number is NOT the same. For e g. 221, 4314, 101, 233, 58135, 101 are examples of unstable numbers..
The password can be found as below

password = Maximum of all stable numbers - Minimum of all Unstable numbers

Assuming that the five numbers are passed to a function as input1, input2, input3, input4 and inputs, complete the function to find and return the password For Example
If input1 = 12, input2 = 1313, Input3= 122, input4= 678, and input5 898. = stable numbers are 12. 1313 and 678
unstable numbers are 122 and 898

So, the password should be = Maximum of all stable numbers - Minimum of
all Unstable numbers 1313-122=1191
*/

import java.util.*;
public class Main
{
	public static int isStable(int n) {
	    int arr[] = {0,0,0,0,0,0,0,0,0,0};
	    int l=n;
	    while(n>0){
	        int digit = n% 10;
	        arr[digit]++;
	        n/=10;
	    }
	    ArrayList<Integer>res=new ArrayList<Integer>();
	    Boolean flag = true;
	    for(int i=0; i<arr.length; i++)
	    {
	        if(arr[i]!=0){
	            res.add(arr[i]);
	        }
	    }
	    for(int j=0; j<res.size()-1; j++)
	    {
	        if(res.get(j)!=res.get(j+1))
	        {
	            flag=false;
	            break;
	        }
	    }
	    if(flag){
	        return l;
	    }else{
	        return 0;
	    }
	}
	    public static void main(String args[])
	    {
	        Scanner sc = new Scanner(System.in);
	        int a=sc.nextInt();
	        int b=sc.nextInt();
	        int c=sc.nextInt();
	        int d=sc.nextInt();
	        int e=sc.nextInt();
	        ArrayList<Integer> S = new ArrayList<Integer> ();
	        ArrayList<Integer> NS = new ArrayList<Integer> ();
	        int res1=isStable(a);
	        int res2=isStable(b);
	        int res3=isStable(c);
	        int res4=isStable(d);
	        int res5=isStable(e);
	        if(res1!=0)
	        {
	            S.add(a);
	        }
	        else
	        {
	            NS.add(a);
	        }
	        if(res2!=0)
	        {
	            S.add(b);
	        }
	        else
	        {
	            NS.add(b);
	        }
	        if(res3!=0)
	        {
	            S.add(c);
	        }
	        else
	        {
	            NS.add(c);
	        }
	        if(res4!=0)
	        {
	            S.add(d);
	        }
	        else
	        {
	            NS.add(d);
	        }
	        if(res5!=0)
	        {
	            S.add(e);
	        }
	        else
	        {
	            NS.add(e);
	        }
	        Collections.sort(S);
	        Collections.sort(NS);
	        int i=S.size();
	        int j=NS.size();
	        int out1=S.get(i-1);
	        int out2=NS.get(0);
	        System.out.println(out1-out2);
	    }
	}

//OUTPUT:
12
1313
122
678
898
1191
