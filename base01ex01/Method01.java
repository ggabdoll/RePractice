package base01ex01;

public class Method01 {

	public static void main(String[] args) {
		int num1 = 6;
		int num2 = 15;
		
		Method01 me = new Method01();
		System.out.println("두 수의 차는 : " +me.abs(num1, num2));
		
	}
		public int abs(int num1, int num2) {
			
			int m = (num1 - num2) *(-1);
			return m;
		}
	

}
