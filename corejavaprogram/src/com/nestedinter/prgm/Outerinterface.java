package com.nestedinter.prgm;

public interface Outerinterface {
	//abstract method
	void calucatarea();
	
	//nested interface
	interface innerinterface{
		int id=30;
		void print();
		void calucatarea();
		
	}


}
