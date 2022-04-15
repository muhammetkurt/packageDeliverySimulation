package packageDeliverySimulation;

import java.util.Queue;
import java.util.LinkedList;

public class Factory extends Player implements Building{

	private Queue<Integer> productOfFactory = new LinkedList<Integer>();
	
	private static int createID = 0;
	private int ID;
	private int retVal;
	
	
	
	public Factory() {
		ID = createID;
		createID = createID + 1;
	}
	
	
	@Override
	public void take(int input) {

		productOfFactory.offer(input);
		
		System.out.println(input + " has been taken in Factory(ID:"+ ID +")");
		
	}

	@Override
	public int process() {
		
		budget = budget + 150;
		
		retVal = productOfFactory.poll();
		
		return retVal;
	}

	@Override
	public void showNumberOfProduct() {

		System.out.println("Number of product in Factory(ID: "+ ID +")");
		
	}

	@Override
	public void showProcessingSpeed() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int increaseProcessingSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void showCapacity() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int increaseCapacity() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void showIncreasingSpeedExpense() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showIncreasingCapacityExpense() {
		// TODO Auto-generated method stub
		
	}

}
