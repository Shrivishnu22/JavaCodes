package practice;

import java.util.Scanner;

public class ZeroOnePattern {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=1;j<=i+1;j++) {
				if(j%2!=0)
					System.out.print(1);
				else
					System.out.print(0);
			}
			System.out.print("\n");
		}
	}
}
