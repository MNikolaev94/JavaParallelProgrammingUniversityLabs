package ru.spbstu.telematics.java.lab5;

public class Director implements Runnable {
	Control Security;
	public Director(Control Security){
	this.Security=Security;	
	}
	public void Close(){
		Security.Close();	
	}
	public void Open(){
		Security.Open();
	}
	public void run() {
		while(true){
			Open();
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Close();
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// TODO Auto-generated method stub

	}

}
