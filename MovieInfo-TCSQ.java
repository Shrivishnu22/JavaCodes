/*
Create a class Movie with Attributes :
movieName String
 Company String
 Genre String
 budget int

Create setters and getters and parametrized Constructor as required
Create another class Solution with a main method and scan attributes as above sequence
ex :
aaa
Marvel
Action
250000000
and scan a search attribute 


Create a Static method getMovieByGenre which will take object array and search string as parameters and
returns movies which are matching with genre(Search) having budget less than 80000000 if movie budget is above 8cr print "High Budget Movie" ( Case Senstive Search) else " Low Budget Movie"

Input :

Enter Movie name
mission
Enter Company name
sun
Enter Genre
action
Enter Movie Budget
250000000
Enter Movie name
johnwick
Enter Company name
vijay
Enter Genre
action
Enter Movie Budget
250000000
Enter Movie name
kgf
Enter Company name
zee
Enter Genre
action
Enter Movie Budget
300000000
Enter Search Attribute
action

Output:

High Budget Movie
High Budget Movie
High Budget Movie
*/

import java.util.*;

public class Solution{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String name,company,genre,attr;
		int budget;
		ArrayList<Movie> ob = new ArrayList<>();
		for(int i=0;i<3;i++) {
			System.out.println("Enter Movie name");
			name = sc.next();
			System.out.println("Enter Company name");
			company = sc.next();
			System.out.println("Enter Genre");
			genre = sc.next();
			System.out.println("Enter Movie Budget");
			budget = sc.nextInt();
			Movie movie = new Movie(name,company,genre,budget);
			ob.add(movie);
		}
		System.out.println("Enter Search Attribute");
		attr=sc.next();
		getMovieByGenre(ob,attr);
	}
	
	public static void getMovieByGenre(ArrayList<Movie> arr,String search) {
		for(Movie ob:arr) {
			if(ob.getGenre().equalsIgnoreCase(search)) {
					if(ob.getBudget()<80000000) {
						System.out.println("Low Budget Movie");
					}else {
						System.out.println("High Budget Movie");
					}
			}
		}
	}
}


class Movie{
	private String name;
	private String company;
	private String genre;
	private int budget;
	
	Movie(String name, String company, String genre, int budget){
		this.name=name;
		this.company=company;
		this.genre=genre;
		this.budget=budget;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCompany() {
		return company;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public int getBudget() {
		return budget;
	}
	
	public void setName(String str) {
		this.name=str;
	}
	
	public void setCompany(String str) {
		this.company=str;
	}
	
	public void setGenre(String str) {
		this.genre=str;
	}
	
	public void setBudget(int n) {
		this.budget=n;
	}
	
}



