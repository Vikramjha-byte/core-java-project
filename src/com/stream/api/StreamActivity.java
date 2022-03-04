package com.stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class StreamActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> versions = Arrays.asList("JDK5", "JDK6", "JDK7", "JDK8");
//		for(String v : versions) {
//			System.out.println(v);
//		}
//		
//		From JDK 8 : 
		versions.forEach((x) -> System.out.println(x));// Terminal operator: used to traverse the stream and produce an
														// output. Intermediate Operation: along the traversing
														// ,meanwhile performing operation and then produces the result

		/*
		 * Before JDK 8.........................
		 * 
		 * 
		 * Consumer<String> element = new Consumer<>() {
		 * 
		 * @Override public void accept(String t) { System.out.println(t);} };
		 * versions.forEach(element);
		 * 
		 * Using Lambda.....................
		 * 
		 * Consumer<String> element = (t) -> { System.out.println(t); };
		 * versions.forEach(element);
		 * 
		 * 
		 * Predicate<String> predicate= new Predicate<String>() {

			@Override
			public boolean test(String t) {
				// TODO Auto-generated method stub
				return false;
			}
		};
		
		Supplier<T> supplier= new Supplier<T>() {

			@Override
			public T get() {
				// TODO Auto-generated method stub
				return null;
			}
		};
		 */
		
		
		ArrayList<Integer> arrList= new ArrayList<>();
		arrList.add(12);
		arrList.add(34);
		arrList.add(55);
		arrList.add(12);
		
//		arrList.stream().filter((e)-> e%2==0).forEach((x)-> System.out.println(x));// Simple Lambdas Expression
		
//		arrList.stream().filter((e)-> e%2==0).forEach(System.out::println);//Method References : --- which is more compact than lambdas
		/*
		 * long count = versions.stream().filter((x) -> x.startsWith("J")).count();
		 * System.out.println(count);
		 */
		System.out.println("=========================Unique Elements========================");
//		 arrList.stream().distinct().forEach(System.out::println);
//		arrList.stream().sorted().forEach(System.out::println);
		
		arrList.stream().sorted().filter((x)-> Collections.frequency(arrList, x)==1 ).forEach(System.out::println);
		System.out.println("=========================Square of Elements========================");
		
		arrList.stream().map((x)-> x*x).forEach(System.out::println);

	}

}
