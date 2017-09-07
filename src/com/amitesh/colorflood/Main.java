package com.amitesh.colorflood;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		ColorFlood colorFlood = new ColorFlood(10, 10);

		colorFlood.fillColors(5);

		colorFlood.print();

		colorFlood.printColorBoard();

		while (true) {
			int color = readInt("Enter Color");
			colorFlood.changeColors(color);
//			colorFlood.print();
			colorFlood.printColorBoard();
			boolean gameMode=colorFlood.isGameOver();
			
			if (gameMode) {
				System.out.println("Woohh!!! You Have Won The Game");
				System.out.println("Game Over");
				break;
			}

			
		}

	}

	private static int readInt(String message) {
		System.out.println(message);
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));

		String string = null;
		try {
			string = bufferedReader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			return Integer.parseInt(string);
		} catch (NumberFormatException e) {
		}
		return -1;

	}
}
