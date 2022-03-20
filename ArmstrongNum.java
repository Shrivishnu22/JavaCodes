package practice;

import java.util.Scanner;

public class ArmstrongNum {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),temp,i=0,org;
		temp=n;org=n;
		while(n!=0) {
			n/=10;
			i++;
		}
		int sum=0;
		while(temp!=0) {
			int digit = temp%10;
			sum+=Math.pow(digit, i);
			temp/=10;
		}
		if(org==sum)
			System.out.print(true);
		else
			System.out.print(false);
	}

}


