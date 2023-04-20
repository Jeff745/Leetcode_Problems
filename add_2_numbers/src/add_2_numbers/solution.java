package add_2_numbers;

import java.util.ListIterator;

public  class solution {
		
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
		StringBuffer string1 = new StringBuffer();
		StringBuffer string2 = new StringBuffer();
		StringBuffer string3 = new StringBuffer();

		ListNode node = new ListNode();
		
		
		
		while(l1.next != null) {
		
			string1.append(node.val).append(" ");
			
		}
		
		string1.reverse();
		
		int num1= Integer.parseInt(string1.toString()); 
		
		while(l2.next != null) {
			
			string2.append(node.val).append(" ");
			
		}
		
		string2.reverse();
		int num2= Integer.parseInt(string2.toString()); 
		
		int num3 = num1 + num2;
		
		//String final_num= String.valueOf(num3);
		string3.append(num3);
		string3.reverse();
		ListNode node1 = new ListNode();
		while (node1.next !=null) {
			
			
			
		}


		

    }
	
	
	public static void main(String[] args) {
		
		ListNode node = new ListNode();
		
		while(node.next!=null) {
			
			node.val =3;
			
			
		}
 
	}


	
	
	

}
