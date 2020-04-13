
public class Test15 {
	static int count = 0;
	static void recursion() {
			count++;
			if(count <= 5) {
			System.out.println("recursion");
			recursion();
			}
	}
	static int factorial(int n) {
		if(n==1) 
			return 1;
			else
				return(n * factorial(n-1));
	}
	
	public static void main(String[] args) {
		recursion();
		int result = factorial(5);
		System.out.println(result);
	}

}
