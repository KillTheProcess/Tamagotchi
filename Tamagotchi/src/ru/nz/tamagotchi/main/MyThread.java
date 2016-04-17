package ru.nz.tamagotchi.main;

public class MyThread implements Runnable {

	ImagePanel pp;

	public void run() {

		while (true) {
			while (pp.x < 250) {
				pp.x++;
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			while (pp.x > 0) {
				pp.x--;
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
