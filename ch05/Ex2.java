package ch05;

public class Ex2 {

	public static void main(String[] args) {
		//배열은 한번생성하면 실행하는 동안 길이를 바꿀 수 없다.
		//이유 : 배열은  메모리에서 연속적인 공간을 가져야하는데 배열을 추가한다고 했을때
		//뒤에 연속적인 공간이 있다는 것을 보장할 수없기 때문에 길이를 변경할수 없음
		
		int[] arr = new int[5];
//		System.out.println(arr.length);
		
		
		for(int i=0; i<arr.length; i++)
			System.out.println(arr[i]=i);
		
		
	}

}
