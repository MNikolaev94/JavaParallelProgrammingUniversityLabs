package ru.spbstu.telematics.java.lab5;

import java.util.Random;

public class East implements Runnable {
	Control Security;
	public East(Control Security){
	this.Security=Security;	
	}
	void Exit(){
		Security.Exit();
	}
	public void run() {
		while(true){
			Exit();
			try {
				Thread.sleep(new Random().nextInt(3000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// TODO Auto-generated method stub

	}

}
