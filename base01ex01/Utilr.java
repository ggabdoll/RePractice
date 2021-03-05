package base01ex01;

public class Utilr {

public int findPrimeCount(int limit) {
		
		boolean call = false;
		int count = 0;
		
		for(int i = 2; i<=limit; i++) {
			call = true;
			for(int j = 2; j<i; j++) {
				if(i%j ==0 ) {
					call = false;
					break;
					}	
				}
			if(call) {
				count ++;
		}
		}
		return  count;
	}
	
	public int[] findPrimeReturnArray(int limit) {
		
		int count = this.findPrimeCount(limit);
		int prime[] = new int[count];
		
		int other =0;
		boolean call = false;
		
		for(int i = 2; i<=limit; i++) {
			call = true;
			for(int j = 2; j<i; j++) {
			if(i%j ==0 ) {
				call = false;
				break;
			}	
			}
			if(call) {
				prime[other]=i;
				other ++;
			}
			}
				
		return prime;
	}
}


