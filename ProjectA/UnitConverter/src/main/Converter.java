package main;

import java.util.Scanner;


import java.util.InputMismatchException;


public class Converter {
	
	 static double convertIntoKms(double miles){
	        double km=1.609*miles;
	        return km;
	    }
	    
	  
	    static double convertIntoMiles(double km){
	        double miles=km/1.609;
	        return miles;
	    }
	
	    
	    static double convertIntousgal(double impgal){
	        double usgal=impgal/0.83267;
	        return usgal;
	    } 
	    
	    
	    static double convertIntousCups(double usTeaP){
	    double usCups=usTeaP/0.0625;
	        return usCups;
	   } 
	    

	    
	    
@SuppressWarnings("resource")
public static void main(String[] args){
	
    int choice;
    
    
    Scanner keyboard = new Scanner(System.in);
         String s = null;
    do {
   	 s = null;
   	 Scanner sc  =   new Scanner(System.in); 
   	 
   	 System.out.println("1. Miles to Kilometers");
   	 System.out.println("2. Kilometers to miles");
   	 System.out.println("3. Us Gallon to Imperial Gallon");
   	 System.out.println("4. Us Cups to Us Teapoon");
   	 System.out.println("What would you like to do?"
   	 		+  "Please, enter your option number!");
   	 choice = sc.nextInt();
   	 
   	 if (choice < 1 ||(choice >4 ))
   		System.out.print("Please enter the right  option!");
    
   	
   	try {
   		

   	} catch (InputMismatchException ex) {
   		System.out.println("Uh oh not an integer");
   		ex.printStackTrace();
   		sc.next();
	    main(args);
   	   
   	}
     
 	 	 
   	 
   	 
   	 switch (choice) {
   	 case 1://Miles to Kilometers";
   		 System.out.print("Enter Distance in Miles  : ");
   		 
   	   	 
   	       double miles   =   sc.nextDouble();
   	        System.out.println(miles+" Miles equal to : "+convertIntoKms(miles)+" KMs");
   	   	 
   		 break;
   	 case 2: //Kilometers to Miles";
   		 
   		 
   	    System.out.print("Enter Distance in Km  : ");
        double kms   =   sc.nextDouble();
        System.out.println(kms+" KMs equal to : "+convertIntoMiles(kms)+" Miles");
        
   	   	 
   		 
   		 
   		 break;
   		 
   		 
   	 case 3: //Kilometers to Miles";
   		 
   		 
    	    System.out.print("Enter gallons (Imperial gallon)  : ");
         double impgal   =   sc.nextDouble();
         System.out.println(impgal+" imperial gallons equal to : "+convertIntousgal(impgal)+" US Gallons");
         
    		  
    		 break;
   		 
    		
   	 case 4: //Us Cups to TeaSpoons;
   		 
   		 
 	    System.out.print("Enter Cups : ");
      double usTeaP   =   sc.nextDouble();
      System.out.println(usTeaP+" Us Cups equal to : "+convertIntousCups(usTeaP)+" US Teaspoons");
      
 		  
 		 break;	 
    		 
    		 

     default:System.out.println("That was not a valid selection, try again.");
   		 
   	 }

  
        System.out.println("Do you want to continue?: Press y for yes or q to quit");
        
        s =  keyboard.next();
        
        
        if (s.equals("q")) {
            break;
        }
         
    }
    while (s != "q");
    
    
    System.out.println("Thank  you have a good day!!!");


}

}

