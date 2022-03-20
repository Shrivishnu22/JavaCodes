package practice;

import java.util.Scanner;

public class ChefWantHome {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t;
		t=sc.nextInt();
		while(t>=0) {
			int x,y;
			x=sc.nextInt();
			y=sc.nextInt();
			if(x>y) {
				System.out.print("CAR");
			}else if(x<y) {
				System.out.print("BIKE");
			}else {
				System.out.print("SAME");
			}
			t--;
		}
		
	}

}

/*
 Chef wants to go home either car or bike.  
 Input : 3 1 5 4 2 6 6
 Output : CAR BIKE SAME
 */