package ru.nz.tamagotchi.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import ru.nz.tamagotchi.pet.Pet;

public class SaveAndLoad {
	Scanner sc;
	Pet pet;
	public static String SName;
	public static int SHunger, SAge, SHappy, SEnergy, SHealth;
	
	
	
	
	
	public void save() {

		try {

			FileWriter myfile = new FileWriter("data.txt");
			myfile.write(Main.pet.getName() + " " + Main.pet.getHunger() + " " + Main.pet.getAge() + " "
					+ Main.pet.getEnergy() + " " + Main.pet.getHappy() + " " + Main.pet.getHealth());
			System.out.println("sada");
			myfile.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
	}

	public void load() {
		try {
			sc = new Scanner(new File("data.txt"));
			SName = sc.next();
			SHunger = sc.nextInt();
			System.out.println("голод при чтении" + SHunger);
			SAge = sc.nextInt();
			SEnergy = sc.nextInt();
			SHappy = sc.nextInt();
			SHealth = sc.nextInt();
			System.out.println("энергия при чтении" + SEnergy);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
