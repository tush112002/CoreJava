package generics;

public class TestVehicle {

	public static void main(String[] args) {
		ServiceCenter<Car> s1 = new ServiceCenter<Car>(new Car());
		ServiceCenter<Bike> s2 = new ServiceCenter<Bike>(new Bike());
		s1.vehicalDetails();
		s2.vehicalDetails();
	}
}
