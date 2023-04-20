package leetcode;

import java.util.ArrayList;
import java.util.List;

public class solution {
	
		public static int[][] insert(int[][] intervals, int[] newInterval) {
			
			List<int[]> temp_list = new ArrayList<int[]>();
			int[] temp_arr = newInterval; 
			
			for (int i=0; i<intervals.length;i++ ) {
						if (newInterval[1]<intervals[i][0]) {
						temp_list.add(temp_arr);
						temp_arr = intervals[i];
						
					}
					
				
				
			}
        
    }

}
