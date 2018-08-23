package com.netasystem.granjaws;

public class Cochinito implements Runnable {
	private Parsela p;
	
	
	public Cochinito(Parsela p) {
		super();
		this.p = p;
	}
	public synchronized void comsumeMaiz() {
		Maiz maizParaComsumir = p.getMaiz();
		System.out.println("Estoy consumiendo el maiz "+ maizParaComsumir.toString());
		System.out.println(Thread.currentThread().getName());
	}
	
	@Override
	public void run() {
		while (true) {
			comsumeMaiz();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				System.out.println("Excetion por interrupcion");
			}
			}
	}
}
