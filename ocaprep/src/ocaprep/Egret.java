package ocaprep;

import java.util.Random;

public class Egret {
	private String color;
	
	public Egret() {
		this("white");
	}

	public Egret(String color) {
		color = color;
	}

	public static void main(String[] args) {
		Egret e = new Egret();
		System.out.println("Color:" + e.color);
		Random r = new Random();
		System.out.println(r.nextInt(10));

	}

}
