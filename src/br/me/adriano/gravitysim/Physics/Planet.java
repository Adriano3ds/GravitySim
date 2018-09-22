package br.me.adriano.gravitysim.Physics;

public class Planet extends Body{
	
	double radius;
	
	public void attract(Body b) {
		//Do Stuff
	}
	
	@Override
	public void tick() {
		System.out.println("This is a Planet");
		super.tick();
	}
	
}
