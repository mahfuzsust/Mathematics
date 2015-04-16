package com.mahfuz.numbertheory;

/**
 * @author mahfuz
 * 
 */
public class Prime {

	/**
	 * @param args
	 */

	public boolean isPrime(int value) {
		if (value % 2 == 0)
			return false;
		for (int i = 3; i * i <= value; i += 2) {
			if (value % i == 0)
				return false;
		}
		return true;
	}
	
	

	public static void main(String[] args) {

	}

}
