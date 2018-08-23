package com.netasystem.mainws;

import com.netasystem.granjaws.Agricultor;
import com.netasystem.granjaws.Cochinito;
import com.netasystem.granjaws.Parsela;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Ejemplo de productor consumidor");
		Parsela p = new Parsela();
		Agricultor agricultor = new Agricultor(p);
		Cochinito hugo0 = new Cochinito(p);
		Cochinito hugo1 = new Cochinito(p);
		Cochinito hugo2 = new Cochinito(p);
		Cochinito hugo3 = new Cochinito(p);
		
		// Como evito las excepxiones cuando multiples cochinitos quieren comer maiz
		Thread ag1 = new Thread(agricultor);
		Thread coch1 = new Thread(hugo0);
		Thread coch2 = new Thread(hugo1);
		Thread coch3 = new Thread(hugo2);
		Thread coch4 = new Thread(hugo3);
		
		ag1.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		coch1.start();
		coch2.start();
		coch3.start();
		coch4.start();
		
	}

}
