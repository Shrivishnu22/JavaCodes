package practice;

import java.util.Scanner;

public class PalindromeInStr {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next(),rev="";
		int i=input.length()-1;
		while(i>=0) {
			rev += input.charAt(i);
			i--;
		}
		if(input.equals(rev)){
			System.out.print(true);
		}else {
			System.out.print(false);
		}
	}
}
