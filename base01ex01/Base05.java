package base01ex01;

public class Base05 {

	public static void main(String[] args) {

		int n = 15;
		int sum = 0;
        
        for(int i=1;i<=n;i++) {
        	int log = 1;
        	for(int j = 0; j<i ; j++){
        		log += j;
        	}
        	sum += log;
        }
		
		System.out.println(n+"번째까지의 합 : " + sum);
	}

}
