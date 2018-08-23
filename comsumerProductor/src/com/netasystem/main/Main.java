package com.netasystem.main;

import com.netasystem.granja.Agricultor;
import com.netasystem.granja.Cochinito;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		//Error....
		
		System.out.println("Ejemplo de productor consumidor");
		Agricultor agricultor = new Agricultor();
		agricultor.siembreOcosecha();
		Cochinito hugo0 = new Cochinito();
		Cochinito hugo1 = new Cochinito();
		Cochinito hugo2 = new Cochinito();
		Cochinito hugo3 = new Cochinito();
		
		// Como evito las excepxiones cuando multiples cochinitos quieren comer maiz
		Thread ag1 = new Thread(agricultor);
		Thread coch1 = new Thread(hugo0);
		Thread coch2 = new Thread(hugo1);
		Thread coch3 = new Thread(hugo2);
		Thread coch4 = new Thread(hugo3);
		
		ag1.start();
		Thread.sleep(1000);
		
		coch1.start();
		coch2.start();
		coch3.start();
		coch4.start();
		
	}
}
