package com.amitesh.colorflood;

import java.util.Random;

public class ColorFlood {

	int[][] board;

	public ColorFlood(int row, int col) {
		this.board = new int[row][col];

	}

	public void fillColors(int noOfColors) {
		Random r = new Random();
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				board[i][j] = r.nextInt(noOfColors);
			}
		}
	}

	public void print() {

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				System.out.print(" " + board[i][j]);

			}
			System.out.println(" ");
		}

	}

	public void printColorBoard() {

		for (int i = 0; i < board[0].length; i++) {
			System.out.print(" _ _");
		}
		System.out.println();
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length + 1; j++) {
				System.out.print("|");
				if (j != board[0].length) {
					if (board[i][j] == 0) {
						System.out.print("_" + "R" + "_");
					}
					if (board[i][j] == 1) {
						System.out.print("_" + "G" + "_");
					}
					if (board[i][j] == 2) {
						System.out.print("_" + "B" + "_");
					}
					if (board[i][j] == 3) {
						System.out.print("_" + "Y" + "_");
					}
					if (board[i][j] == 4) {
						System.out.print("_" + "P" + "_");
					}
					if (board[i][j] == -1) {
						System.out.print("_" + " " + "_");
					}
				}

			}
			System.out.println();
		}

	}

	int row = 0;
	int col = 0;

	public void changeColors(int color) {
		if (isValidColor(color, 0, 0,
				new boolean[board.length][board[0].length])) {
			System.out.println("Valid");
			fillcolor(0, 0, color, board[0][0]);
		} else {
			System.out.println("Not");
		}

	}

	private void fillcolor(int i, int j, int color, int oldColor) {
		board[i][j] = color;
		if (isValidIndex(i - 1, j)) {
			if (board[i - 1][j] == oldColor) {
				fillcolor(i - 1, j, color, oldColor);
			}

		}
		if (isValidIndex(i, j - 1)) {
			if (board[i][j - 1] == oldColor) {
				fillcolor(i, j - 1, color, oldColor);
			}

		}
		if (isValidIndex(i, j + 1)) {
			if (board[i][j + 1] == oldColor) {
				fillcolor(i, j + 1, color, oldColor);
			}

		}
		if (isValidIndex(i + 1, j)) {
			if (board[i + 1][j] == oldColor) {
				fillcolor(i + 1, j, color, oldColor);
			}

		}
	}

	private boolean isValidIndex(int i, int j) {
		return (i >= 0 && i < board.length && j >= 0 && j < board[0].length);
	}

	private boolean isValidColor(int color, int i, int j, boolean[][] check) {
		if (color == board[0][0]) {
			return false;
		}
		check[i][j] = true;
		if (isValidIndex(i - 1, j)) {
			if (board[i - 1][j] == color) {
				return true;
			}
			if (board[i - 1][j] == board[0][0] && !check[i - 1][j]) {
				if (isValidColor(color, i - 1, j, check)) {
					return true;
				}
			}

		}
		if (isValidIndex(i, j - 1)) {
			if (board[i][j - 1] == color) {
				return true;
			}
			if (board[i][j - 1] == board[0][0] && !check[i][j - 1]) {
				if (isValidColor(color, i, j - 1, check)) {
					return true;
				}
			}

		}
		if (isValidIndex(i, j + 1)) {
			if (board[i][j + 1] == color) {
				return true;
			}
			if (board[i][j + 1] == board[0][0] && !check[i][j + 1]) {
				if (isValidColor(color, i, j + 1, check)) {
					return true;
				}
			}

		}
		if (isValidIndex(i + 1, j)) {
			if (board[i + 1][j] == color) {
				return true;
			}
			if (board[i + 1][j] == board[0][0] && !check[i + 1][j]) {
				if (isValidColor(color, i + 1, j, check)) {
					return true;
				}
			}

		}

		return false;
	}

	public boolean isGameOver() {
		int count = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] != board[0][0]) {
					return false;
				}
			}
		}

		return true;

	}

}
