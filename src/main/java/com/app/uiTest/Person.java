package com.app.uiTest;

class Student {	
	int studentId;
	String studentName;	
	String age;	
	String studentClass;
}

public class Person {

	// These are called 'FIELDS' OR PROPERTIES.
	float weight; // 25.6lb
	int age; // 5	
	float height; // 5.6ft
	
    public static void main(String args[]) {

      int x=10;
      int y=25;
      int z=x+y;

      System.out.println("Sum of x+y = " + z);
      
      Person shiv = new Person();
      Person bhavani = new Person();
      
      
      System.out.println(shiv.printHelloWorld("Shiv")); // Hello Shiv! is returned
      
      String str = new String("shiv");
      System.out.println(str);
      
      
      
      int a[] = new int[3]; // 1, 8, 6 
      Person[] personArray = new Person[2];
      
      String strArray[] = new String[2];
      strArray[0] = "shiv";
      strArray[1] = "kumar";
            
      //TODO: Iterate through the Array with for loop and print out both the Strings in the Array
      
      for (int i = 0; i < strArray.length; i++) {    	  
    	  System.out.println(strArray[i]);
      }
    }
        
    public String printHelloWorld(String name)
 {   
     return "Hello " + name + "!";
 }    
    
}
