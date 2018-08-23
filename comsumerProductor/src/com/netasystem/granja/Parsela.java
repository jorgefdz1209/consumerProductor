package com.netasystem.granja;

import java.util.ArrayDeque;
import java.util.Queue;

public class Parsela {
	
	private static Queue<Maiz> parsela = new ArrayDeque<>();
	private static boolean dispo = false;
	
	public static void addMaiz(Maiz maiz) {
		parsela.add(maiz);
	}
	
	public static Maiz getMaiz() {
		return parsela.poll();
		
	}

	public static boolean isDispo() {
		return dispo;
	}

	public static void setDispo(boolean dispo) {
		Parsela.dispo = dispo;
	}
}
