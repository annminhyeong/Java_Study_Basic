package ch13;


public class Ex7 {
	//������ �׷�
	//���� ���õ� �����带 �׷����� ��� �ٷ�� ���� ��
	//��� ������� �ݵ�� �ϳ��� ������ �׷쿡 ���ԵǾ� �־���Ѵ�.
	//������ �׷��� �������� �ʰ� ������ ������� main ������ �׷쿡 ���Ѵ�.
	//�ڽ��� ������ ������(�θ� ������)�� �׷�� �켱������ ��ӹ޴´�.
	//
	//ThreadGroup getThreadGroup() : ������ �ڽ��� ���� ������ �׷��� ��ȯ�Ѵ�.
	//
	//void uncaughtException(Thread t, Throwable e) : ó������ �ʴ� ���ܿ� ���� ������ �׷��� �����尡 ������ ���� �Ǿ��� ��, JVM�� ���� �� �޼��尡 �ڵ����� ȣ��ȴ�.
	//
	//������ �׷��� �޼���
	//ThreadGroup(String name) : ������ �̸��� ���ο� ������ �׷� ����
	//
	//ThreadGroup(ThreadGroup parent, String name) : ������ ������ �׷쿡 ���ԵǴ� ���ο� ������ �׷��� ����
	//
	//int activeCount() : ������ �׷쿡 ���Ե� Ȱ�� ���¿� �ִ� ������ �� ��ȯ
	//
	//int activeGroupCount() : ������ �׷쿡 ���Ե� Ȱ�� ���¿� �ִ� ������ �׷��� �� ��ȯ
	//
	//void checkAccess() : ���� �������� �����尡 ������ �׷��� ������ ������ �ִ��� üũ
	//
	//void destory() : ������ �׷�� ���� ������ �׷���� ��� �����Ѵ�. �� ����־�� ��������
	//
	//int enumerate(Thread[] list)
	//int enumerate(Thread[] list, boolean recurse)
	//int enumerate(ThreadGroup[] list)
	//int enumerate(ThreadGroup[] list, boolean, recurse) : ������ �׷쿡 ���� ������ �Ǵ� ���� ������ �׷��� ����� ������ �迭�� ��� �� ������ ��ȯ.
	//�ι�° �Ű������� recurse�� ���� true�� �ϸ� ������ �׷쿡 ���� ���� ������ �׷쿡 ������ �Ǵ� ������ �׷���� �迭�� ��´�.
	//
	//int getMaxPriority() : ������ �׷��� �ִ� �켱������ ��ȯ
	//
	//String getName() : ������ �׷��� �̸��� ��ȯ
	//
	//ThreadGroup getParent() : ������ �׷��� ���� ������ �׷��� ��ȯ
	//
	//void interrupt() : ������ �׷쿡 ���� ��� �����带 interrupt
	//
	//boolean isDaemon() : ������ �׷��� ���� ���������� Ȯ��
	//
	//boolean isDestroyed() : ������ �׷��� �����Ǿ����� Ȯ��
	//
	//void list() : ������ �׷쿡 ���� ������� ���� ������ �׷쿡 ���� ������ ���
	//
	//boolean parentOf(ThreadGroup g) : ������ ������ �׷��� ���� ������ �׷����� Ȯ��
	//
	//void setDaemon(boolean daemon) : ������ �׷��� ���� ������ �׷����� ����/����
	//
	//void setMaxPriority(int pri) : ������ �׷��� �ִ� �켱������ ����
}
