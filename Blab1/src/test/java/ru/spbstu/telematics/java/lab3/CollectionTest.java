package ru.spbstu.telematics.java.lab3;

import org.junit.Assert;
import org.junit.Test;

import ru.spbstu.telematics.java.lab3.MyList;

public class CollectionTest {

	@Test
	public void CollectionGet(){
		MyList<String> states = new MyList<String>();
		states.add("Тигр");
		states.add("Белый флаг");
		states.add("Чай");
		states.add("Корида");
		Assert.assertEquals(states.get(1), "Белый флаг");
	}
}
