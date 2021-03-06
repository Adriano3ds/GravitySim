package br.me.adriano.gravitysim.Utils.Physics;

import br.me.adriano.gravitysim.Utils.Math.Constants;
import br.me.adriano.gravitysim.Utils.Math.Vector;

public class Force extends Vector{
	
	/*
	 * This is class is currently useless
	 *  
	 * @author Adriano Junior
	 */

	public Force(Vector v) {
		super(v.x, v.y, v.z);
	}
	
	public Force(double _x, double _y, double _z) {
		super(_x, _y, _z);
	}
	
	public Force(double _x) {
		super(_x);
	}
	
	public Force(double _x, double _y) {
		super(_x, _y);
	}
	
	public static Force gravitational(Body b1, Body b2) {
		Vector radial = b1.position.from(b2.position);
		double fg = Constants.GRAVITATIONAL.value()*b1.mass*b2.mass/Math.pow(radial.magnitude(), 2);
		return new Force(radial.normalize().multiply(fg));
	}
	
	public static Force weight(AstronomicalBody ab, Body b) {
		Vector radial = ab.position.from(b.position);
		double g = Constants.GRAVITATIONAL.value()*ab.mass/Math.pow(radial.magnitude(), 2);
		return new Force(radial.normalize().multiply(b.mass*g));
	}
	
}
