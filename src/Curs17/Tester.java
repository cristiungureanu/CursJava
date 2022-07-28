package Curs17;

public class Tester<T> {

	//String age;
	//int age2;
	
	T age;
	
	
	public Tester(T age) {
		this.age = age;
	}
	
	public void printAge() {
		System.out.println("Data typeul lui age este: " + age.getClass());
	}
}
