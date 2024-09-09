package task_3;

public class Vehicle_task 
{
  
	public static void main(String[] args) 
	{
		Vehicle myvehicle;
		 myvehicle= new Car();
		myvehicle.Start();
		myvehicle.stop();
		
		
		 myvehicle =new Bike();
		 myvehicle.Start();
		 myvehicle.stop();

	}

}

class Vehicle
{
	void Start()
	{
		System.out.println("vehicle is starting ");
	}
	void stop()
	{
		System.out.println("vehicle is stopping ");
	}
	
}
 class Bike extends Vehicle
 {

	@Override
	void Start() {
		System.out.println("Bike is starting with a kick ");
	}

	@Override
	void stop() {
		System.out.println("bike is stopping with rear brakes");
	}
	 
 }
 
 class Car extends Vehicle
 {

	@Override
	void Start() {
		System.out.println("car starting with a key");
	}

	@Override
	void stop() {
		System.out.println("car stopping with brakes");
	}
	 
 }
