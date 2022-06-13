package ch09;

//Object 클래스
//모든 클래스 최고조상, 11개의 메서드만 가지고 있다.
 
class Value{
	int value;
	
	Value(int value) {
		this.value = value;
	}
	
	//equals의 오버라이딩
	//인스턴스변수의 값을 비교하도록 equals()를 오버라이딩해야한다.
	
	//Object equals()를 오버라이딩해서 값를 비교
	public boolean equals(Object obj) {
		//참조변수의 형변환 전에는 반드시 instanceof로 확인하기
		if(!(obj instanceof Value)) return false;
		
		//Object클래스를 Value클래스로 형변환 (여기서 this는 v1이고 obj는 v2가 Object로 형변환된 것이다.) 
		Value v = (Value)obj;   
		
		//주소비교 (여기서 this는 v1이고 obj는 v2가 Object로 형변환된 것이다.)
		//return this == obj;
		
		//값비교
		return this.value == v.value;
	}
}
public class Ex1 {
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2)) System.out.println("v1과 v2는 같다");
		else System.out.println("v1과 v2는 같지 않다");
	}

}
