package taxi_booking;

import java.util.*;

class vishnu{
	int n;
	String name;
	
	public void setter(int n,String m) {
		this.n=n;
		this.name=m;
	}
	
	public int getId() {
		return n;
	}
	public String getName() {
		return name;
	}
}
public class Main {
	public static void main(String args[]) {
		vishnu obj1 = new vishnu();
		obj1.setter(1, "Akshya");
		System.out.print(obj1.getId());
		System.out.print(obj1.getName());	
	}
}
