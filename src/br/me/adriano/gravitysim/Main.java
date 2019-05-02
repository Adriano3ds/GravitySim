package br.me.adriano.gravitysim;

import br.me.adriano.gravitysim.Utils.Math.Vector;
import br.me.adriano.gravitysim.Utils.Physics.Body;
import br.me.adriano.gravitysim.Utils.Physics.Planet;
import br.me.adriano.gravitysim.Utils.Physics.SimTime;
import br.me.adriano.gravitysim.Utils.Physics.TimeObject;

public class Main {

	public static SimTime simTime;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector(1), b = new Vector(1);
		System.out.println(v.angle(b) + " rad : " + 180*v.angle(b)/Math.PI + "°");
		
		Body bd = new Body();
		Planet p = new Planet();
		for(TimeObject t : TimeObject.tos) {
			System.out.println(t.getClass());
		}
		simTime = new SimTime();
		simTime.startTime();
		TimeSpeedControlGUI tscGUI = new TimeSpeedControlGUI(simTime);
		/*
		(new Timer()).schedule(new TimerTask(){

			@Override
			public void run() {
				Scanner scanner = new Scanner(System.in);
				try{
					double f = scanner.nextDouble();
					System.out.println("Tempo em " + f + "x");
					simTime.multiplyIntervalBy(f);
				}catch (Exception e){
					System.out.println("ERROR");
				}

			}
		}, 0, 1000);
		*/
	}

}