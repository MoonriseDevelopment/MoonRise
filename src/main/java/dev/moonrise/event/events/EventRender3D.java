package dev.moonrise.event.events;

import dev.moonrise.event.Event;

public class EventRender3D extends Event {
    private float partialTicks;

	public EventRender3D(float partialTicks) {
		this.partialTicks = partialTicks;
	}

	public float getPartialTicks() {
		return partialTicks;
	}
}
