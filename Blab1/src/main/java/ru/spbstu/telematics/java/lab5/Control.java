package ru.spbstu.telematics.java.lab5;

public class Control implements Runnable {
	Integer Numb_people=0;
	boolean Is_open=false;
	public void Enter(){
		if (Is_open){ 
			synchronized(Numb_people){
				Numb_people++;
			}
			System.out.println("New man");
		}
	}       


	public void Exit(){
		if (Numb_people!=0 && Is_open==true){
		synchronized(Numb_people){
			Numb_people--;
		}
		System.out.println("Bye-Bye man");
		}
	}
	public void Open(){
		Is_open=true;
		System.out.println("Open");
	}
	public void Close(){
		Is_open=false;
		Numb_people=0;
		System.out.println("Close");
	}
	public void run() {
		while(true);
		// TODO Auto-generated method stub

	}

}
