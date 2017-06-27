package ru.spbstu.telematics.java.lab5.alter;

import java.util.Random;

public class West implements Runnable {
	Control Security;
	public West(Control Security){
	this.Security=Security;	
	}
	void Enter(){
		Security.Enter();
	}
	public void run() {
		while(true){
			Enter();
			try {
				Thread.sleep(new Random().nextInt(3000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
