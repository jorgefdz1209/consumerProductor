package com.netasystem.granjaws;

import java.util.ArrayDeque;
import java.util.Queue;
import com.netasystem.granjaws.Maiz;

public class Parsela {
	
	private static Queue<Maiz> parsela = new ArrayDeque<>();
	private boolean dispo = false;
	
	public synchronized Maiz getMaiz() {
		while (!dispo) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		dispo = false;
		this.notify();
		return parsela.poll();
	}
	
	public synchronized void addMaiz(Maiz m) {
		while(dispo) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		parsela.add(m);
		dispo=true;
		this.notify();
	}
}
