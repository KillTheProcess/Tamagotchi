package ru.nz.tamagotchi.main;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.io.*;

public class SaveLoad {

	public void save() {

		FileNameExtensionFilter filter = new FileNameExtensionFilter(".TXT", "*.*");
		JFileChooser chooser = new JFileChooser();
		chooser.setFileFilter(filter);
		chooser.setCurrentDirectory(new java.io.File("C:/Users/"));
		if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
			try (FileWriter fw = new FileWriter(chooser.getSelectedFile())) {
				fw.write("" + Main.pet.getName() + " " + Main.pet.getHunger() + " " + Main.pet.getEnergy() + " "
						+ Main.pet.getHealth());
				System.out.println("Game Saved");
			} catch (IOException e) {

			}
		}
	}

	/*
	 * public void load() { FileNameExtensionFilter filter = new
	 * FileNameExtensionFilter(".TXT", "*.*"); JFileChooser chooser = new
	 * JFileChooser(); chooser.setFileFilter(filter);
	 * chooser.setCurrentDirectory(new java.io.File("C:/Users/")); if
	 * (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) { try
	 * (FileWriter fw = new FileWriter(chooser.getSelectedFile())) { fw.write(""
	 * + Main.pet.getName() + " " + Main.pet.getHunger() + " " +
	 * Main.pet.getEnergy() + " " + Main.pet.getHealth());
	 * 
	 * System.out.println("Game Loaded"); } catch (IOException e) {
	 * 
	 * } } }
	 */ 
}