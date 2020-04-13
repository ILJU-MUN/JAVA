
public class Test3 {
		public static void main(String[] args) {
			int num1 = 100;
			int num2 = 40;
			System.out.println(num1);
			System.out.println(num2);
			int num3 = num1 + num2;
			System.out.println(num1 + "+" + num2 + "=" + num3 );
			System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
			System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
			System.out.println(num1 + "%" + num2 + "=" + (num1 % num2));
			
			System.out.println(num1 == num2);
			System.out.println(num1 != num2);
		
			/* char test1 = "a"; 오류 String으로 바꿔야함 */
			String test1 = "test";
			char test2 = 'a';
			System.out.println(test1);
			System.out.println(test2);
		}
}
