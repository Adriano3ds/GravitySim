package br.me.adriano.gravitysim.Utils.Physics;

import java.util.Timer;
import java.util.TimerTask;

public class SimTimer extends Timer{
	private SimTimerTask simTimerTask;
	private long interval;
	double multiplier = 1.0, oldMultiplier =1.0;
	
	public SimTimer(SimTimerTask _task, double newInterval) {
		simTimerTask = _task;
		interval = (long) (newInterval*1000);
	}
	
	public SimTimer(SimTimerTask _task, double newInterval, double currenttime) {
		simTimerTask = _task;
		interval = (long) (newInterval*1000);
		simTimerTask.time = currenttime;
		simTimerTask.changed = true;
	}
	
	public long getInterval() {
		return interval;
	}
	
	public void start(){
		this.start(simTimerTask, interval);
	}
	
	public void start(SimTimer newTimer, SimTimerTask newTask){
		newTask.setTimer(newTimer);
		newTimer.start(newTask, newTimer.interval);
	}
	
	public void start(TimerTask _ttask, long _interval){
		this.schedule(_ttask, 0, _interval);
	}
	
	public SimTimer changeInterval(double newinteval, double currenttime){
		this.cancel();
		System.out.println("Time Interval Changed to " + newinteval);
		SimTimerTask newtask = new SimTimerTask();
		SimTimer newtimer = new SimTimer(newtask, newinteval, currenttime);
		newtimer.oldMultiplier = oldMultiplier;
		newtimer.multiplier = multiplier;
		newtimer.start(newtimer, newtask);
		return newtimer;
	}

	SimTimerTask getTask(){
		return simTimerTask;
	}
}
