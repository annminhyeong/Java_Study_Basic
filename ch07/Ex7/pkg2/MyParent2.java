package ch07.Ex7.pkg2;

import ch07.Ex7.pkg1.MyParent1;

class MyChild extends MyParent1{
	public void printMembers() {
		//같은 클래스가 아님
		//System.out.println(prv); //에러 
		//같은 패키지가 아님
		//System.out.println(dft); //에러
		//같은 패키지는 아니지만 자손이므로 가능
		System.out.println(prt); //OK
		System.out.println(pub); //OK
	}
}

public class MyParent2 {

	public static void main(String[] args) {
		MyChild p = new MyChild();
		//같은 클래스가 아님
		//System.out.println(p.prv); //에러
		//같은 패키지가 아님
		//System.out.println(p.dft); //에러
		//자손 아니므로 불가능(extend 클래스 가 아니므로)
		//System.out.println(p.prt); //에러
		System.out.println(p.pub); //OK
	}

}
