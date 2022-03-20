package practice;
import java.util.*;
public class PalindromeInNum{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),rev=0;
		int org=n;
		while(n>0) {
			int temp = n%10;
			rev = rev*10+temp;
			n/=10;
		}
		if(rev==org) 
			System.out.print(true);
		else
			System.out.print(false);
	}
}