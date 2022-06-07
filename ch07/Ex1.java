package ch07;

class Point{
	int x = 1;
	int y = 2;
}

class Point3D extends Point{
	int z = 3;
}
public class Ex1 {
	//상속 특징
	//1. 자손은 조상의 모든 맴버를 상속받는다.(생상자, 초기화블럭 제외)
	//2. 자손의 맴버개수는 조상보다 적을 수 없다 (같거나 많다)
	//3. 자손의 변경은 조상에 영향을 미치지 않는다.

	public static void main(String[] args) {
		Point3D p3D = new Point3D();
		System.out.printf("%d, %d, %d",p3D.x, p3D.y, p3D.z);
	}

}
