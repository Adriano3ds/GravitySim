package br.me.adriano.gravitysim.CoordinateSystems;

import br.me.adriano.gravitysim.Utils.Vector;

public class CartesianSystem extends CoordinateSystem {
	
	public double x,y,z;
	
	public CartesianSystem(Vector _coord) {
		this.cs = CoordinateSystems.CARTESIAN;
		x = _coord.x;
		y = _coord.y;
		z = _coord.z;
	}
	
	public CartesianSystem(double _x, double _y, double _z) {
		this.cs = CoordinateSystems.CARTESIAN;
		x = _x;
		y = _y;
		z = _z;
	}
}
