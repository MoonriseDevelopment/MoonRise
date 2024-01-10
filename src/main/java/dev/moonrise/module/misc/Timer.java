package dev.moonrise.module.misc;

import org.lwjgl.input.Keyboard;
import dev.moonrise.event.Event;
import dev.moonrise.event.events.EventUpdate;
import dev.moonrise.module.Category;
import dev.moonrise.module.Module;
import dev.moonrise.util.MathUtil;

public class Timer extends Module{
    private final double speed = 3;
    private final double random = 3;
    public Timer() {
        super("Timer", Keyboard.KEY_NONE, Category.MISC);
    }

    public void onEvent(Event e) {
        if(e instanceof EventUpdate && e.isPre())
            mc.timer.timerSpeed = (float) speed + (float)MathUtil.randomNumber(random, -random);
    }
}
