package collections3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exm1 {
	public static void main (String[] args) {
		
	ArrayList<Integer> nums = new ArrayList <> ();
	
	nums.add(20);
	nums.add(37);
	nums.add(29);
	nums.add(12);
	nums.add(30);
	nums.add(7);
	
	List <Integer> even = nums.stream().filter(x -> x%2==0).collect(Collectors.toList());
	System.out.println(even);	
	}
}
