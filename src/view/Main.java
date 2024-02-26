package view;

import controller.NegativesController;

public class Main {

	public static void main(String[] args) {
		
		NegativesController nc = new NegativesController();
		
		int array[] = {5,2,-1,-7,0,42,-10};
		
		System.out.println(nc.negatives(array, array.length - 1));

	}
}
