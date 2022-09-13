package practice;
import java.util.*;
public class RemoveDuplicates {
	public static void main(String args[]) {
		ArrayList<Integer> arr= new ArrayList<>(Arrays.asList(1,2,3,4,21,5,1,2,45,3,1,2,3,2,1));
		HashSet<Integer> res = new HashSet<>();
		for(Integer it : arr) {
			res.add(it);
		}
		System.out.println(res);
	}
}
