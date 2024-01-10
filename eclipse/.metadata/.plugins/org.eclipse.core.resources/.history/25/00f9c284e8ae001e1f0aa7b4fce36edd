package proclient.util;

public class Stopwatch {
    private long lastTime = getCurrentTime();
    public Stopwatch() {
        reset();
    }
    public long getCurrentTime() {
        return System.nanoTime() / 1000000;
    }
    public long getLastTime() {
        return lastTime;
    }
    public long getDifference() {
        return getCurrentTime() - lastTime;
    }
    public void reset() {
        lastTime = getCurrentTime();
    }
    public boolean hasReached(long milliseconds) {
        return getDifference() >= milliseconds;
    }
}