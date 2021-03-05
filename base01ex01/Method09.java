package base01ex01;

import java.util.Arrays;

public class Method09 {

	
	public static void main(String[] args) {

		Method09 median = new Method09();
		
		int[] values1 = {10,4,53,63,17,37,52,16,33,65};
		System.out.println("input : " +Arrays.toString(values1));
		System.out.println("median : " +median.findMedian(values1));
		System.out.println("===========================================");
		
		int[] values2 = {32,53,52,76,15,98,76,65,36,10};
		System.out.println("input : " +Arrays.toString(values2));
		System.out.println("median : " +median.findMedian(values2));
		
	}
		
		public int findMedian(int[] values) {
			int sum = 0; 
			
			for(int i = 0; i<values.length;i++) {
				sum = sum + values[i] ;
				}
			int avg = sum/values.length;
			int m = values[0];
			int r = Math.abs(m-avg);
			
			for(int j = 1; j<values.length;j++) {
				int d = Math.abs(values[j] - avg);
				if(d<r) {
					m = values[j];
					d = r;
				}else if(d == r && values[j] < m) {
					m = values[j];
				}
			}
			
			return m;
		
	}

}
