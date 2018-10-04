package br.me.adriano.gravitysim.Physics;

import br.me.adriano.gravitysim.Utils.Vector;

public class Body extends TimeObject{
	
	double mass;
	Vector position;
	Vector velocity;
	Vector aceleration;
	Vector centerOfMass;
	Vector[] forces;
	
	@Override
	public void tick() {
		super.tick();
	}
}
