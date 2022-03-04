package com.generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class PersonData implements Comparable<PersonData>{
	public int id;
	public String name;
	public int salary;
	public PersonData(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "PersonData [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(PersonData o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.id, o.id);
	}
	
	
}

class SortByNames implements Comparator<PersonData>{

	@Override
	public int compare(PersonData o1, PersonData o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
	
}
public class CollectionLambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<PersonData> personData= new ArrayList<PersonData>();
		personData.add(new PersonData(101, "Vikram", 32000));
		personData.add(new PersonData(102, "Raghav", 35000));
		
		System.out.println("==========================================Person Data using ID sort/Comparable==========================");
		
		Collections.sort(personData);
		for(PersonData x:personData) {
			System.out.println(x);
		}
		System.out.println("==========================================Person Data using name sort/Comparator==========================");

		Collections.sort(personData, new SortByNames());
		for(PersonData x:personData) {
			System.out.println(x);
		}
		System.out.println("==========================================Person Data using salary sort/Lambda==========================");

		Collections.sort(personData, (P1,P2)-> P1.salary-P2.salary);
		for(PersonData x:personData) {
			System.out.println(x);
		}
	}

}
