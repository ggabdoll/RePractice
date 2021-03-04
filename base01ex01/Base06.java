package base01ex01;

public class Base06 {

	public static void main(String[] args) {

		int[] arr = {3,24,1,55,17,43,5};
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int k = 0; k<arr.length-1; k++) {
			int a = arr[k];
			int b = arr[k+1];
			
			if(arr[k] > arr[k+1]) {
				arr[k] = b;
				arr[k+1] = a;
			}
			}
		}
		for(int j = 0; j<arr.length; j++) {
		System.out.print(arr[j] + ",");
		}
	}

}
