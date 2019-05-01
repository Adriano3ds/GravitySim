package br.me.adriano.gravitysim.Utils.Math;

public enum Constants {
	SPEEDOFLIGHT(299792458.0), GRAVITATIONAL(6.67408E-11);
	
	double value;
	Constants(double d){
		value = d;
	}
	
	public double value() {
		return value;
	}
}
