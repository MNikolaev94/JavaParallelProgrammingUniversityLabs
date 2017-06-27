package ru.spbstu.telematics.java.lab5.alter;

public class Director implements Runnable {
	Control Security;
	public static boolean flag=true;
	public Director(Control Security){
	this.Security=Security;	
	}
	private void Close(){
		flag=false;
		System.out.println("Close");
	}
	private void Open(){
		flag=true;
		Security.open();
		System.out.println("Open");
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
