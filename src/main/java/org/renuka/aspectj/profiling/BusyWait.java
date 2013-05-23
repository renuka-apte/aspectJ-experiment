package org.renuka.aspectj.profiling;

public class BusyWait implements Runnable {

	public void run() {
        for (long i = 0; i < 1000000; i++) {
            int p = 13000/78;
        }
	}
}
