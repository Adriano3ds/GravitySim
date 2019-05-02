package br.me.adriano.gravitysim.Utils.Physics;

import java.util.TimerTask;

public class SimTimerTask extends TimerTask{
	SimTimer timer;
	double time=0.0;
	boolean paused = false;
	boolean changed = false;
	
	public SimTimerTask(){
	}
	
	public void setTimer(SimTimer _timer){
		timer = _timer;
	}

	public void run() {
		if(!paused){
			System.out.println(time + " -  YEY!");
			//timer.cancel();
			//if(time == 5 && !changed) timer.changeInterval(3,time);
			time++;
			TimeObject.run();
		}
	}
}
