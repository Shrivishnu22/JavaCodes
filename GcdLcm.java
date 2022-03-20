package practice;

import java.util.Scanner;

public class GcdLcm {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n,m,gcd=0,lcm=0;
		n=sc.nextInt();m=sc.nextInt();
		for(int i=1;i<=n && i<=m;i++) {
			if(n%i==0 && m%i==0) {
				gcd=i;
			}
		}
		System.out.println("GCD of "+n+" "+m+" = "+gcd);
		lcm=(m*n)/gcd;
		System.out.println("LCM of "+n+" "+m+" = "+lcm);
	}
}
