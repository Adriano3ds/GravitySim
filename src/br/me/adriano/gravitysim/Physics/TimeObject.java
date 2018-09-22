package br.me.adriano.gravitysim.Physics;

import java.util.ArrayList;

public class TimeObject {

	public static final ArrayList<TimeObject> tos = new ArrayList<TimeObject>();
	
	public TimeObject() {
		tos.add(this);
	}
	
	public void tick() {
		
	}
	
	public static final void run() {
		for(TimeObject t : tos) {
			t.tick();
		}
	}
}
