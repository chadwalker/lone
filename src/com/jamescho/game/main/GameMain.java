package com.jamescho.game.main;
import javax.swing.JFrame;

public class GameMain {

	private static final String GAME_TITLE = "LoanBall";
	public static final int GAME_WIDTH = 800;
	public static final int GAME_HEIGHT = 400;
	public static Game sGame;
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame(GAME_TITLE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
		
		sGame = new Game(GAME_WIDTH, GAME_HEIGHT);
		
		frame.add(sGame);
		frame.pack();
		
		frame.setVisible(true);

	}

}
