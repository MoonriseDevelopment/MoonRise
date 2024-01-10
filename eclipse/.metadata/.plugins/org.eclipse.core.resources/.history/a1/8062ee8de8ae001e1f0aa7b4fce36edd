package proclient.util;

import net.minecraft.client.Minecraft;

public class Timer {

    public long lastMs;
    private long pastMS;
    public long lastMS = System.currentTimeMillis();

    public void reset() {
        lastMS = System.currentTimeMillis();
    }

    public boolean hasTimeElapsed(long time, boolean reset) {
        if (System.currentTimeMillis() - lastMS > time) {
            if (reset)
                reset();


            return true;
        }

        return false;
    }
    public boolean hasReached(long milliseconds) {
        return getTime() - lastMS >= milliseconds;
    }
    public long getTime() {
        return System.currentTimeMillis() - lastMS;
    }

    public void setTime(long time) {
        lastMS = time;
    }

    public boolean isDelayComplete(float f) {
        if(System.currentTimeMillis() - this.lastMS >= f) {
            return true;
        }
        return false;
    }

	public boolean delay(double d) {
		return false;
	}
    public void setLastMS(long lastMS) {
        this.lastMS = lastMS;
    }
	
	public final boolean delay(long delay) {
		if (System.currentTimeMillis() - pastMS > delay) {
			reset();
			return true;
		}
		return false;
	}

    public void mcTimeSpeed(double speed) {
        Minecraft.getMinecraft().timer.timerSpeed = (float) speed;
    }
}
