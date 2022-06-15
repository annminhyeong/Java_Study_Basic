package ch10;

import java.text.DecimalFormat;

//����ȭ Ŭ����
//java.text��Ű���� DecimalFormat(10���� ����), SimpleDateFormat(��¥)
//���ڿ� ��¥�� ���ϴ� �������� ���� ��°��� (����,��¥ -> ���� ���ڿ�)

//���Ĺ��ڿ����� ���ڿ� ��¥�� ���ϳ��� ���(���� ���ڿ� -> ����,��¥)

//DecimalFormat
//���ڸ� ����ȭ �Ҷ� ��� (���� -> ���Ĺ��ڿ�)
//�ַ� ���ڿ� ,�������� �����Ҷ� Ȱ���

//parse : ���ڿ� -> ����
//format : ���� -> ���ڿ�

public class Ex6 {
	public static void main(String[] args) {
		DecimalFormat df1 = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("0,000,0E0");
		
		try {
			Number num = df1.parse("1,234,567,89");
			System.out.print("1,234,567,89"+ " -> ");
			
			double d = num.doubleValue();
			System.out.print(d +" -> ");
			
			System.out.print(df2.format(num));
		} catch (Exception e) {
		}
	}
}
