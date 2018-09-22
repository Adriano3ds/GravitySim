package br.me.adriano.gravitysim.Physics;

import br.me.adriano.gravitysim.Utils.Vector;

public class Body extends TimeObject{
	
	double mass;
	Vector position;
	Vector velocity;
	Vector aceleration;
	Vector centerOfMass;
	
	@Override
	public void tick() {
		System.out.println("This is a Body");
		super.tick();
	}
}
