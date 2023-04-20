package sudoku;

import java.util.HashMap;

public class solution {
	
	public static void sudoku_solver(char c, int num) {
		
		char[][] sudoku = new char[3][3];
		int key=0, key_1=0 , key_2=0;
		
		HashMap<Integer,Integer> sudoku_keys= new HashMap<Integer, Integer>();
		
		sudoku_keys.put(1, 01);
		sudoku_keys.put(2, 02);
		sudoku_keys.put(3, 03);
		sudoku_keys.put(4, 11);
		sudoku_keys.put(5, 12);
		sudoku_keys.put(6, 13);
		sudoku_keys.put(7, 21);
		sudoku_keys.put(8, 22);
		sudoku_keys.put(9, 23);
		
		
		if(check_input(c, num)) {
			
			 key = sudoku_keys.get(num);
			 key_1 = key % 10;
			 key_2 = key / 10;
		
		}
		
	
		
	}
	
	public static boolean check_input(char c, int num) {
		
		if (c == 'x' || c == 'X' || c =='o' ||c == 'O') {
			return true;	
		}
		
		if (num >=0 || num <10) {
			
			return true;
		}
		
		return false;
		
		
	}

}
