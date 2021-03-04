package base01ex01;

public class Api02 {

	public static void main(String[] args) {

		Api02 ap = new Api02();
		String expr = "3+5+9+1";
		System.out.println(expr +" = " + ap.excute(expr));
		expr = "11+45+77+3";
		System.out.println(expr +" = " + ap.excute(expr));
	    expr = "33+51+12+11";
		System.out.println(expr +" = " + ap.excute(expr));
	}

	public int excute(String expr) {
		int result = 0;
		String strNum = "";
		for(int i =0; i< expr.length(); i++) {
			char c = expr.charAt(i);
			if(c=='+') {
				result += Integer.parseInt(strNum);
				strNum = "";
			}else {
				strNum += c;
			}
		}
		return (result + Integer.parseInt(strNum));
	}
}
