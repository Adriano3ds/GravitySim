package br.me.adriano.gravitysim.Utils.Physics;

import br.me.adriano.gravitysim.Utils.Math.Vector;

public class Body extends TimeObject{
	
	public double mass;
	public Vector position;
	public Vector velocity;
	public Vector aceleration;
	public Vector centerOfMass;
	public Force[] forces;
	
	@Override
	public void tick() {
		super.tick();
	}
}
