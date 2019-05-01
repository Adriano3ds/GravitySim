package br.me.adriano.gravitysim.Utils.Physics;

public class Planet extends AstronomicalBody{

	public double radius;

	public void attract(Body b) {
		//Do Stuff
	}
	
	@Override
	public void tick() {
		System.out.println("This is a Planet");
		super.tick();
	}
	
}
