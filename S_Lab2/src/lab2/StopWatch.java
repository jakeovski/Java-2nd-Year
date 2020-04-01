package lab2;

/**
 * A stopwatch accumulates time when it is running. You can repeatedly start and
 * stop the stopwatch. You can use a stopwatch to measure the running time of a
 * program.
 */
public class StopWatch {

    private long elapsedTime;
    private long startTime, endTime;

    /**
     * Constructs a stopwatch that is in the stopped state and has no time
     * accumulated.
     */
    public StopWatch() {
        startTime = System.nanoTime();
    }

    /**
     * Starts the stopwatch. Time starts accumulating now.
     */
    public void start() {
        startTime = System.nanoTime();
    }

    /**
     * Stops the stopwatch. Time stops accumulating and is is added to the
     * elapsed time.
     */
    public void stop() {
        endTime = System.nanoTime();
    }

    /**
     * Returns the total elapsed time.
     *
     * @return the total elapsed time
     */
    public long getTimeInNano() {
        stop();
        return (endTime - startTime);
    }
    
        /**
     * Returns the total elapsed time.
     *
     * @return the total elapsed time
     */
    public double getTimeInMilli() {
        stop();
        return (endTime - startTime)/1000000.0;
    }
    
            /**
     * Returns the total elapsed time.
     *
     * @return the total elapsed time
     */
    public double getTimeInMicro() {
        stop();
        return (endTime - startTime)/1000.0;
    }

}

