package ch12;
//������
//���õ� ������� ���� ���� ���� ��. Java�� Ÿ�Կ� ������ �������� ����
//����: enum �������̸�{�����1, �����2, ...}
//������ ����� �񱳿����� ���Ұ�
//CompareTo() ������ 0, ������ ũ�� ���, �������� ũ�� ����
//
//�������� ���� - java.lang.Enum
//��� �������� Enum�� �ڼ��̸�, �Ʒ��� �޼��带 ��ӹ޴´�.
//Class<E> getDeclaringClass() : �������� Class��ü�� ��ȯ
//String name() : ������ ����� �̸��� ���ڿ��� ��ȯ
//int ordinal() : ������ ����� ���ǵ� ������ ��ȯ
//T valueOf(Class<T> enumType, String name) : ������ ���������� name�� ��ġ�ϴ� ������ ����� ��ȯ
//
//values(), valueOf()�� �����Ϸ��� �ڵ����� �߰�


//������ ���� ��ü��
//              0      1      2     3
enum Direction{EAST, SOUTH, WEST, NORTH}

public class Ex9 {
	public static void main(String[] args) {
		Direction d1 = Direction.EAST;
		Direction d2 = Direction.valueOf("WEST");
		Direction d3 = Direction.valueOf(Direction.class, "EAST");
		
		System.out.println("d1="+d1);
		System.out.println("d2="+d2);
		System.out.println("d3="+d3);
		
		System.out.println("d1==d2 ? "+(d1==d2));
		System.out.println("d1==d3 ? "+(d1==d3));
		
		//������ ����� �񱳿����� ���Ұ�, �� ��񱳿����ڴ� ����
		//System.out.println("d1>d3 ?"+(d1>d3));
		
		System.out.println("d1.equals(d3) ? "+d1.equals(d3));
		
		System.out.println("d1.compareTo(d2) ? " + d1.compareTo(d2));
		System.out.println("d1.compareTo(d3) ? " + d1.compareTo(d3));
		
		
		switch (d1) {
		case EAST:
			System.out.println("The direaction is EAST");
			break;
		case SOUTH:
			System.out.println("The direaction is SOUTH");
			break;
		case WEST:
			System.out.println("The direaction is WEST");
			break;
		case NORTH:
			System.out.println("The direaction is NORTH");
			break;
		}
		
		Direction[] dArr = Direction.values(); //�������� ��� ����� �迭�� ��ȯ
		
		for(Direction d : dArr) {
			System.out.printf("%s=%d%n", d.name(), d.ordinal());
		}
		
	}
}


















