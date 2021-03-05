package base01ex01;

public class Api05 {
	
	public static void main (String[] args) {
		
		String[] arr = {"java program" , "array","javapromgram area","append"};
		String result = Api05.replaceString(arr);
		System.out.println("변경된 문자열 : " +result);
	}
	
	private static String replaceString(String[] arr) {
		String av = "";
		int sum = 0, max = 0, index =0;
		
		for(int i = 0; i< arr.length; i++) {
			sum = 0;
			
			for(int j =0; j<arr[i].length(); j++) {
				arr[i].charAt(j);
				
				if(arr[i].charAt(j) == 'a') {
					sum++;
				}
				}
				
			
		}
		
		return null;
	}

}
