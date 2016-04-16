package ru.nz.tamagotchi.pet;

import ru.nz.tamagotchi.animal.Animal;

public class Pet extends Animal {

	public Pet(String pName, int pHunger, int pAge, int pEnergy, int pHappy, int pHealth) {
		name = pName;
		hunger = pHunger;
		age = pAge;
		energy = pEnergy;
		happy = pHappy;
		health = pHealth;

	}

	public void feed() {
		hunger += 10;
		if (hunger > 100)
			hunger = 100;
		System.out.println("Мой уровень голода - " + hunger);
	}

	public void sleep() {
		energy += 10;
		if (energy > 100)
			energy = 100;
		System.out.println("Моя энергия " + energy);
	}

	public void status() {
		System.out.println("Меня зовут " + getName() + ". Мой уровень голода " + getHunger() + ". Моя энергия "
				+ getEnergy() + ". Моё здоровье " + getHealth());
	}

	public void noFood() {
		hunger -= 2;
		if (hunger < 0) {
			hunger = 0;
			noHealth();
		}
	}

	public void noSleep() {
		energy -= 1;
		if (energy < 0)
			energy = 0;
	}

	public void noHealth() {
		health -= 1;
		if (health < 0) {
			health = 0;
			death();
		}
	}

	private void death() {
		

	}
}
