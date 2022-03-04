package com.generic;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Person implements Comparable<Person> {
	public int personID;
	public String personName;
	public int personAge;

	@Override
	public String toString() {
		return "Person [personID=" + personID + ", personName=" + personName + ", personAge=" + personAge + "]";
	}

	public Person(int personID, String personName, int personAge) {
		super();
		this.personID = personID;
		this.personName = personName;
		this.personAge = personAge;
	}

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.personID, o.personID);
	}

}

class sortByAge implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return o1.personAge - (o2.personAge);

	}

}

public class CollectionTreeSetActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Person> person = new TreeSet<Person>();
		person.add(new Person(101, "Vikram", 23));
		person.add(new Person(102, "Anuradha", 25));
		person.add(new Person(103, "Vinod", 50));
		person.add(new Person(104, "Ranjana", 45));

		System.out.println("===================================Person details by id ===============================");
		Iterator<Person> iterator1 = person.iterator();
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		;

		System.out.println("===================================Person details by age ===============================");
		TreeSet<Person> sortbyage = new TreeSet<Person>(new sortByAge());
		for (Person x : person) {
			sortbyage.add(x);
		}

		for (Person y : sortbyage) {
			System.out.println(y);
		}

	}

}
