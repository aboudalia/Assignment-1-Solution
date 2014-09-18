package calc;

public class ComplexCalculator {

	private double currentNumber;
	
	// constructor
	public ComplexCalculator(double d) {
		currentNumber = d;
	}
	
	// add()
	// adds d to current number
	public void add(double d) {
		currentNumber = currentNumber + d;
	}
	
	// subtract()
	// subtracts d from current number  
	
	public void subtract(double d) {
		currentNumber = currentNumber - d;
	}
	
	// multiply()
	// multiplies current number by d
	
	public void multiply(double d) {
		currentNumber = currentNumber * d;
	}
	
	// divide()
	// divides current number by a given number
	
	public void divide(double d) {
		currentNumber = currentNumber / d;
	}
	
	// clear()
	// sets current number to 0
	
	public void clear() {
		currentNumber = 0;
	}
	
	// power()
	// raises current number to the power of a given number
	
	public void power(double d) {
		
		//Math.pow(currentNumber, d);
		if(d == 0) 
			currentNumber = 1;
		else {
			double base = currentNumber;
			
			for(int i = 1; i < d; i++) {
				
				currentNumber = base * currentNumber;
				
			}
		}
	}
	
	public double getCurrentNumber() {
		return currentNumber;
	}
	
	//////////////////////////////////////////////////
	// EXTRA FUNCTIONS - not needed for full credit //
	
	// isEven()
	// returns true is current number is even, false otherwise
	
	public boolean isEven() {
		
		if(currentNumber % 2 == 0)
			return true;
		
		return false;
		
	}
	
	// isPrime()
	// returns true if current number is a prime number, false otherwise
	
	public boolean isPrime() {
		
		for(int i = 2; i < currentNumber; i++){
			
			if(currentNumber % i == 0)
				return false;
			
		}
		
		return true;
		
	}
	////////////////////////////////////////////////////
	
}
