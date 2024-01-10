package dev.moonrise.event.events;

import net.minecraft.client.gui.ScaledResolution;
import dev.moonrise.event.Event;

public class EventRenderGUI extends Event<EventRenderGUI> {
    public ScaledResolution sr;

    public EventRenderGUI(ScaledResolution sr) {
        this.sr = sr;
    }
}