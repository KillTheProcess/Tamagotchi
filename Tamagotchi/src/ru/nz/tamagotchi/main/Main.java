package ru.nz.tamagotchi.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import ru.nz.tamagotchi.pet.Pet;

public class Main {

	SaveAndLoad sal = new SaveAndLoad();
	static String mName;
	static int mHunger=100 , mAge=0 , mEnergy=100 , mHappy=100 , mHealth=100 ;

	static Pet pet = new Pet(mName, mHunger, mAge, mEnergy, mHappy, mHealth);

	static MyPanel panel = new MyPanel();
	static int r;
	int n = 0;

	public static void statLoads(){
		pet.setName((new SaveAndLoad().SName));
		pet.setHunger(((new SaveAndLoad().SHunger)));
		pet.setAge(((new SaveAndLoad().SAge)));
		pet.setEnergy(((new SaveAndLoad().SEnergy)));
		pet.setHappy(((new SaveAndLoad().SHappy)));
		pet.setHealth(((new SaveAndLoad().SHealth)));
		System.out.println("Голод после чтения из Анимал" + pet.getHunger());
	}
	
	public static void main(String[] args) {

		setBackround();
		(new SaveAndLoad()).load();
		statLoads();
		Main.panel.updatePB();
	}

	public static void setBackround() {
		
		ImagePanel pp = new ImagePanel();
		pp.setLayout(new BorderLayout());
		try {
			pp.setImage(ImageIO.read(new File("pics/back3.png")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		JFrame frame = new JFrame();
		frame.setSize(540, 960);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);

		frame.add(new JScrollPane(pp));
		pp.add(panel);

		panel.setOpaque(false);
		frame.setResizable(false);
		frame.setVisible(true);

	}

}
