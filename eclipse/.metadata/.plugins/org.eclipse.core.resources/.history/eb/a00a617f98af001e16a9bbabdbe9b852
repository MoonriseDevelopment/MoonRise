package proclient.module.misc;

import net.lax1dude.eaglercraft.v1_8.internal.KeyboardConstants;
import proclient.event.Event;
import proclient.event.events.EventUpdate;
import proclient.module.Category;
import proclient.module.Module;
import proclient.settings.Setting;
import proclient.util.MathUtil;

public class Timer extends Module{
    private final Setting speed = new Setting("Speed", this, 1, 0.1, 3, false),
    random = new Setting("Random", this, 1, 0, 1, false);
    public Timer() {
        super("Timer", KeyboardConstants.KEY_NONE, Category.MISC);
        addAll(random, speed);
    }

    @Override
    public void onEvent(Event e) {
        if(e instanceof EventUpdate && e.isPre())
            mc.timer.timerSpeed = (float) speed.getValDouble() + (float)MathUtil.randomNumber(random.getValDouble(), -random.getValDouble());
    }
}
