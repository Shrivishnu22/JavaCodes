package practice;

import java.util.Scanner;

public class PlusPattern {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		n=sc.nextInt();
		for(int i=1;i<=n*2;i++) {
			for(int j=1;j<n*2;j++) {
				if(i==n || j==n) {
					System.out.print(" * ");
				}else {
					System.out.print("   ");
				}
			}
			System.out.print("\n");
		}
	}
}
