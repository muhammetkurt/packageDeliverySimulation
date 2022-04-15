package packageDeliverySimulation;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class House extends Player implements Building {

	Scanner scanner = new Scanner(System.in);
	
	private Queue<Integer> productOfHouse = new LinkedList<Integer>();

	private static int createID = 0;
	private static int capacity = 5;
	private static int processingSpeed = 1;
	private static int increasingSpeedExpense = 300;
	private static int increasingCapacityExpense = 300;
	
	
	private int retVal;
	private int ID;
	

	//constructor
	public House() {
		this.ID = createID;
		createID = createID + 1;
	}
	
	
	@Override
	public RETVAL take(int input) {
		
		if(productOfHouse.size() >= capacity) {
			failureLimit = failureLimit - 1;
			System.out.println("Capacity of House(ID: "+ ID +") full!");
			
			return RETVAL.DECREASE_BUDGET;
		}
		
		productOfHouse.offer(input);
		
		System.out.println(input + " has been taken in House(ID: "+ ID +")");
		
		return RETVAL.SUCCESS;
	}

	@Override
	public int process() {
		
		if(productOfHouse.size() <= 0) {
			
			return RETVAL.NULL;
			
		}
		
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

		System.out.println("Number of product in House(ID: "+ ID +"): " + productOfHouse.size());
		
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
			
			increasingSpeedExpense = increasingSpeedExpense * 2;
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
			
			capacity = capacity + 5 ;
			
			System.out.println("Capacity is increased in House(ID: "+ ID +")");
			
			increasingCapacityExpense = increasingCapacityExpense * 2;
		}
		else {
			System.out.println("Budget is not enough for increasing capacity in House(ID:"+ ID +")");
		}
	
		return -1;
		
	}

}
