class myclass{}

public abstract class Test11 {

	public static void main(String[] args) {
		Calc c = new Calc();
		System.out.println(c.add(1, 2));
		System.out.println(Calc.add2(2, 3));
		System.out.println(Calc.subtract2(4, 6));
	}

}
