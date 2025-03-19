package day3program;
class Animal {
	void sound() {
		System.out.println("Animals make sounds");
		
	}
}
class Dog extends Animal {
	void bark() {
		System.out.println("Dog barks");
	}
}
class cat extends Animal {
	void meow( ) {
		System.out .println("cat meows");
	}
} 
public class Inheritance {
	public static void main(String[] args) {
		Dog d1=new Dog();
		d1.bark();
		d1.sound();
		cat c1=new cat();
		c1.meow();
	}
}

