package base01ex01;

import java.util.Scanner;

public class Modeling01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Rectangle01 rec1 = new Rectangle01();
		System.out.println("ù��° ���簢���� ����: ");
		rec1.setColor(sc.next());
		
		System.out.println("ù��° ���簢���� ����: ");
		rec1.setWidth(sc.nextInt());
		
		System.out.println("ù��° ���簢���� ����: ");
		rec1.setLength(sc.nextInt());
		
		Rectangle01 rec2 = new Rectangle01();
		System.out.println("�ι�° ���簢���� ����: ");
		rec2.setColor(sc.next());
		
		System.out.println("�ι�° ���簢���� ����: ");
		rec2.setWidth(sc.nextInt());
		
		System.out.println("�ι�° ���簢���� ����: ");
		rec2.setLength(sc.nextInt());
		
		System.out.println(rec1.getColor() + "��������� ���̴�" + rec1.area() + "�̰� �ѷ��� " + rec1.perimeter()+"�Դϴ�.");
		System.out.println(rec2.getColor() + "��������� ���̴�" + rec2.area() + "�̰� �ѷ��� " + rec2.perimeter()+"�Դϴ�.");
		
		if(rec1.area()>rec2.area()) {
			System.out.println("���̴� "+rec1.getColor() +" ���簢���� �� Ů�ϴ�.");
		}else if(rec1.area() == rec2.area()) {
			System.out.println("�� ���簢���� ���̴� �Ȱ����ϴ�.");
		}else {
			System.out.println("���̴� "+rec2.getColor() +" ���簢���� �� Ů�ϴ�.");
		}
		
		if(rec1.perimeter()>rec2.perimeter()) {
			System.out.println("�ѷ��� "+rec1.getColor() +" ���簢���� �� Ů�ϴ�.");
		}else if(rec1.perimeter() == rec2.perimeter()) {
			System.out.println("�� ���簢���� ���̴� �Ȱ����ϴ�.");
		}else {
			System.out.println("�ѷ��� "+rec2.getColor() +" ���簢���� �� Ů�ϴ�.");
		}
	}

}
