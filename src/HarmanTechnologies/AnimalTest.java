package HarmanTechnologies;

class AnimalTest{
	
	public static void main(String[] args) {
		
		AnimalHarmon[] animals = new AnimalHarmon[3];
		
		animals[0] = new AnimalHarmon();
		
		animals[1] = new Dog();
		
		animals[2] = new Cat();
		
		for (int i = 0; i < animals.length; i++) {
			
			animals[i].speak();
			
		}
				
	}

}