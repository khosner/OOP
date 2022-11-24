import java.util.Scanner;

public class RunAnimal {
	public static void main(String[] args ){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("choose an Animal, press B for bird, press D for dog, and press C for cat");
	String a = sc.nextLine();

if (a.equalsIgnoreCase("B")){
	Bird b = new Bird();
	b.eat();
	b.sleep();
	b.makeSound();
}
else if (a.equalsIgnoreCase("D")){
	Dog d = new Dog();
	d.eat();
	d.sleep();
	d.makeSound();
}
else if (a.equalsIgnoreCase("C")){
	Cat c = new Cat();
	c.eat();
	c.sleep();
	c.makeSound();
sc.close();
	}
  }
}
