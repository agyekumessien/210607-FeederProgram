package main;

import java.util.Scanner;



public class Converter {
	
	 static double convertIntoKms(double miles){
	        double km=1.609*miles;
	        return km;
	    }
	    
	    /**
	�����* Method to get distance into km and convert into miles
	�����* @param km
	�����* @return 
	�����*/
	    static double convertIntoMiles(double km){
	        double miles=km/1.609;
	        return miles;
	    }
	
	
public static void main(String[] args) {

    
    
    
    Scanner keyboard = new Scanner(System.in);
         String s = null;
    do {
   	 s = null;
   	 Scanner sc  =   new Scanner(System.in);
   	 
   	 System.out.print("Enter Distance in Miles  : ");
        
        double miles   =   sc.nextDouble();
        System.out.println(miles+" Miles equal to : "+convertIntoKms(miles)+" KMs");
        
        System.out.print("Enter Distance in Km  : ");
        double kms   =   sc.nextDouble();
        System.out.println(kms+" KMs equal to : "+convertIntoMiles(kms)+" Miles");
        
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