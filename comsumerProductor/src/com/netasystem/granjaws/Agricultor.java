package com.netasystem.granjaws;

import java.util.Random;

public class Agricultor implements Runnable{
	
	private Random r = new Random();
	private Parsela p;
	
	public Agricultor(Parsela p2) {
		super();
		this.p=p2;
	}
	
	public synchronized void siembreOcosecha() {
		p.addMaiz(new Maiz(getCantidadRandom(), getMaizDescripcion()));
		System.out.println(Thread.currentThread().getName());
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