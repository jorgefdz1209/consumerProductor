package com.netasystem.granja;

import java.util.Random;
//sin funcionamiento
public class Agricultor implements Runnable{
	private Random r = new Random();
	
	public Agricultor() {
		super();
	}

	public synchronized void siembreOcosecha() {
		while(Parsela.isDispo()) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Parsela.addMaiz(new Maiz(getCantidadRandom(), getMaizDescripcion()));
		Parsela.setDispo(true);
		this.notify();
	}
	
	public int getCantidadRandom() {
		return r.nextInt(10);
	}
	
	public String getMaizDescripcion() {
		String []tiposDeMaiz = {"Transgenico","Normal","Sin Gluten","Sin Gluten1","Sin Gluten2","Sin Gluten3","Sin Gluten4","Sin Gluten5","Sin Gluten6","Sin Gluten7"};
		int index = (r.nextInt(10));
		return tiposDeMaiz[index];
	}

	@Override
	public void run() {
		while (true) {
			siembreOcosecha();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				System.out.println("No desperto correctamente");
			}
			
		}
		
	}
	
}
