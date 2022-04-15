package packageDeliverySimulation;

public interface Building {
	
	RETVAL take(int input);
	
	int process();
	
	void showNumberOfProduct();
	
	void showProcessingSpeed();
	
	int increaseProcessingSpeed();
	
	void showCapacity();
	
	int increaseCapacity();
	
	void showIncreasingSpeedExpense();
	
	void showIncreasingCapacityExpense();
	
}
