package ch13;


public class Ex7 {
	//쓰레드 그룹
	//서로 관련된 쓰레드를 그룹으로 묶어서 다루기 위한 것
	//모든 쓰레드는 반드시 하나의 쓰레드 그룹에 포함되어 있어아한다.
	//쓰레드 그룹을 지정하지 않고 생성한 쓰레드는 main 쓰레드 그룹에 속한다.
	//자신을 생성한 쓰레드(부모 쓰레드)의 그룹과 우선순위를 상속받는다.
	//
	//ThreadGroup getThreadGroup() : 쓰레드 자신이 속한 쓰레드 그룹을 반환한다.
	//
	//void uncaughtException(Thread t, Throwable e) : 처리되지 않는 예외에 의해 쓰레드 그룹의 쓰레드가 실행이 종료 되었을 때, JVM에 의해 이 메서드가 자동으로 호출된다.
	//
	//쓰레드 그룹의 메서드
	//ThreadGroup(String name) : 지정된 이름의 새로운 쓰레드 그룹 생성
	//
	//ThreadGroup(ThreadGroup parent, String name) : 지정된 쓰레드 그룹에 포함되는 새로운 쓰레드 그룹을 생성
	//
	//int activeCount() : 쓰레드 그룹에 포함된 활성 상태에 있는 쓰레드 수 반환
	//
	//int activeGroupCount() : 쓰레드 그룹에 포함된 활성 상태에 있는 쓰레드 그룹의 수 반환
	//
	//void checkAccess() : 현재 실행중인 쓰레드가 쓰레드 그룹을 변경할 권한이 있는지 체크
	//
	//void destory() : 쓰레드 그룹과 하위 쓰레드 그룹까지 모두 삭제한다. 단 비어있어야 삭제가능
	//
	//int enumerate(Thread[] list)
	//int enumerate(Thread[] list, boolean recurse)
	//int enumerate(ThreadGroup[] list)
	//int enumerate(ThreadGroup[] list, boolean, recurse) : 쓰레드 그룹에 속한 쓰레드 또는 하위 쓰레드 그룹의 목록을 지정된 배열에 담고 그 개수를 반환.
	//두번째 매개변수인 recurse의 값을 true로 하면 쓰레드 그룹에 속한 하위 쓰레드 그룹에 쓰레드 또는 쓰레드 그룹까지 배열에 담는다.
	//
	//int getMaxPriority() : 쓰레드 그룹의 최대 우선순위를 반환
	//
	//String getName() : 쓰레드 그룹의 이름을 반환
	//
	//ThreadGroup getParent() : 쓰레드 그룹의 상위 쓰레드 그룹을 반환
	//
	//void interrupt() : 쓰레드 그룹에 속한 모든 쓰레드를 interrupt
	//
	//boolean isDaemon() : 쓰레드 그룹이 데몬 쓰레드인지 확인
	//
	//boolean isDestroyed() : 쓰레드 그룹이 삭제되었는지 확인
	//
	//void list() : 쓰레드 그룹에 속한 쓰레드와 하위 쓰레드 그룹에 대한 정보를 출력
	//
	//boolean parentOf(ThreadGroup g) : 지정된 쓰레드 그룹의 상위 쓰레드 그룹인지 확인
	//
	//void setDaemon(boolean daemon) : 쓰레드 그룹을 데몬 쓰레드 그룹으로 설정/해제
	//
	//void setMaxPriority(int pri) : 쓰레드 그룹의 최대 우선순위를 설정
}
