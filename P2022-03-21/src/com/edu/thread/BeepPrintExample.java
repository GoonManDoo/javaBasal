package com.edu.thread;

import java.awt.Toolkit;

class BeepTask implements Runnable {

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

//process(main쓰레드)
public class BeepPrintExample {
	public static void main(String[] args) {

		// 쓰레드 생성하는 방법.
		// Thread의 생성자의 매개값으로

		Toolkit toolkit = Toolkit.getDefaultToolkit();
//		Thread thread = new Thread(new BeepTask());
        // Runnable 인터페이스의 익명구현객체 생성해서.
		// Thread 클래스의 생성자 매개값으로 활용.
		
		Thread thread = new Thread(() -> {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			

        });
		thread.start(); // 쓰레드 시작

		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			System.out.println("=집=보=내=줘=");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("end of prog");

	}
}
