package ru.spbstu.telematics.java.lab1;

import org.junit.Test;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.RealVector;
import org.junit.Assert;


/**
 * Unit test for simple App.
 */
public class AppTest
{
	@Test(expected = NullPointerException.class)
    public void testApp()
    {
		LS ls= new LS();
		ls.printLs("");
    }
	@Test
	public void ScalarNotNull()
	{
		Scalar a = new Scalar();
		RealVector vector1 = new ArrayRealVector(new double[] {0, 0, 0}, false);
    	RealVector vector2 = new ArrayRealVector(new double[] {9, 1, 5}, false);
    	Assert.assertNotNull(a.Scalar(vector1, vector2));
	}
	@Test
	public void ScalarNull()
	{
		Scalar a = new Scalar();
		RealVector vector1 = new ArrayRealVector(new double[] {Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE}, false);
    	RealVector vector2 = new ArrayRealVector(new double[] {Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE}, false);
    	Assert.assertNotNull(a.Scalar(vector1, vector2));    	
}
}
