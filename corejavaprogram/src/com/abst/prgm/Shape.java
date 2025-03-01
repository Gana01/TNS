package com.abst.prgm;

public abstract class Shape {
	protected float area;
	
	// abstract method
		abstract void calarea();
		
		// Concrete method
		void show() {
			System.out.println("area of shape "+area);
		}

		@Override
		public String toString() {
			return "Shape [area=" + area + "]";
		}	

}
