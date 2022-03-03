package com.githubflow.main;

import com.githubflow.domain.Computador;
import com.githubflow.domain.Monitor;
import com.githubflow.domain.Orden;
import com.githubflow.domain.Raton;
import com.githubflow.domain.Teclado;

public class MainMundoPC {

	public static void main(String[] args) {
		Computador computador1 = new Computador("Asus vivo book 4xj15",
		        new Monitor("DELL", 5.6), new Teclado("Bluetooth", "MSI"),
		        new Raton("USB tipo C", "HP"));
		
		Computador computador2 = new Computador("Notepad HP", new Monitor("MSI", 5.6),
		        new Teclado("USC tipo C", "MI"), new Raton("USB tipo C", "HP"));
		
		Computador computador3 = new Computador("Lenovo", new Monitor("LEnovo", 5.6),
		        new Teclado("USC tipo C", "Lenocvo"), new Raton("USB tipo C", "HP"));
		
		Computador computador4 = new Computador("Sansumg", new Monitor("Sangsum", 5.6),
		        new Teclado("USC tipo C", "MSI"), new Raton("USB tipo C", "HP"));
		
		Orden orden1 = new Orden();
		orden1.agregarComputador(computador1);
		orden1.agregarComputador(computador2);
		orden1.agregarComputador(computador3);
		orden1.agregarComputador(computador4);
		orden1.agregarComputador(computador4);
		orden1.mostrarOrden();
	}
}
