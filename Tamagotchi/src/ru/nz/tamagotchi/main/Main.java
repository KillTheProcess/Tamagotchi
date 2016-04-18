package ru.nz.tamagotchi.main;

import java.awt.BorderLayout;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

import ru.nz.tamagotchi.pet.Pet;

public class Main {

	static SaveAndLoad sal = new SaveAndLoad();
	static String mName;
	static int mHunger=100 , mAge=0 , mEnergy=100 , mHappy=100 , mHealth=100 ;

	static Pet pet = new Pet(mName, mHunger, mAge, mEnergy, mHappy, mHealth);
    static MyMenu panel2 = new MyMenu();
	static MyPanel panel = new MyPanel();
	static int r;
	int n = 0;

	public static void statLoads(){
		pet.setName((SaveAndLoad.SName));
		pet.setHunger(((SaveAndLoad.SHunger)));
		pet.setAge(((SaveAndLoad.SAge)));
		pet.setEnergy(((SaveAndLoad.SEnergy)));
		pet.setHappy(((SaveAndLoad.SHappy)));
		pet.setHealth(((SaveAndLoad.SHealth)));
		System.out.println("Голод после чтения из Анимал" + pet.getHunger());
	}
	
	public static void main(String[] args) {
		
		setMenu();
		sal.load();
		statLoads();
		panel.updatePB();
		panel.unvisibleName();
	}
	public static void setMenu() {
		
		MyMenu pp = new MyMenu();
		pp.setLayout(new BorderLayout());
		try {
			pp.setImage(ImageIO.read(new File("pics/menuback.png")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		JFrame frame = new JFrame();
		frame.setSize(540, 960);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);

		frame.add(new JScrollPane(pp));
		pp.add(panel2);

		panel2.setOpaque(false);
		frame.setResizable(false);
		frame.setVisible(true);

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
