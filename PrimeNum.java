package practice;

import java.util.Scanner;

public class PrimeNum {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		boolean flag=true;
		for(int i=2;i<num/2;i++) {
			if(num%i==0) {
				flag=false;
				break;
		}
		}
		System.out.print(flag);
	}
}
