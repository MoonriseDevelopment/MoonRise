package dev.moonrise.event.events;

import dev.moonrise.event.Event;

public class EventSlowDown extends Event {
    
	private float slowDownMultiplier;

	public EventSlowDown(float slowDownMultiplier) {
		this.slowDownMultiplier = slowDownMultiplier;
	}

	public float getSlowDownMultiplier() {
		return slowDownMultiplier;
	}

	public void setSlowDownMultiplier(float slowDownMultiplier) {
		this.slowDownMultiplier = slowDownMultiplier;
	}

}
