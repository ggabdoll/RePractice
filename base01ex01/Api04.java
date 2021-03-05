package base01ex01;

import java.util.Vector;

public class Api04 {

	public Vector<String>moveToVector(String[]datas){
		Vector<String> v =new Vector<String>();
		for(int i = datas.length-1; i >=0; i--) {
			v.addElement(datas[i]);
		}
		return v;
	}
	
	public static void main(String[] args) {
	
		Api04 ac = new Api04();
		String datas[] = {"1","2","3","4","5"};
		System.out.println(ac.moveToVector(datas));

	}

}
