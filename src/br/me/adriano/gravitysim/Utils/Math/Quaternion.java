package br.me.adriano.gravitysim.Utils.Math;

public class Quaternion{
	
	public double w=0, x=0, y=0, z=0;
	private static double magnitude=0;
	
	public Quaternion(double w, Vector v) {
		this.w = w;
		x = v.x;
		y = v.y;
		z = v.z;
		magnitude = Math.sqrt(x*x+y*y+z*z+w*w);
	}
	
	public Quaternion(Vector v) {
		x = v.x;
		y = v.y;
		z = v.z;
		magnitude = Math.sqrt(x*x+y*y+z*z);
	}
	
	public Quaternion(double w) {
		this.w = w;
		magnitude = Math.sqrt(w*w);
	}
	
	public Quaternion(double w, double x) {
		this.w = w;
		this.x = x;
		magnitude = Math.sqrt(x*x+w*w);
	}
	
	public Quaternion(double w, double x, double y) {
		this.w = w;
		this.x = x;
		this.y = y;
		magnitude = Math.sqrt(x*x+y*y+w*w);
	}
	
	public Quaternion(double w, double x, double y, double z) {
		this.w = w;
		this.x = x;
		this.y = y;
		this.z = z;
		magnitude = Math.sqrt(x*x+y*y+z*z+w*w);
	}
	
	public double magnitude() {
		return magnitude;
	}
	
	public Quaternion conjugate() {
		return new Quaternion(w, -x, -y, -z);
	}
	
	public Quaternion HamiltonProduct(Quaternion h) {
		return new Quaternion(w*h.w - x*h.x - y*h.y - z*h.z, w*h.x + x*h.w + y*h.z - z*h.y, w*h.y - x*h.z + y*h.w + z*h.x, w*h.z + x*h.y - y*h.x + z*h.w);
	}
	
	public double scalar() {
		return w;
	}
	
	public Vector vector() {
		return new Vector(x, y, z);
	}
	
	public Quaternion multiply(double scalar) {
		return new Quaternion(w*scalar, x*scalar, y*scalar, z*scalar);
	}
	
	public Quaternion divide(double scalar) {
		return this.multiply(1/scalar);
	}
	
	public Quaternion normalize() {
		return this.divide(magnitude);
	}
	
}
