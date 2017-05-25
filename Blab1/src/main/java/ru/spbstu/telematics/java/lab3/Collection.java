package ru.spbstu.telematics.java.lab3;

import java.util.ArrayList;

public class Collection {

	public static void main(String[] args){
		MyList<String> states = new MyList<String>();
		ArrayList<String> statesList = new ArrayList<String>();
		// добавим в список ряд элементов
		states.add("Тигр");
		states.add("Белый флаг");
		states.add("Чай");
		states.add("Корида");
		
		statesList.add("Тигр");
		statesList.add("Белый флаг");
		statesList.add("Чай");
		statesList.add("Корида");
		
		System.out.println("MyList " + states.get(1));// получаем 2-й объект		
		System.out.println("ArrayListe " + statesList.get(1));// получаем 2-й объект
		
		System.out.printf("MyList В списке %d элементов \n", states.size());
		for(String state : states){		
			System.out.println("MyList " + state);
		}
		
		System.out.printf("ArrayListe В списке %d элементов \n", statesList.size());
		for(String stateList : statesList){		
			System.out.println("ArrayListe " + stateList);
		}
		
		if(states.contains("Тигр")){
			System.out.println("MyList Список содержит Тигр");
		}
		if(statesList.contains("Тигр")){
			System.out.println("ArrayListe Список содержит Тигр");
		}
		// удалим несколько объектов
		states.remove("Тигр");
		states.remove("Белый флаг");
		
		Object[] countries = states.toArray();
		for(Object country : countries){		
			System.out.println("MyList " + country);
		}


		statesList.remove("Тигр");
		statesList.remove("Белый флаг");
		
		Object[] countriesList = statesList.toArray();
		for(Object countryList : countriesList){		
			System.out.println("ArrayListe " + countryList);
		}
		
	}
}