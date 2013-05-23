package org.renuka.aspectj.profiling;

public class SleepWake implements Runnable {

	public void run() {
		// simulate task
		try {
            for (int i = 0; i < 7; i++) {
                Thread.sleep(100);
            }
		} catch (final InterruptedException ex) {
			throw new RuntimeException(ex);
		}
	}
}
