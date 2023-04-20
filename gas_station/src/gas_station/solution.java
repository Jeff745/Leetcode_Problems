package gas_station;

public class solution {
	
	public static int canCompleteCircuit(int[] gas, int[] cost) {
        
		for (int i=0; i<gas.length;i++) {
			if(gas[i] >= cost[i]) {
				int endPoint= findEndPoint(i,gas,cost);
				if (endPoint ==i) {
					return i;
				}
				
				if (i > endPoint) {
					return -1;
					
				}
				i = endPoint;

				
				
			}
		
		}	
		return -1;
    }
	
	
	private static int findEndPoint(int start, int[] gas, int[] cost) {
		
		int end = (start == gas.length-1) ? 0: start+1;
		int remainingGas= gas[start]-cost[start];
		
		while(end!=start) {
			remainingGas+= gas[end]-cost[end];
			
			if (remainingGas <0) {
				return end;
			}
			end++;
			if(end==gas.length) {
				end=0;
			}
			
		}
		return start;

	}
	
	public static void main(String[] args) {
		int[] gas= {1,2,3,4,5};
		//int[] gas= {2,3,4};

		int[] cost= {3,4,5,1,2};
		//int[] cost= {3,4,3};
		
		System.out.println(canCompleteCircuit(gas, cost));

		
	}
	
	

}
