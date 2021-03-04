package base01ex01;

public class Method05 {

	public int[] ascending(int[] inputNumbers) {
		
		int a =0;
		
		for(int i = 0; i < inputNumbers.length -1;i++) {
			for(int j = i=1; j<inputNumbers.length;j++) 
				if(inputNumbers[i]>inputNumbers[j]) {
					a = inputNumbers[i];
					inputNumbers[i] = inputNumbers[j];
					inputNumbers[j] = a;
				}
			}
			
		return inputNumbers;
	}
	
	
	public static void main(String[] args) {

		Method05 me = new Method05();
		int[] numbers = new int[] {7,5,2,19,34,51,32,11,67,21};
		
		numbers = me.ascending(numbers);
		
		for(int i = 0; i<numbers.length; i++) {
			System.out.print(numbers[i]);
			
			if(i!=numbers.length-1) {
				System.out.print(",");
			}else {
				System.out.println("");
			}
		}
		System.out.println("Successfull!!!");
	}

}
