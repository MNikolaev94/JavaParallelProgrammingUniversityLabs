package ru.spbstu.telematics.java.lab5.alter;

public class Control implements Runnable {
	Integer Numb_people=0;
	Integer Trying_people=0;

	public void Enter(){
		synchronized(Trying_people){
			Trying_people++;
		}
	}       

	public void Exit(){
		synchronized(Trying_people){
			Trying_people--;
		}
	}
	public synchronized void open(){
		notify();
	}
	
	private synchronized void DirectorDecision(){
		while(!Director.flag){
			try{
				System.out.println("Everybody leave now. Museum is closed.");
				Numb_people=0;
				wait();
			}catch (InterruptedException e){
                e.printStackTrace();
				}
		}
	}
	
	public void run() {
		while(true){
			synchronized(Trying_people){
				if (-Trying_people>Numb_people)
					Trying_people=-Numb_people;
				Numb_people+=Trying_people;
				if (Trying_people!=0)
					System.out.println("Count of people was changed: "+Trying_people+". It's "+Numb_people+" now.");
				Trying_people=0;
			}
			DirectorDecision();
		}
	}

}
