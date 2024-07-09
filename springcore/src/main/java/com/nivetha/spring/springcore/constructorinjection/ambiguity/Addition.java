package com.nivetha.spring.springcore.constructorinjection.ambiguity;

public class Addition {

	/*
	 * Case1 Starts: Addition(int a, int b){
	 * System.out.println("Inside Constructor Int"); }
	 * 
	 * Addition(double a, double b){
	 * System.out.println("Inside Constructor Double"); } Case1 Ends
	 */

	/*
	 * Case2 Starts Addition(double a, double b){
	 * System.out.println("Inside Constructor Double"); }
	 * 
	 * Addition(int a, int b){ System.out.println("Inside Constructor Int"); }
	 */

	/*
	 * Case 3 Starts Addition(double a, double b){
	 * System.out.println("Inside Constructor Double"); }
	 * 
	 * Addition(int a, int b){ System.out.println("Inside Constructor Int"); }
	 * 
	 * Addition(String a, String b){
	 * System.out.println("Inside Constructor String"); }
	 */

	/*
	 * Case 4 Accepting a as int and b as double Addition(int a, double b){
	 * System.out.println("Inside Constructor"); System.out.println(a);
	 * System.out.println(b); }
	 */

	/* Case 4 Accepting a as int and b as double */
	Addition(int a, double b) {
		System.out.println("Inside Constructor");
		System.out.println(a);
		System.out.println(b);
	}

}