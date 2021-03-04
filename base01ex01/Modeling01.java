package base01ex01;

import java.util.Scanner;

public class Modeling01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Rectangle01 rec1 = new Rectangle01();
		System.out.println("첫번째 직사각형의 색깔: ");
		rec1.setColor(sc.next());
		
		System.out.println("첫번째 직사각형의 가로: ");
		rec1.setWidth(sc.nextInt());
		
		System.out.println("첫번째 직사각형의 세로: ");
		rec1.setLength(sc.nextInt());
		
		Rectangle01 rec2 = new Rectangle01();
		System.out.println("두번째 직사각형의 색깔: ");
		rec2.setColor(sc.next());
		
		System.out.println("두번째 직사각형의 가로: ");
		rec2.setWidth(sc.nextInt());
		
		System.out.println("두번째 직사각형의 세로: ");
		rec2.setLength(sc.nextInt());
		
		System.out.println(rec1.getColor() + "직사격형의 넓이는" + rec1.area() + "이고 둘레는 " + rec1.perimeter()+"입니다.");
		System.out.println(rec2.getColor() + "직사격형의 넓이는" + rec2.area() + "이고 둘레는 " + rec2.perimeter()+"입니다.");
		
		if(rec1.area()>rec2.area()) {
			System.out.println("넓이는 "+rec1.getColor() +" 직사각형이 더 큽니다.");
		}else if(rec1.area() == rec2.area()) {
			System.out.println("두 직사각형의 넓이는 똑같습니다.");
		}else {
			System.out.println("넓이는 "+rec2.getColor() +" 직사각형이 더 큽니다.");
		}
		
		if(rec1.perimeter()>rec2.perimeter()) {
			System.out.println("둘레는 "+rec1.getColor() +" 직사각형이 더 큽니다.");
		}else if(rec1.perimeter() == rec2.perimeter()) {
			System.out.println("두 직사각형의 넓이는 똑같습니다.");
		}else {
			System.out.println("둘레는 "+rec2.getColor() +" 직사각형이 더 큽니다.");
		}
	}

}
