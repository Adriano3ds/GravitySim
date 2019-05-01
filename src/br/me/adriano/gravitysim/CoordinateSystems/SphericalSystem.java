package br.me.adriano.gravitysim.CoordinateSystems;

import br.me.adriano.gravitysim.Utils.Math.Vector;

public class SphericalSystem extends CoordinateSystem {	
	
	public double r=0, theta=0, phi=0;
	
	public SphericalSystem(Vector _coord) {
		this.cs = CoordinateSystems.SPHERICAL;
		r = _coord.x;
		theta = _coord.y;
		phi = _coord.z;
	}
	
	public SphericalSystem(double _r, double _theta, double _phi) {
		this.cs = CoordinateSystems.SPHERICAL;
		r = _r;
		theta = _theta;
		phi = _phi;
	}
}
