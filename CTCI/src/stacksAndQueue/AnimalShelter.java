package stacksAndQueue;

import java.util.*;

class Animal {
	int order;
	String name;

	public Animal(String name) {
		this.name = name;
	}

	int getOrder() {
		return order;
	}

	void setOrder(int order) {
		this.order = order;
	}

	public boolean isOlderThan(Animal a) {
		return this.order < a.getOrder();
	}
}

class Dog extends Animal {
	public Dog(String n) {
		super(n);
	}
}

class Cat extends Animal {
	public Cat(String n) {
		super(n);
	}
}

public class AnimalShelter {

	LinkedList<Dog> dogs = new LinkedList<Dog>();
	LinkedList<Cat> cats = new LinkedList<Cat>();
	private int order = 0;

	void enqueue(Animal animal) {
		order++;

		if(animal instanceof Dog)
			dogs.addLast((Dog) animal);
		else
			cats.addLast((Cat) animal);
	}

	Animal dequeueAny() {
		if(dogs.size() == 0)
			return dequeueDog();
		if(cats.size() == 0)
			return dequeueCat();

		Dog dog = dogs.peek();
		Cat cat = cats.peek();

		if(dog.isOlderThan(cat))
			return dequeueDog();
		else
			return dequeueCat();
			
	}

	Dog dequeueDog() {
		return dogs.poll();
	}

	Cat dequeueCat() {
		return cats.poll();
		
	}
}
