package demopackage;

public class Example {
	public int d=12;
	private int a=47;
	public static void main(String[] args) {
		Example D=new Example();
		System.out.println(D.d);
		Secret sc = new Secret();
		System.out.println(sc.s);
		System.out.println(D.a);
	}

}
