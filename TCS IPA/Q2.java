/*
Create a class Laptop with the below attributes:

laptopId - int
brand - String
osType - String
price - double
rating - int

The above attributes should be private, write getters, setters and parameterized constructor as required.

Create class Solution with main method.

Implement two static methods - countOfLaptopsByBrand and searchLaptopByOsType in Solution class.

countOfLaptopsByBrand method:
This method will take two input parameters - array of Laptop objects and a String parameter.
The method will return the count of laptops from array of Laptop object for the given brand(String parameter passed) whose rating is more than 3.
If no Laptop with the above condition is present in the array of Laptop objects, then the method should return 0.

searchLaptopByOsType method:
This method will take two input parameters - array of Laptop objects and a String parameter.
The method will return Laptop object array in an descending order of their laptopId, from the array of Laptop objects whose os attribute matches with the given OS(String parameter passed).
If no Laptop with the given OS is present in the array of Laptop objects, then the method should return null.

Note : No two Laptop object would have the same laptopId.
All the searches should be case insensitive.

The above mentioned static methods should be called from the main method.

For countOfLaptopsByBrand method - The main method should print the count of laptops as it is, if the returned value is greater than 0, or it
should print "The given brand is not available".

For searchLaptopByOsType method - The main method should print the laptopId and rating from the returned Laptop object array if the returned value is not null.
If the returned value is null then it should print "The given os is not available".

Before calling these static methods in main, use Scanner object to read the values of Four Laptop objects referring attributes in the above mentioned attribute sequence. 
Next, read two String values for capturing brand and os.


Consider below sample input and output:
TestCase1:
Input:
123
HP
Windows
35000
5
124
Apple
Mac OS
70000
5
125
Dell
Ubuntu
30000
4
126
HP
windows
40000
4
HP
windows

Output:
2
126
4
123
5


TestCase2:
Input:
123
HP
Windows
35000
5
124
Apple
Mac OS
70000
5
125
Dell
Ubuntu
30000
4
126
Asus
windows
40000
3
HP1
Ubuntu1

Output:
The given brand is not available
The given os is not available

--------------------------------------------------
Sample code snippet for reference: 
Please use below code to build your Solution.
--------------------------------------------------
import java.util.Scanner;
public class Solution
{
  public static void main(String[] args)
 {
  //code to read values 
  //code to call required method
  //code to display the result
 }
    
 //code the first method 
  
    
 //code the second method    

}
    
//code the class

-------------------------------------------------
Note on using Scanner object:
Sometimes scanner does not read the new line character while invoking methods like nextInt(), nextDouble() etc. 
Usually, this is not an issue, but this may be visible while calling nextLine() immediately after those methods.

Consider below input values:
1001
Savings

Referring below code:

Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
String str = sc.nextLine(); -> here we expect str to have value Savings.Instead it may be "".

If above issue is observed, then it is suggested to add one more explicit call to nextLine() after reading numeric value.
*/

import java.util.*;

public class Practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Laptop Laptops[] = new Laptop[4];
		for (int i = 0; i < 4; i++) {
			int laptopid = sc.nextInt();
			sc.nextLine();
			String brand = sc.nextLine();
			String ostype = sc.nextLine();
			double price = sc.nextDouble();
			int rating = sc.nextInt();
			sc.nextLine();
			Laptop ob = new Laptop(laptopid, brand, ostype, price, rating);
			Laptops[i] = ob;
		}
		String searchbrand = sc.nextLine();
		String searchos = sc.nextLine();
		countOfLaptopsByBrand(Laptops, searchbrand);
		searchLaptopByOsType(Laptops, searchos);
	}

	public static void countOfLaptopsByBrand(Laptop Laptops[], String searchbrand) {
		int count = 0;
		for (int i = 0; i < 4; i++) {
			if (Laptops[i].getbrand().equals(searchbrand)) {
				int rating = Laptops[i].getrating();
				if (rating > 3) {
					count++;
				}
			}
		}

		System.out.println(count);
	}

	public static void searchLaptopByOsType(Laptop laptops[], String searchos) {
		Laptop arr[] = new Laptop[4];
		int cnt = 0;
		for (int i = 0; i < 4; i++) {
			if (laptops[i].getOs().equalsIgnoreCase(searchos)) {
				arr[cnt++] = laptops[i];
			}
		}
		for (int i = 0; i < cnt; i++) {
			for (int j = 0; j < cnt - 1; j++) {
				if (arr[j].getid() < arr[j + 1].getid()) {
					Laptop ob = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = ob;
				}
			}
		}
		for (int i = 0; i < cnt; i++) {
			Laptop ob = arr[i];
			System.out.println(ob.getid());
			System.out.println(ob.getrating());
		}
	}

}

class Laptop {
	private int laptopid;
	private String brand;
	private String ostype;
	private double price;
	private int rating;

	Laptop(int id, String brand, String ostype, double price, int rating) {
		laptopid = id;
		this.brand = brand;
		this.ostype = ostype;
		this.price = price;
		this.rating = rating;
	}

	public int getid() {
		return laptopid;
	}

	public int getrating() {
		return rating;
	}

	public String getbrand() {
		return brand;
	}

	public String getOs() {
		return ostype;
	}
}
