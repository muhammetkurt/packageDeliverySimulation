package packageDeliverySimulation;

public interface Building {
	
	int as=0;
	
	void take(int input);
	
	int process();
	
	void showNumberOfProduct();
	
	void showProcessingSpeed();
	
	int increaseProcessingSpeed();
	
	void showCapacity();
	
	int increaseCapacity();
	
	void showIncreasingSpeedExpense();
	
	void showIncreasingCapacityExpense();
	
}
