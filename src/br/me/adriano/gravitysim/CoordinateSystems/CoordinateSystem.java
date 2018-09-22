package br.me.adriano.gravitysim.CoordinateSystems;

public class CoordinateSystem {
	
	protected CoordinateSystems cs;
	
	public CoordinateSystem toSpherical() {
		if(this.cs == CoordinateSystems.CARTESIAN) {
			double x = ((CartesianSystem)this).x;
			double y = ((CartesianSystem)this).y;
			double z = ((CartesianSystem)this).z;
			return new SphericalSystem(Math.sqrt(x*x + y*y + z*z), Math.atan(y/x), Math.atan(Math.sqrt(x*x + y*y)/z));
		}
		return this;
	}
	
	public CoordinateSystem toCartesian() {
		if(this.cs == CoordinateSystems.SPHERICAL) {
			double r = ((SphericalSystem)this).r;
			double p = ((SphericalSystem)this).phi;
			double t = ((SphericalSystem)this).theta;
			return new CartesianSystem(r*Math.acos(t)*Math.asin(p), r*Math.asin(t)*Math.asin(p), r*Math.acos(p));
		}
		return this;
	}
	
	public boolean isEqual(CoordinateSystem c) {
		if(this.cs == CoordinateSystems.CARTESIAN && c.cs == CoordinateSystems.SPHERICAL)
			c=c.toCartesian();
		if(this.cs == CoordinateSystems.SPHERICAL && c.cs == CoordinateSystems.CARTESIAN)
			c=c.toSpherical();
		return this == c;
	}
	
}
