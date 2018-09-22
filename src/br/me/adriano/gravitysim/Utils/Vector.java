package br.me.adriano.gravitysim.Utils;

public class Vector {
	
	/*
	 *    Notation: <axis> (positive/negaitve)
	 *    
	 *    z  (up/down)
	 *    |-- y  (left/right)
	 *   /
	 *  x  (foward/back)
	 *  
	 *  @author Adriano Junior 
	 */
	
	public double x=0, y=0, z=0;
	private static double magnitude=0;
	
	public Vector(double _x, double _y, double _z) {
		x=_x;
		y=_y;
		z=_z;
		magnitude = Math.sqrt(x*x+y*y+z*z);
	}
	
	public Vector(double _x) {
		x = _x;
		magnitude = Math.sqrt(x*x+y*y+z*z);
	}
	
	public Vector(double _x, double _y) {
		x = _x;
		y = _y;
		magnitude = Math.sqrt(x*x+y*y+z*z);
	}
	
	public double magnitude() {
		return magnitude;
	}
	
	public double angle(Vector v) {
		return Math.acos(this.dot(v)/(magnitude*v.magnitude()));
	}
	
	public double distance(Vector v) {
		return Math.sqrt(Math.pow(x-v.x, 2) + Math.pow(y-v.y, 2) + Math.pow(z-v.z, 2));
	}
	
	public Vector sum(Vector v) {
		return new Vector(x+v.x, y+v.y, z+v.z);
	}
	
	public Vector subtract(Vector v) {
		return new Vector(x-v.x, y-v.y, z-v.z);
	}
	
	public Vector multiply(double scalar) {
		return new Vector(x*scalar, y*scalar, z*scalar);
	}
	
	public Vector to(Vector v) {
		return v.subtract(this);
	}
	
	public Vector from(Vector v) {
		return this.subtract(v);
	}
	
	public Vector reflect() {
		return this.multiply(-1);
	}
	
	public double dot(Vector v) {
		return x*v.x + y*v.y + z*v.z;
	}
	
	public Vector cross(Vector v) {
		return new Vector(y*v.z, z*v.x-x*v.z, x*v.y-y*v.x);
	}
	
	public Vector divide(double scalar) {
		return this.multiply(1/scalar);
	}
	
	public Vector normalize() {
		return this.divide(magnitude);
	}
	
	public Vector clamp(double maxLenght) {
		return this.normalize().multiply(maxLenght);
	}
	
	public Vector projection(Vector v) {
		return v.multiply(this.dot(v)/(v.magnitude()*v.magnitude()));
	}
	
	public Vector lerp(Vector v, double alpha) {
		if(alpha<=1 && alpha>=0) 
			return this.multiply(alpha).sum(v.multiply(1-alpha));
		return this;
	}
	
	public Vector slerp(Vector v, double alpha) {
		double a = this.angle(v);
		if(alpha<=1 && alpha>=0) 
			return this.multiply(Math.sin(alpha*a)/Math.sin(a)).sum(v.multiply(Math.sin((1-alpha)*a)/Math.sin(a)));
		return this;
	}
	
	public static Vector zero() {
		return new Vector(0);
	}
	
	public static Vector one() {
		return new Vector(1,1,1);
	}
	
	public static Vector up() {
		return new Vector(0,0,1);
	}
	
	public static Vector down() {
		return new Vector(0,0,-1);
	}
	
	public static Vector forward() {
		return new Vector(1);
	}
	
	public static Vector back() {
		return new Vector(-1);
	}
	
	public static Vector right() {
		return new Vector(0, -1);
	}
	
	public static Vector left() {
		return new Vector(0, 1);
	}
}
