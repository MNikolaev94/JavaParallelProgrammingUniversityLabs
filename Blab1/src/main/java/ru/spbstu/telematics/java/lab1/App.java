package ru.spbstu.telematics.java.lab1;

import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealVector;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    		LS ls = new LS();
    		ls.printLs("/");
    		
    		Scalar data = new Scalar();
        	RealVector vector1 = new ArrayRealVector(new double[] {3, 8, 9}, false);
        	RealVector vector2 = new ArrayRealVector(new double[] {7, 4, 5}, false);
        	double scalarResult = data.Scalar(vector1, vector2);
        	System.out.println("Скаллярное произведение 2-х векторов vector1 = " + vector1 + " и vector2 = " + vector2 + " = " + scalarResult);
        	
        	
    }
}
