package frog_River_One;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class solution {
	
	public static int solution(int x, int[] A) 
	{
		int num=0;
		List<Integer> list = new ArrayList<Integer>();
		
		for (int j:A) {
			list.add(j);
		}
//		LinkedList<Integer> numbers = new LinkedList(list);
		
		boolean check= true;
		
		for (int i=0; i< list.size(); i++) {
			
			//If x is found in list of numbers
			if ( list.get(i)==x) {
				
			//Check if number 1 to x is found in list.	
				check = list.stream().allMatch(k -> k>=list.get(i) && k<= x);
				if (check ==true) {
					num = list.indexOf(i);
					
				}
				
				
			}
			
			return -1;
			
		}
		
		System.out.println(num);
		return num;
}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		int [] numbers = {1,3,1,4,2,3,5,4};
		int x= 5;
		solution(x, numbers);
		
		
	}

}