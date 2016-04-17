package ru.nz.tamagotchi.main;

public class MyThread implements Runnable {

	ImagePanel pp;

	public void run() {

		while (true) {
			while (ImagePanel.x < 250) {
				
				try {
					ImagePanel.x++;
					
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			while (ImagePanel.x > 0) {
				
				try {
					ImagePanel.x--;
					
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
