package ch07;


//super() 생성자: 조상의 생성자를 호출할때 사용
//super() 조건
//생성자의 첫 줄에 반드시 생성자를 호출해야 한다. (this() 아니면 super()을 호출해야함)
//그렇지 않으면 컴파일러가 생성자의 첫출에 super()를 삽입한다.
class Point3{
	int x;
	int y;
	
	Point3(int x, int y){
		//super()을 안쓰면 Object()의 기본생성자를 자동으로 추가함
		//super(); 
		this.x = x;
		this.y = y;
	}
}

class Point3D3 extends Point3{
	int z;

	Point3D3(int x, int y, int z){
		//super(x, y)는 Point3 생성자(Point3(x, y))를 호출함
		//만약 super(x, y); 쓰지 않으면 super()을 자동으로 컴파일러가 추가하는데
		//Point3에는 기본생성자가 없어서 에러가 발생한다.
		super(x, y);
		this.z = z;
	}
}
public class Ex5 {

}
