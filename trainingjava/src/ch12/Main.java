package ch12;

import ch10.Matango2;

public class Main {

	public static void main(String[] args) {
		
		Wizard w = new Wizard();
		Matango2 m = new Matango2(0);
		
		w.name = "アサカ";
		w.attack(m);
		w.fireball(m);
	}
}
