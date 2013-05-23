package org.renuka.aspectj.profiling;

public class TestCode implements Runnable {

	public void run() {
		new BusyWait().run();
		new SleepWake().run();
	}
}
