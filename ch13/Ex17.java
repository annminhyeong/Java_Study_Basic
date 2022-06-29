package ch13;

import java.util.ArrayList;

//wait()�� notify()
//����ȭ�� ȿ���� ���̱� ���� wait(), notify()�� ���
//
//Object Ŭ������ ���ǵǾ� ������, ����ȭ ��� �������� ����� �� �ִ�.
//
//wait() : ��ü�� lock�� Ǯ�� �����带 �ش� ��ü�� waiting pool�� �ִ´�. (���� �ݳ�)
//
//notify() : waiting pool���� ������� ���������� �������� �ϳ��� �����. (���� ��ȹ��)
//
//notifyAll() : waiting pool���� ������� ��� �����带 �����. (�� �� �ϳ��� �����尡 ���� ��ȹ��)

public class Ex17 {
	public static void main(String[] args) throws Exception {
		//���������尡 �����ϴ� ���̺�(�Ĵ�)��ü ����
		Table2 table = new Table2(); 
		
		//�丮�� ��ü����, �丮�� ���������
		new Thread(new Cook2(table),"COOK").start(); //new Thread�� �ι�° ���ڴ� �������̸�
		
		//�մ�1 ��ü����, �մ�1 ���������
		new Thread(new Customer2(table, "donut"), "CUST1").start(); //new Thread�� �ι�° ���ڴ� �������̸�
		
		//�մ�2 ��ü����, �մ�2 ���������
		new Thread(new Customer2(table, "burger"), "CUST2").start(); //new Thread�� �ι�° ���ڴ� �������̸�
		
		Thread.sleep(5000);
		System.exit(0);
	}
}

//���̺�(�Ĵ�)
class Table2{
	
	//�丮�̸���????
	String[] dishNames = {"donut", "donut", "burger"};
	
	//���̺� ������ �ִ� �ִ� ���İ���
	final int MAX_FOOD = 6;
	
	//���̺� ���ĸ��
	private ArrayList<String> dishes = new ArrayList<>();
	
	public synchronized void add(String dish) {
		
		//�ִ�丮�������� �丮�Ѱ����� ������
		while(dishes.size()>MAX_FOOD) {
			//������ �̸�(�մ�)�̸� ����
			String name = Thread.currentThread().getName();
			
			//�մԿ��� ���ı�ٸ���� ���
			System.out.println(name+" is waiting");
			
			try {
				wait(); //�մ��� ��ȣǥ�� �ݳ��� �丮�簡 �丮�� �ð��� ��
			} catch (InterruptedException e) {}
			
		}
		
		//�ƴϸ� �����߰�
		dishes.add(dish);
		
		//��ٸ��մԿ��� �˸�
		notify();
		
		//���̺� ���ĸ�� ���
		System.out.println("dishes :" + dishes.toString());
	}
	
	//���̺� ���� ����
	public void remove(String disName) {
		synchronized (this) {
			
			//������(�մ�)�̸� ����
			String name = Thread.currentThread().getName();
			
			//������ ������
			while (dishes.size()==0) {
				
				//�ش� ������(�մ�)���� ��ٸ���� ���
				System.out.println(name + " is waiting");
				
				//
				try {
					wait(); //������ �����Ƿ� ��ȣǥ�� �ݳ���
					Thread.sleep(500);
				} catch (InterruptedException e) {}
			}
			
			
			while (true) {
				//������ ������
				for(int i=0; i<dishes.size(); i++) {
					if(disName.equals(dishes.get(i))) {
						//���ĸԱ�
						dishes.remove(i);
						
						//�丮�� ���̺��� �������Ƿ� �丮�縦 ����
						notify();
						return;
					}
				}
				
				//���ϴ� ������ ���� ���
				try {
					//�ش� ������(�մ�)���� ��ٸ���� ���
					System.out.println(name + " is waiting");
					wait();
					Thread.sleep(500);
				} catch (InterruptedException e) {}
			}//while
		}
	}
	
	//���ĸ���� ����
	public int dishNum() { return dishNames.length; }
}

//�丮��
class Cook2 implements Runnable{
	
	private Table2 table;
	Cook2(Table2 table){ this.table = table; }
	
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
class Customer2 implements Runnable{
	private Table2 table;
	private String food;
	
	Customer2(Table2 table, String food){
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
			
			table.remove(food);
			System.out.println(name + " ate a " + food);
		}
	}
}
