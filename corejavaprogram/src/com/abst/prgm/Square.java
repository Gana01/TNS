package com.abst.prgm;

public class Square extends Shape{
	
	private float side;
	
	// constructor
	public Square() {
		side=2.0f;
	}
	//para construct
	public Square(float side) {
		this.side=side;
	}

	@Override
	void calarea() {	
		super.area=side*side;
	}
	
	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}
	
	public static void main(String[] args) {
	  // Square s=new Square();
		
		Shape p=new Square(4.0f);
		System.out.println(p);
		p.calarea();
		p.show();
	}
}

