package ru.nz.tamagotchi.main;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import ru.nz.tamagotchi.main.MyMenu.ConfirmExitDialog;
import ru.nz.tamagotchi.main.MyPanel.KeyListener;

public class MyMenu extends JPanel {
	public class ConfirmExitDialog {

	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton btnnewgame, btnexit, btnoptions;
	private Image menu;
	Image menuback;
	static int x = 150, y = 300;
	KeyListener2 listen = new KeyListener2();
	
	public MyMenu() {
		btnnewgame = new JButton("Играть");
		btnnewgame.setBounds(x, y, 2, 2);
		btnnewgame.addActionListener(listen);
		add(btnnewgame);

		btnoptions = new JButton("Настройки");
		btnoptions.setBounds(x, y, 2, 2);
		btnoptions.addActionListener(listen);
		add(btnoptions);

		btnexit = new JButton("Выход");
		btnexit.setBounds(x, y, 2, 2);
		btnexit.addActionListener(listen);
		add(btnexit);
		
	}

	public void setImage(Image menuback) {
		// TODO Auto-generated method stub
		this.menuback = menuback;
	}

	class KeyListener2 implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == (btnnewgame)) {
				Main.setBackround();
				// System.exit (0);
				System.out.println("kek");

			}
			if (e.getSource() == (btnexit)) {
				System.out.println("kek");
				System.exit(0);

			}
		}
	}
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		if (menuback != null) {
			g.drawImage(menuback, 0, 100, 1000, 600, null);

		}
		

	}

}