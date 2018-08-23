package com.netasystem.granja;

public class Cochinito implements Runnable{
	
	public Cochinito() {
		super();
	}

	public synchronized void comsumeMaiz() {
		while(!Parsela.isDispo()) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Parsela.setDispo(false);
		this.notify();
		Maiz maizParaComsumir = Parsela.getMaiz();
		System.out.println("Estoy consumiendo el maiz "+ maizParaComsumir.toString());
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
