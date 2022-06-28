package ch13;

public class Ex9 {
	//쓰레드의 상태
	//NEW : 쓰레드가 생성되고 아직 start()가 호출되지 않는 상태
	//
	//RUNNABLE : 실행 중 또는 실행 가능한 상태
	//
	//BLOCKED : 동기화블럭에 의해서 일시정지된 상태(lock이 풀릴 때까지 기다리는 상태)
	//
	//WAITING
	//TIME_WAITING : 쓰레드 작업이 종료되지는 않았지만 실행가능하지 않은 일시정지 상태. TIMED_WAITING은 일시정지시간이 지정된 경우를 의미
	//
	//suspend() : 일시정지
	//sleep() : 쉬기
	//wait() : 기다리기
	//join() : 다른 쓰레드 기다리기
	//I/O block : 입출력 대기
	//
	//time-out : 시간종료
	//resume() : 재개, suspend()와 한쌍
	//notify() : 재개, wait()과 한쌍
	//interrupt() : 깨우기
	//
	//TERMINATED : 쓰레드의 작업이 종료된 상태
	//
	//쓰레드의 실행 제어 메서드
	//
	//static void sleep(long millis)
	//static void sleep(long millis, int nanos) : 지정된 시간동안 쓰레드를 일시정지 시킨다. 지정된 시간이 지나고 나면 자동으로 다시 실행대기상태가 된다.
	//
	//void join()
	//void join(ong millis)
	//void join(ong millis, int nanos) : 지정된 시간동안 쓰레드가 실행되도록 한다. 지정된 시간이 지나거나 작업이 종료되면 join()을 호출한 쓰레드로 돌아와 실행을 계속한다.
	//
	//void interrupt() : sleep()이나 join()에 의해 일시정지인 쓰레드를 깨워서 실행대기상태로 만든다. 해당 쓰레드에서는 Interruupted Exception이 발생함으로써 일시정지 상태를 벗어나게된다.
	//
	//void stop() : 쓰레드를 즉시 종료시킨다.
	//
	//void suspend() : 쓰레드를 일시정지시킨다. resume()을 호출하면 다시 실행대기상태가 된다.
	//
	//void resume() : suspend()에 의해 일시정지상태에 있는 쓰레드를 실행대기상태로 만든다.
	//
	//static void yieid() : 실행 중에 자신에게 주어진 실행시간을 다른 쓰레드에게 양보하고 자신은 실행대기 상태가 된다.
	//
	//**static 붙은 메서드는 자기자신만 호출가능**
}
