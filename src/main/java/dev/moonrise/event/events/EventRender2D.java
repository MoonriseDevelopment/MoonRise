package dev.moonrise.event.events;

import dev.moonrise.event.Event;

public class EventRender2D extends Event {
    
	private int width;
	private int height;

	public EventRender2D(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

}
