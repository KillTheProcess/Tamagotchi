package ru.nz.tamagotchi.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class MyPanel extends JPanel {
	JButton btnEat, btnSleep, btnStatus, btnSave, btnLoad;
	JProgressBar pbFood, pbEnergy, pbHealth;
	JLabel lFood, lEnergy, lHealth;

	
	KeyListener listen = new KeyListener();
	//Image img = new ImageIcon("pics/back.jpg").getImage();
	//JLabel imageLabel = new JLabel(new ImageIcon("img.jpg"));
	
	public MyPanel() {
		setLayout(null);
		
		btnEat = new JButton("Eat");
		btnEat.setBounds(480, 11, 89, 30);
		btnEat.addActionListener(listen);
		add(btnEat);

		btnSleep = new JButton("Sleep");
		btnSleep.setBounds(480, 52, 89, 30);
		btnSleep.addActionListener(listen);
		add(btnSleep);

		btnStatus = new JButton("Status");
		btnStatus.setBounds(480, 93, 89, 30);
		btnStatus.addActionListener(listen);
		add(btnStatus);
		
		btnSave = new JButton("Save");
		btnSave.setBounds(480, 650, 89, 30);
		btnSave.addActionListener(listen);
		add(btnSave);
		
		btnLoad = new JButton("Load...");
		btnLoad.setBounds(480, 690, 89, 30);
		btnLoad.addActionListener(listen);
		add(btnLoad);
		
		pbFood = new JProgressBar();
		pbFood.setBounds(70, 11, 146, 14);
		pbFood.setMinimum(0);
		pbFood.setMaximum(100);
		pbFood.setValue(Main.pet.getHunger());
		pbFood.setStringPainted(true);
		add(pbFood);
		
		pbEnergy = new JProgressBar();
		pbEnergy.setBounds(70, 52, 146, 14);
		pbEnergy.setMinimum(0);
		pbEnergy.setMaximum(100);
		pbEnergy.setValue(Main.pet.getEnergy());
		pbEnergy.setStringPainted(true);
		add(pbEnergy);
		
		pbHealth = new JProgressBar();
		pbHealth.setBounds(70, 93, 146, 14);
		pbHealth.setMinimum(0);
		pbHealth.setMaximum(100);
		pbHealth.setValue(Main.pet.getHealth());
		pbHealth.setStringPainted(true);
		add(pbHealth);
		
		lFood = new JLabel();
		lFood.setText("Голод");
		lFood.setBounds(15, 11, 146, 14);
		add(lFood);
		
		lEnergy = new JLabel();
		lEnergy.setText("Энергия");
		lEnergy.setBounds(15, 52, 146, 14);
		add(lEnergy);
		
		lHealth = new JLabel();
		lHealth.setText("Здоровье");
		lHealth.setBounds(15, 93, 146, 14);
        add(lHealth);
		
		
	}

	public void updatePB(){
		pbFood.setValue(Main.pet.getHunger());
		pbEnergy.setValue(Main.pet.getEnergy());
		pbHealth.setValue(Main.pet.getHealth());
		
	}
	


	class KeyListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == (btnEat)) {
				Main.pet.feed();
				pbFood.setValue(Main.pet.getHunger());

			}

			if (e.getSource() == (btnSleep)) {
				Main.pet.sleep();
				pbEnergy.setValue(Main.pet.getEnergy());

			}
			if (e.getSource() == (btnStatus)) {
				Main.pet.status();
			}
			if (e.getSource() == (btnSave)) {
				//(new SaveAndLoad()).save();
			
			}
			if (e.getSource() == (btnLoad)) {
			//	Main.saveload.load();
			
			}

			

		}

		
	}



	
}
