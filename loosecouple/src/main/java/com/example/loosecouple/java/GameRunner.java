package com.example.loosecouple.java;

public class GameRunner {
	 private Mariogame game;
	 public GameRunner(Mariogame game) {
		 this.game=game;
	 }
	public void run() {
		// TODO Auto-generated method stub
		game.up();
		game.down();
		game.left();
		game.right();
		
	}

}
