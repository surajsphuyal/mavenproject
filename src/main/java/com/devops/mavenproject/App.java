package com.devops.mavenproject;

/**
 * Hello world!
 *
 */
public class App 
{
	int puppyAge;
	
	public App(String name) {
		
		System.out.println("Name choosen is: "+ name);
	}
	
	public void setAge( int age ) {
		puppyAge = age;
	}
	
	public void getAge() {
		System.out.println("Puppy age is: "+ puppyAge);
		
	}
	
	
	
    public static void main( String[] args )
    {
        App app = new App("Tommy");
        app.setAge(3);
        app.getAge();
        System.out.println("Variable value: "+ app.puppyAge);
    }
}
