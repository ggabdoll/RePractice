package base01ex01;

public class Api01 {

	public static void main(String[] args) {

		String sourceString = "everyday we have is one more than we deserve";
		String encodedString = "";
		
		for(int i = 0; i<sourceString.length(); i++) {
			char c = sourceString.charAt(i);
			if(c == ' ') {
				encodedString += ' ';
			}else if(c == 'x'|| c =='y' || c =='z') {
				encodedString += (char)(c-23);
				}else {
					encodedString +=(char)(c+3);
			}
		}
		
		System.out.println("��ȣȭȰ ���ڿ� : " + sourceString);
		System.out.println("��ȣȭ�� ���ڿ� : " + encodedString);
	}

}
