package HarmanTechnologies;

public class AnimalHarmon {

	void speak() {
		
		System.out.println("speak");
	}
	
}

class Dog extends AnimalHarmon{
	
	void speak() {
		System.out.println("woof");
		
	}
}

class Cat extends AnimalHarmon{
	
	void speak() {
		
		System.out.println("meow");
	}
	
}

