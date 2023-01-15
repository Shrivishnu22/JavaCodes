/*
Write a Porgram to Print no.of Spaces and Characters in a given input


input: Hello This is ABCD from XYZ city
output : No of Spaces : 6 and characters : 26
*/

package practice;

import java.util.*;

public class Solution{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String input;
		int spaces=0,cnt=0;
		input = sc.nextLine();
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)==' ')	spaces++;
			else	cnt++;
		}
		System.out.println("No of Spaces : "+spaces);
		System.out.println("characters : "+cnt);
	}
}



