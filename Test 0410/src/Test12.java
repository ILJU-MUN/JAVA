
public class Test12 {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.breath();
		Cat c = new Cat();
		c.breath();
		
		Animal a = new Dog();
		a.breath();
		
		Animal a1 = new Cat();
		a1.breath();
		
		test(a); // Dog breath
		test(a1); // Cat breath
		
	}
	static void test(Animal a) {
		a.breath();
	}

}
