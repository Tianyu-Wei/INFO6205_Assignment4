package edu.neu.coe.info6205.util;

public class StopWatch {
	private long startTime = -1;
	  private long stopTime = -1;
	  private boolean running = false;

	  public StopWatch start() {
	    startTime = System.currentTimeMillis();
	    running = true;
	    return this;
	  }

	  public StopWatch stop() {
	    stopTime = System.currentTimeMillis();
	    running = false;
	    return this;
	  }

	  public long getElapsedTime() {
	    if (startTime == -1) {
	      return 0;
	    }
	    if (running) {
	      return System.currentTimeMillis() - startTime;
	    }
	    else {
	      return stopTime - startTime;
	    }
	  }

	  public StopWatch reset() {
	    startTime = -1;
	    stopTime = -1;
	    running = false;
	    return this;
	  }

//	  public static void main(String[] args)
//	  {
//	    StopWatch s = new StopWatch();
//	    s.start();
//	    // your code runs here
//	    s.stop();
//	    System.err.println("elapsed time: " + s.getElapsedTime());
//	  }
}
