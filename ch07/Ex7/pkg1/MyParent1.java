package ch07.Ex7.pkg1;

//���������ڰ� public
public class MyParent1 {
	private int prv;   // ����Ŭ����
	int dft;           //������Ű��
	protected int prt; //������Ű�� + �ڼ�(�ٸ���Ű��)
	public int pub;    //���� ���Ѿ���
	
	public void printMembers() {
		System.out.println(prv); //OK
		System.out.println(dft); //OK
		System.out.println(prt); //OK
		System.out.println(pub); //OK
	}
}

//���������ڰ� default
class MyParentTest {
	//private(���� ����) : ���� Ŭ���� �������� ������ �����ϴ�
	//(default)(���� ����) : ���� ��Ű�� �������� ������ �����ϴ�
	//protected (���� ���� + �ٸ���Ű�� �ڼ�) : ���� ��Ű�� ������ �׸��� �ٸ� ��Ű���� �ڼ�Ŭ������ ������ �����ϴ�
	//public : ���� ������ ���� ����.
	//
	//class �տ� ���ϼ� �ִ� ����������
	//public , (default)
	
	public static void main(String[] args) {
		MyParent1 p = new MyParent1();
		//private�� ���� Ŭ���������� ���� ����
		//System.out.println(p.prv); //����
		System.out.println(p.dft); //OK
		System.out.println(p.prt); //OK
		System.out.println(p.pub); //OK
	}

}
