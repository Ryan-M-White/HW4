/**
 * Purpose:     This program prompts the user to enter information
 * 				about a vehicle(s) they'd like to order.<br>
 *                                                    <br>
 * Caveats:     Entering blatantly invalid information 
 * 				to some of the prompts may break the program.<br>
 * Date:        October 28th, 2017
 * @author      Ryan White   
 * @version     1.5
 */

import java.util.*;
public class Orders {
	public static void main(String[] args) {
		//declarations
		boolean orderingInProcess = true;
		List<Vehicle> orderList = new ArrayList<Vehicle>();		
		String answer;
		String option;
		Scanner sc = new Scanner(System.in);
		Scanner wholeLineSC = new Scanner(System.in).useDelimiter("\\n");
      //program
		System.out.println("Ryan White");
		System.out.println("Java for Programmers ISTE-200 2017-Fall>");		
		System.out.println("Homework #4");		
		System.out.println("");		
		while(orderingInProcess){
			System.out.print("Do you want to order a Truck (T/t), Car (C/c), or Boat (B/b)? ");
			while (!sc.hasNext("[tTcCbB]")) {
				System.out.println("");
				System.out.println("");	
				System.out.println("That's not an option! Please try again.");
				System.out.print("Do you want to order a Truck (T/t), Car (C/c), or Boat (B/b)? ");
				sc.next();
			}
			option = sc.next();

			if(option.equals("c") || option.equals("C")){
								
				Car car = new Car(); //Create new Car object and call Car constructor to fetch user input
				orderList.add(car); //save this order into orderList
				
				//Ask if they want to make another order
				System.out.println("");
				System.out.print("Do you want to order another vehicle? ");
				
				//hasNext uses a regular experssion to check user input
				while (!sc.hasNext("[yYnN]")) {
					System.out.println("");
					System.out.println("");	
					System.out.println("That's not an option! Please try again.");
					System.out.print("Do you want to order another vehicle?" );
					sc.next();
				}
				answer = sc.next();
				if(answer.equals("y") || answer.equals("Y")){
					//do nothing, the while loop should run again
				} else if(answer.equals("n") || answer.equals("N")){
					System.out.println("");	
					orderingInProcess = false; //break out of while loop			
				} else {
					System.out.println("You've officially broken my program. Please restart and only type 'y', 'Y, 'n', or 'N' this time");
					sc.close();
					wholeLineSC.close();
					System.exit(0);
				}
			} else if(option.equals("t") || option.equals("T")){
				Truck truck = new Truck(); //Create new Truck object and call Truck constructor to fetch user input
				orderList.add(truck); //save this order into orderList
				
				//Ask if they want to make another order
				System.out.println("");		
				System.out.print("Do you want to order another vehicle? ");

				//hasNext uses a regular experssion to check user input				
				while (!sc.hasNext("[yYnN]")) {
					System.out.println("");
					System.out.println("");	
					System.out.println("That's not an option! Please try again.");
					System.out.print("Do you want to order another vehicle?" );
					sc.next();
				}
				answer = sc.next();
				if(answer.equals("y") || answer.equals("Y")){
					//Do nothing. The while loop should run again.
				} else if(answer.equals("n") || answer.equals("N")){
					System.out.println("");	
					orderingInProcess = false;	//break out of while loop
				} else {
					System.out.println("You've officially broken my program. Please restart and only type 'y', 'Y, 'n', or 'N' this time");
					sc.close();
					wholeLineSC.close();
					System.exit(0);
				}
			} else if(option.equals("b") || option.equals("B")){
				Boat boat = new Boat(); //Create new Boat object and call Boat constructor to fetch user input
				orderList.add(boat); //save this order into orderList
				
				//Ask if they want to make another order
				System.out.println("");		
				System.out.print("Do you want to order another vehicle? ");

				//hasNext uses a regular experssion to check user input				
				while (!sc.hasNext("[yYnN]")) {
					System.out.println("");
					System.out.println("");	
					System.out.println("That's not an option! Please try again.");
					System.out.print("Do you want to order another vehicle?" );
					sc.next();
				}
				answer = sc.next();
				if(answer.equals("y") || answer.equals("Y")){
					//Do nothing. The while loop should run again.
				} else if(answer.equals("n") || answer.equals("N")){
					System.out.println("");	
					orderingInProcess = false;	//break out of while loop
				} else {
					System.out.println("You've officially broken my program. Please restart and only type 'y', 'Y, 'n', or 'N' this time");
					sc.close();
					wholeLineSC.close();
					System.exit(0);
				}
			} else {
				System.out.println("You've officially broken my program. Please restart and only type 'c', 'C, 't', or 'T' this time.");
				sc.close();
				wholeLineSC.close();
				System.exit(0);
			}
		}

		//For loop that iterates through the orderList and prints the contents
		for(Vehicle vehicle : orderList) {
			if(vehicle instanceof Car){
				Car myCar = (Car) vehicle;
				String output = myCar.toString();
				System.out.print(output);
				System.out.println("");
			} else if(vehicle instanceof Truck){
				Truck myTruck = (Truck) vehicle;
				String output = myTruck.toString();
				System.out.print(output);
				System.out.println("");
			} else if(vehicle instanceof Boat){
				Boat myBoat = (Boat) vehicle;
				String output = myBoat.toString();
				System.out.print(output);
				System.out.println("");
			} else{
				System.out.println("Error: Object is neither a car nor a truck...");
			}
		}
		System.out.println("");		
		System.out.println("Thank you for using Ryan White's Ordering System");
		System.out.println("");				
		sc.close();
		wholeLineSC.close();
		System.exit(0);
	}
}