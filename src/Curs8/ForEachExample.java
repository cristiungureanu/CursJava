package Curs8;

public class ForEachExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cities = {"Iasi", "Arad", "Cluj", "Alba"};
		
		System.out.println(cities.length);

		for(int i=0; i<cities.length; i++) {
			System.out.println(cities[i]);
		}
		
		System.out.println("--------------------------------");
		
		for(String oras : cities) {
			System.out.println(oras);
		}
	}

}
