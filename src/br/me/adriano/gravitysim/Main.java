package br.me.adriano.gravitysim;

import java.util.Timer;

import br.me.adriano.gravitysim.Physics.Body;
import br.me.adriano.gravitysim.Physics.Planet;
import br.me.adriano.gravitysim.Physics.TimeController;
import br.me.adriano.gravitysim.Physics.TimeObject;
import br.me.adriano.gravitysim.Utils.Vector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector(1), b = new Vector(1);
		System.out.println(v.angle(b) + " rad : " + 180*v.angle(b)/Math.PI + "°");
		
		Body bd = new Body();
		Planet p = new Planet();
		for(TimeObject t : TimeObject.tos) {
			System.out.println(t.getClass());
		}
		
		Timer t = new Timer();
		t.schedule(new TimeController(), 5000);
	}

}
