package br.me.adriano.gravitysim.Physics;

public class SimTime {
	SimTimerTask stt = new SimTimerTask();
	SimTimer st = new SimTimer(stt, 1);
	
	public SimTime() {
		stt.setTimer(st);
	}

	public void startTime(){
		st.start();
	}
	
	public void pause(){
		
	}
	
	public void multiplyIntervalBy(float multiplier){
		if(multiplier<=0.0f){
			this.pause();
		}else{
			st._multiplier = st.multiplier;
			st.multiplier = multiplier;
			st.changeInterval((long) (st.getInterval()*multiplier), stt.time);
		}
	}
	
	public double getTime(){
		return stt.time;
	}
}
