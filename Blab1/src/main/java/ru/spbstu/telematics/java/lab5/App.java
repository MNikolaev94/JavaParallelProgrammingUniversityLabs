package ru.spbstu.telematics.java.lab5;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Control Security=new Control();
    	Director Dir = new Director(Security);
    	East east = new East(Security);
    	West west = new West(Security);
    	new Thread(Security).start();
    	new Thread(Dir).start();
    	new Thread(east).start();
    	new Thread(west).start();
    	
    }
}
