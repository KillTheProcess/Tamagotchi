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
	
	
	public void load(){
		
		try {
			sc = new Scanner(new File("data.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*pet.setName(sc.next());
		pet.setHunger(Integer.parseInt(sc.next()));
		pet.setAge(Integer.parseInt(sc.next()));
		pet.setEnergy(Integer.parseInt(sc.next()));
		pet.setHappy(Integer.parseInt(sc.next()));
		pet.setHealth(Integer.parseInt(sc.next()));*/
		sc.close();
			
		
	}

}
