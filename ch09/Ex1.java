package ch09;

//Object Ŭ����
//��� Ŭ���� �ְ�����, 11���� �޼��常 ������ �ִ�.
 
class Value{
	int value;
	
	Value(int value) {
		this.value = value;
	}
	
	//equals�� �������̵�
	//�ν��Ͻ������� ���� ���ϵ��� equals()�� �������̵��ؾ��Ѵ�.
	
	//Object equals()�� �������̵��ؼ� ���� ��
	public boolean equals(Object obj) {
		//���������� ����ȯ ������ �ݵ�� instanceof�� Ȯ���ϱ�
		if(!(obj instanceof Value)) return false;
		
		//ObjectŬ������ ValueŬ������ ����ȯ (���⼭ this�� v1�̰� obj�� v2�� Object�� ����ȯ�� ���̴�.) 
		Value v = (Value)obj;   
		
		//�ּҺ� (���⼭ this�� v1�̰� obj�� v2�� Object�� ����ȯ�� ���̴�.)
		//return this == obj;
		
		//����
		return this.value == v.value;
	}
}
public class Ex1 {
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2)) System.out.println("v1�� v2�� ����");
		else System.out.println("v1�� v2�� ���� �ʴ�");
	}

}
