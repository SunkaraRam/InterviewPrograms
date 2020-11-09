package HarmanTechnologies;

public class AnimalHarmon {

	void speak() {
		
		System.out.println("speak");
	}
	
}

class Dog extends AnimalHarmon{
	
	void speak() {
		System.out.println("bow");
		
	}
}

class Cat extends AnimalHarmon{
	
	void speak() {
		
		System.out.println("meow");
	}
	
}

