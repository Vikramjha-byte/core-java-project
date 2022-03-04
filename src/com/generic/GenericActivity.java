


package com.generic;

// Generic Class
class GenericClass<T> {// generic class of unknown type T
	T data;

	public T getdata() {
		return data;
	}

}

//Generic Bounded Type Parameter

class BoundedTypeClass<T extends Number>{
	T data;
	public T getdata() {
		return data;
	}
}
//Parameterized Generic Class
class ParametrizedGenericClass<T, U> {//Parameterized generic class with two unknown type T and U
	T data1;
	U data2;

	public ParametrizedGenericClass(T data1, U data2) {
		super();
		this.data1 = data1;
		this.data2 = data2;
	}

	public void printDetails() {
		System.out.println("Hi " + data2 + ", Your roll no. is " + data1);
	}
}

//Driver Class
public class GenericActivity {

	// Generic Method
	public static <T> void displayData(T data) {
		System.out.println(data);
	}

//Main Method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("======================== Generic Integer class=====================");

		GenericClass<Integer> intObject = new GenericClass<Integer>();
		intObject.data = 54;
		System.out.println(intObject.getdata());

		System.out.println("========================Generic String class=====================");

		GenericClass<String> strObject = new GenericClass<String>();
		strObject.data = "Vikram Kumar Jha";
		System.out.println(strObject.getdata());

		System.out.println("========================Generic Method=====================");
		GenericActivity.displayData(54);// generic method without type parameter
		GenericActivity.<String>displayData("Vikram");// Generic Method with parameter

		System.out.println("========================Generic Parametrized class=====================");

		ParametrizedGenericClass<Integer, String> paramObject = new ParametrizedGenericClass<Integer, String>(1,
				"Vikram");
		paramObject.printDetails();
		
		System.out.println("========================Generic Bounded Type class=====================");
		
		BoundedTypeClass<Integer> intObj= new BoundedTypeClass();
		intObj.data=54;
		intObj.getdata();
		
/*			
 * This will return Bound MisMatch Exception as we have extends Number in Generic class, i.e, Bound Type Parameters.
 			BoundedTypeClass<String> strObj= new BoundedTypeClass();
			strObj.data="Vikram";
			strObj.getdata();
*/
		
	}

}
