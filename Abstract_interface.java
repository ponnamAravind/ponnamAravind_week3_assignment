package task_3;

public class Abstract_interface {

	public static void main(String[] args) 
	{   
		 Dog dog =new Dog();
		 dog.eat();
		 dog.makeSound();
		 dog.sleep();
		 
		 Cat cat=new Cat();
		 cat.eat();
		 cat.makeSound();
		 cat.sleep();

	}
}

abstract class Animal
{
	abstract void eat();
	
	 void sleep()
	 {
		 System.out.println("This animal is sleeping.");
	 }
}
interface Sound
{
	void makeSound();
}
class Dog extends Animal implements Sound
{
	@Override
	public void makeSound() {
		System.out.println("the dog says: Woof Woof! ");	
	}

	@Override
	void eat() {
		System.out.println("The dog is eating");
		
	}
}
class Cat extends Animal implements Sound
{

	@Override
	public void makeSound() {
		System.out.println("the cat says : Meow Meow!");
		
	}

	@Override
	void eat() {
		System.out.println("The cat is eating");
		
	}
	
}