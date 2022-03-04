package com.generic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.Vector;

class Employee implements Comparable<Employee> {
	public int EmployeeId;
	public String EmployeeName;
	public int Salary;

	@Override
	public String toString() {
		return "Employee [EmployeeId=" + EmployeeId + ", EmployeeName=" + EmployeeName + ", Salary=" + Salary + "]";
	}

	public Employee(int employeeId, String employeeName, int salary) {
		super();// Inheriting the object class
		EmployeeId = employeeId;
		EmployeeName = employeeName;
		Salary = salary;
	}

	@Override
	public int compareTo(Employee o) {
		if (this.EmployeeId > o.EmployeeId)
			return 1;
		else if (this.EmployeeId < o.EmployeeId)
			return -1;
		return 0;
//		OR
//		return this.EmployeeId-o.EmployeeId;
//		OR
//		return Integer.compare(this.EmployeeId, o.EmployeeId);
	}
}

class SortByName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.EmployeeName.compareTo(o2.EmployeeName);

	}

}

public class CollectionActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arrList = new ArrayList();
		arrList.add("Vikram");
		arrList.add("Ranjana");
		arrList.add("Vinod");
		arrList.add("Anuradha");
		arrList.add("Vikram");
		System.out
				.println("===================================ArrayList Implementation===============================");
		System.out.println(arrList);

		// TreeSet

		TreeSet treeSet = new TreeSet();
		treeSet.add("Vikram");
		treeSet.add("Ranjana");
		treeSet.add("Vinod");
		treeSet.add("Anuradha");
		treeSet.add("Vikram");

		System.out.println("===================================TreeSet Implementation===============================");
		System.out.println(treeSet);

		// Integer Collection of TreeSet

		TreeSet treeNumSet = new TreeSet();
		treeNumSet.add(12);
		treeNumSet.add(05);
		treeNumSet.add(24);
		treeNumSet.add(27);
		treeNumSet.add(12);
		System.out.println(
				"===================================TreeSet Integer Implementation===============================");
		System.out.println(treeNumSet);

		// TreeSet with different data type : works only on Homogeneous element, Throws
		// ClassCastException if use the different data type
		TreeSet treediffSet = new TreeSet();
		treediffSet.add("12");
		treediffSet.add("Vikram");
		treediffSet.add("true");
		System.out.println(
				"===================================TreeSet Different Data Type Implementation===============================");
		System.out.println(treediffSet);

		/*
		 * Constructor in TreeSet: TreeSet ts1= new TreeSet();: Natural order sorting
		 * TreeSet ts1= new TreeSet(null);: Natural order sorting TreeSet ts1= new
		 * TreeSet<>(Collection );: TreeSet ts1= new TreeSet<>(Comparator );:
		 */
		TreeSet<Integer> intTreeSet = new TreeSet<>();
		intTreeSet.add(12);
		intTreeSet.add(11);
		intTreeSet.add(1998);
		System.out.println(
				"===================================TreeSet Integer Generic and Iterator Implementation===============================");
		System.out.println(intTreeSet);

		/*
		 * Difference Between Fail Fast and Fail Safe Iterators The Major difference
		 * between Fail Fast and Fail Safe iterator is that the Fail Safe does not throw
		 * any ConcurrentModificationException in modifying the object during the
		 * iteration process, contrary to fail fast, which throws an exception in such
		 * scenarios. This is because the Fail Safe iterator works on a cloned
		 * collection instead of the original collection.
		 * 
		 * Iterator : Abstract method of Iterable interface
		 */

		Iterator iterator = intTreeSet.iterator();
		System.out.println("==========================Using Iterator Interface===================================");
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}

		/// Linked List: implement on the concept of doublyLL; Node based approach;
		/// Performance is much faster Vs ArrayList: Dynamic in nature, Traversing in
		/// forward direction,Exceeds the capacity by 50%,works on Index based approach,
		/// Adding and removing the element is time consuming

		ArrayList<Integer> lst = new ArrayList<>();
		lst.add(12);
		lst.add(11);
		lst.add(1998);
		System.out.println(
				"===================================ArrayList Methods: Dynamic in nature(Keeps on growing)===============================");
		System.out.println(lst);
		System.out.println("Size of arrayList" + lst.size());

		// Linked List

		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(12);
		ll.add(11);
		ll.add(1998);
		System.out
				.println("===================================LinkedList Implementation===============================");
		System.out.println(ll);
		System.out.println("Size of linkedlist " + ll.size());

		// Vector Capacity and size

		Vector<Integer> vector = new Vector<>();
		vector.add(12);
		vector.add(11);
		vector.add(1998);
		System.out.println(
				"===================================Vector Methods: Capacity and Size===============================");
		System.out.println(vector);
		System.out.println("Size of vector: " + vector.size());
		System.out.println("Capacity of vector: " + vector.capacity());

		////// Working on User defined objects to resolve the class cast exception we
		////// need to specify the sorting order for the user defined class ,we are
		////// changing the behaviour of our original class(Employee)by implementing
		////// Comparable interface one single abstract method compareTo ---we need
		////// override the same.
		System.out.println(
				"===================================TreeSet Userdefined objects===============================");

		TreeSet<Employee> employee = new TreeSet<Employee>();
		employee.add(new Employee(101, "Vikram", 38000));
		employee.add(new Employee(102, "Anuradha", 39000));
		employee.add(new Employee(103, "Vinod", 60000));
		employee.add(new Employee(104, "Ranjana", 60000));
		System.out.println(
				"===================================Employee details by id objects===============================");

		Iterator<Employee> iterator1 = employee.iterator();
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		System.out
				.println("===================================Employee Details by Name===============================");
		TreeSet<Employee> sortbyname = new TreeSet<Employee>(new SortByName());
		for (Employee x : employee) {
			sortbyname.add(x);
		}

		for (Employee y : sortbyname) {
			System.out.println(y);
		}

	}

}
