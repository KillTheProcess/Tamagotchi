package ru.nz.tamagotchi.animal;

public abstract class Animal {
	
	protected int hunger;
	protected int energy;
	protected int happy;
	protected int age;
	protected int health;
	protected String name;
	
	public int getHunger(){
		return hunger;
	}
	
	public int getEnergy(){
		return energy;
	}
	
	public int getHappy(){
		return happy;
	}
	
	public int getAge(){
		return age;
	}
	
	public int getHealth(){
		return health;
	}
	
	public String getName(){
		return name;
	}
	
	protected void setHunger(int pHunger){
		hunger = pHunger;
	}
	
	protected void setEnergy(int pEnergy){
		energy = pEnergy;
	}
	
	protected void setHappy(int pHappy){
		happy = pHappy;
	}
	
	protected void setAge(int pAge){
		age = pAge;
	}
	
	protected void setName(String pName){
		name = pName;
	}
	
}
