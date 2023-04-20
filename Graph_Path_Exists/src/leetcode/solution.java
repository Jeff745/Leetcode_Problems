package leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class solution {
	
	public boolean validPath(int n, int[][] edges, int source, int destination) {
        
		//check base cases
        if (source== destination){
        		return true ;               
                
        }
        
        if (edges.length== 0){
                
                return true;
        }
        
        //Proceed to graph creation
        ArrayList<Integer>[] graph = createGraph(n,edges);
        return connectedGraphHasValue(source, destination,graph);
    
}
	
	/**
     * Create a list representation of the input graph
     * 
     * Key is a node value, but since values are 0-n,
     * we can use arrays instead of maps
     * 
     * Value is a list of node values the key connects to
     */
    
    private ArrayList<Integer>[] createGraph(int n, int[][] edges){
    		ArrayList<Integer>[] list = (ArrayList<Integer>[]) Array.newInstance(ArrayList.class,n);
            
            // initialize with lists

            for(int i =0 ; i<n ; i++){
            		list[i]= new ArrayList<>();               
                    
            }
            
            for (int[] edge:edges){
               list[edge[0]].add(edge[1]);
               list[edge[1]].add(edge[0]);
       
                    
            }
            
            return list;
            
    }
    
    /**
     * Check if a subgraph starting with "nodeValue" contains "searchValue"
     * This uses an iterative depth-first search
     */
    
    private boolean connectedGraphHasValue(Integer nodeValue, Integer searchValue, ArrayList<Integer>[] graph){
            
    	HashSet<Integer> visitedNode = new HashSet<>();   
            
            Queue<Integer> nodesToVisit = new LinkedList<>();
            nodesToVisit.add(nodeValue);
            
            // normally, we'd check here, but in this problem, no node connects to itself

            while(nodesToVisit.size()>0){
            	Integer CurrentNode = nodesToVisit.poll();
                    visitedNode.add(CurrentNode);
                    
                    for (Integer nextNode: graph[CurrentNode]){
		if(!visitedNode.contains(nextNode)){
		  if (nextNode.equals(searchValue)) {
		          return true;
		  }    
			nodesToVisit.add(nextNode);                          
    
		}                             
      }
                    
                    
    }
            
            
  return false ;          
            
            
   }
	
	

}
