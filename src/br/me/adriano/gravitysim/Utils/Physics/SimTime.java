package br.me.adriano.gravitysim.Utils.Physics;

public class SimTime {
	SimTimerTask simTimerTask = new SimTimerTask();
	SimTimer simTimer = new SimTimer(simTimerTask, 1);
	
	public SimTime() {
		simTimerTask.setTimer(simTimer);
	}

	public void startTime(){
		simTimer.start();
	}
	
	public void pause(){
		simTimerTask.paused = true;
	}

	public void unpause(){
		simTimerTask.paused = false;
	}
	
	public void multiplyIntervalBy(double multiplier){
		if(multiplier<=0.0f){
			this.pause();
		}else{
			this.unpause();
			simTimer.oldMultiplier = simTimer.multiplier;
			simTimer.multiplier = multiplier;
			simTimer = simTimer.changeInterval(simTimer.getInterval()*multiplier/(simTimer.oldMultiplier *1000), simTimerTask.time);
			simTimerTask = simTimer.getTask();
		}
	}

	public double speedUp(){
		double newMultiplier = simTimer.multiplier/2;
		this.multiplyIntervalBy(newMultiplier);
		return newMultiplier;
	}

	public double speedDown(){
		double newMultiplier = simTimer.multiplier*2;
		this.multiplyIntervalBy(newMultiplier);
		return newMultiplier;
	}

	public double getTime(){
		return simTimerTask.time;
	}
}
