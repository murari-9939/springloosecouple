package com.example.loosecouple.java;


import  com.example.loosecouple.java.Mariogame;
import com.example.loosecouple.java.supergame;
import com.example.loosecouple.java.GameRunner;

public class Game {
	public static void main(String[] args) {
	
		var supergame= new supergame();
		var gameRunner = new  GameRunner(supergame);
		gameRunner.run();
	}

}
