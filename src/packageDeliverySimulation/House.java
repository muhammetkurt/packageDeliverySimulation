package packageDeliverySimulation;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class House extends Player implements Building {

	Scanner scanner = new Scanner(System.in);
	
	private Queue<Integer> productOfHouse = new LinkedList<Integer>();

	private static int createID = 0;
	private static int capacity = 0;
	private static int numberOfProduct = 0;
	private static int processingSpeed = 0;
	private static int increasingSpeedExpense = 300;
	private static int increasingCapacityExpense = 300;
	
	
	private int retVal;
	private int ID;
	

	//constructor
	public House() {
		this.ID = createID;
		createID++;
	}
	
	
	@Override
	public void take(int input) {
		
		productOfHouse.offer(input);
		
		System.out.println(input + " has been taken in House. ");
	}

	@Override
	public int process() {
		
		budget = budget + 100;
		
		retVal = productOfHouse.poll();
		
		return retVal;
	}

	
	@Override
	public void showCapacity() {

		System.out.println("Capacity in House(ID: "+ ID +"): " + capacity);
		
	}
	
	
	@Override
	public void showNumberOfProduct() {

		System.out.println("Number of product in House(ID: "+ ID +"): " + numberOfProduct);
		
	}

	@Override
	public void showProcessingSpeed() {

		System.out.println("Processing speed in House(ID: "+ ID +"): " + processingSpeed);
		
	}


	@Override
	public void showIncreasingSpeedExpense() {

		System.out.println("Increasing speed expense in House(ID: "+ ID +"): "+ increasingSpeedExpense);
		
	}

	@Override
	public void showIncreasingCapacityExpense() {

		System.out.println("Increasing capacity expense in House(ID: "+ ID +"): "+ increasingCapacityExpense);
		
	}

	
	@Override
	public int increaseProcessingSpeed() {
		
		if(budget >= increasingSpeedExpense) {
			budget = budget - increasingSpeedExpense;
			
			processingSpeed = processingSpeed * 2 ;
			
			System.out.println("Processing speed is increased in House(ID: "+ ID +")");
		}
		else {
			System.out.println("Budget is not enough for increasing processing speed in House(ID:"+ ID +")");
		}
	
		return -1;
	}


	@Override
	public int increaseCapacity() {
		
		if(budget >= increasingCapacityExpense) {
			budget = budget - increasingCapacityExpense;
			processingSpeed = processingSpeed * 2 ;
			
			System.out.println("Capacity is increased in House(ID: "+ ID +")");
		}
		else {
			System.out.println("Budget is not enough for increasing capacity in House(ID:"+ ID +")");
		}
	
		return -1;
		
	}

}
