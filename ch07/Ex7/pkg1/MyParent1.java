package ch07.Ex7.pkg1;

//접근제어자가 public
public class MyParent1 {
	private int prv;   // 같은클래스
	int dft;           //같은패키지
	protected int prt; //같은패키지 + 자손(다른패키지)
	public int pub;    //접근 제한없음
	
	public void printMembers() {
		System.out.println(prv); //OK
		System.out.println(dft); //OK
		System.out.println(prt); //OK
		System.out.println(pub); //OK
	}
}

//접근제어자가 default
class MyParentTest {
	//private(같은 파일) : 같은 클래스 내에서만 접근이 가능하다
	//(default)(같은 폴더) : 같은 패키지 내에서만 접근이 가능하다
	//protected (같은 폴더 + 다른패키지 자손) : 같은 패키지 내에서 그리고 다른 패키지의 자손클래스에 접근이 가능하다
	//public : 접근 제한이 전혀 없다.
	//
	//class 앞에 붙일수 있는 접근제어자
	//public , (default)
	
	public static void main(String[] args) {
		MyParent1 p = new MyParent1();
		//private는 같은 클래스에서만 접근 가능
		//System.out.println(p.prv); //에러
		System.out.println(p.dft); //OK
		System.out.println(p.prt); //OK
		System.out.println(p.pub); //OK
	}

}
