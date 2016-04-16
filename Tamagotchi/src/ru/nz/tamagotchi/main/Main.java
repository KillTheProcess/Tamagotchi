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

public class Main {//sdads
	
	static String mName;
	static int mHunger =100, mAge=0, mEnergy=100, mHappy=100, mHealth=100;
	
	static Pet pet = new Pet(mName, mHunger , mAge, mEnergy, mHappy, mHealth);
	static SaveLoad saveload = new SaveLoad();
	static Scanner sc = new Scanner(System.in);
	static MyPanel panel = new MyPanel();
	static int r;
	int n = 0;
	
	

	public static void main(String[] args) {
		setBackround();
		
			}
	
	
	
	
	
	public static void setBackround(){
		ImagePanel pp = new ImagePanel();	
	//	JPanel petpanel = new JPanel();
        pp.setLayout(new BorderLayout());
        try {
			pp.setImage(ImageIO.read(new File("pics/back.jpg")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
		JFrame frame = new JFrame();
		frame.setSize(600, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);

		
		frame.add(new JScrollPane(pp));
		pp.add(panel);
	//	petpanel.setImage(pp.petpic);
	//	panel.add(petpanel);
		panel.setOpaque(false);
		frame.setResizable(false);
		frame.setVisible(true);
	}
	
	

	
	}




// asd as 4555