package java8certification.factorypattern;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		Vehicle car = VehicleFactory.getVehicle("Car");
		car.drive();
		
		Vehicle bike = VehicleFactory.getVehicle("Bike");
		bike.drive();

	}

}
