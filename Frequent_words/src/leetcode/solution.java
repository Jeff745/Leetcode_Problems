package leetcode;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class solution {
	
	public static List<String> topKFrequent(String[] words, int k) {
		
		HashMap<String,Integer> counted_words = new HashMap<>();
		for (int i =0; i < words.length ; i++) {
				int count= counted_words.getOrDefault(words[i],0);
				counted_words.getOrDefault(words[i], count+1);	
				
				Comparator<Entry<String,Integer>> valueComparator = new Comparator<Entry<String,Integer>>()
						{
							@Override
							public int compare(Entry<String,Integer>e1,Entry<String,Integer>e2) {
								
								
							}
					
					
						}
			
		}
		
     return null;   
    }

}
