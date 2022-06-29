package ch13;


import java.util.ArrayList;

//����ȭ�� ��ü�� 1���� ���� ������ �ִ�.

//������ : ������ ���� ��, �մ��� Table�� lock(����)�� ��� �ȳ��´�.
//�ذ�å : ������ ������ wait()���� �մ��� lock(����)�� Ǯ�� ��ٸ�������
//�丮��� ������ �߰��ϸ�, notify()�� �մԿ��� �˸��� (�մ��� lock(����) ��ȹ��)

public class Ex16 {
	public static void main(String[] args) throws Exception {
		//���������尡 �����ϴ� ���̺�(�Ĵ�)��ü ����
		Table table = new Table(); 
		
		//�丮�� ��ü����, �丮�� ���������
		new Thread(new Cook(table),"COOK").start(); //new Thread�� �ι�° ���ڴ� �������̸�
		
		//�մ�1 ��ü����, �մ�1 ���������
		new Thread(new Customer(table, "donut"), "CUST1").start(); //new Thread�� �ι�° ���ڴ� �������̸�
		
		//�մ�2 ��ü����, �մ�2 ���������
		new Thread(new Customer(table, "burger"), "CUST2").start(); //new Thread�� �ι�° ���ڴ� �������̸�
		
		Thread.sleep(5000);
		System.exit(0);
	}
}

//���̺�(�Ĵ�)
class Table{
	
	//�丮�̸���????
	String[] dishNames = {"donut", "donut", "burger"};
	
	//���̺� ������ �ִ� �ִ� ���İ���
	final int MAX_FOOD = 6;
	
	//���̺� ���ĸ��
	private ArrayList<String> dishes = new ArrayList<>();
	
	public synchronized void add(String dish) {
		
		//�ִ�丮�������� �丮�Ѱ����� ������ �ֹ����
		if(dishes.size()>MAX_FOOD) return;
		
		//�ƴϸ� �����߰�
		dishes.add(dish);
		
		//���̺� ���ĸ�� ���
		System.out.println("dishes :" + dishes.toString());
	}
	
	//���̺� ���� ����
	public boolean remove(String disName) {
		synchronized (this) {
			//������ ������
			while (dishes.size()==0) {
				//������(�մ�)�̸� ����
				String name = Thread.currentThread().getName();
				
				//�ش� ������(�մ�)���� ��ٸ���� ���
				System.out.println(name + " is waiting");
				
				//500 �и��� �޽�
				try {Thread.sleep(500);} catch (InterruptedException e) {}
			}
			
			//������ ������
			for(int i=0; i<dishes.size(); i++) {
				if(disName.equals(dishes.get(i))) {
					//���ĸԱ�
					dishes.remove(i);
					return true;
				}
			}
		}
		return false;
	}
	
	//���ĸ���� ����
	public int dishNum() { return dishNames.length; }
}

//�丮��
class Cook implements Runnable{
	
	private Table table;
	Cook(Table table){ this.table = table; }
	
	@Override
	public void run() {
		while (true) {
			
			//���ĸ�Ͽ��ִ� ���� �ϳ��� ����
			int idx = (int)(Math.random()*table.dishNum());
			
			//������ ������ ���̺� ����
			table.add(table.dishNames[idx]);
			
			//100�и��� �޽�
			try {Thread.sleep(100);} catch (InterruptedException e) {}
		}
	}
}

//�մ�
class Customer implements Runnable{
	private Table table;
	private String food;
	
	Customer(Table table, String food){
		this.table = table;
		this.food = food;
	}
	
	@Override
	public void run() {
		while (true) {
			//10�и��� �޽�
			try {Thread.sleep(10);} catch (InterruptedException e) {}
			
			//�ش羲����(�մ�)�̸� ����
			String name = Thread.currentThread().getName();
			
			//���� ������ ������
			if(eatFood())
				//�Ա� ���
				System.out.println(name + " ate a " + food);
			else
				//�Ա� ���� ���
				System.out.println(name + " fail to eat. :(");
		}
	}
	
	//������ �ִ��� ������ üũ
	boolean eatFood() {return table.remove(food);}
}



