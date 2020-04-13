
public class Test5 {
	public static void main(String[] args) {
		short s = Short.MAX_VALUE;
		System.out.println(s);
		long l = Long.MAX_VALUE;
		System.out.println(l);
		long l2 = s; 
		System.out.println(l2);
		short s2 = (short)l2;
		System.out.println(s2);
		String s3 = "1234";
		int num = Integer.parseInt(s3);
		System.out.println(num);
	}
}
