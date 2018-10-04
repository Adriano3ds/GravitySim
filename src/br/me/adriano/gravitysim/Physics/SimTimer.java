package br.me.adriano.gravitysim.Physics;

import java.util.Timer;
import java.util.TimerTask;

public class SimTimer extends Timer{
	private SimTimerTask ttask;
	private long interval;
	float multiplier = 1.0f, _multiplier=1.0f;
	
	public SimTimer(SimTimerTask _task, long _interval) {
		ttask = _task;
		interval = _interval*1000;
	}
	
	public SimTimer(SimTimerTask _task, long _interval, double currenttime) {
		ttask = _task;
		interval = _interval*1000;
		ttask.time = currenttime;
		ttask.changed = true;
	}
	
	public long getInterval() {
		return interval;
	}
	
	public void start(){
		this.start(ttask, interval);
	}
	
	public void start(SimTimer newTimer, SimTimerTask newTask){
		newTask.setTimer(newTimer);
		newTimer.start(newTask, newTimer.interval);
	}
	
	public void start(TimerTask _ttask, long _interval){
		this.schedule(_ttask, 0, _interval);
	}
	
	public void changeInterval(long newinteval, double currenttime){
		this.cancel();
		SimTimerTask newtask = new SimTimerTask();
		SimTimer newtimer = new SimTimer(newtask, newinteval, currenttime);
		newtimer.start(newtimer, newtask);
	}
	
	public Timer getTimer(){
		return this;
	}
}
