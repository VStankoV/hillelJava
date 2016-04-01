package L11_12_13_collections.homeWork.guessTheNumber2.entities;

import java.util.Random;

public class EnvirPM implements PuzzleMaker {

	private int start = -10;
	private int end = 10;
	private Difficulty difficulty;


	public EnvirPM(Difficulty difficulty) {
		this.difficulty = difficulty;
		int multiplier = difficulty.getValue();
		start *= multiplier;
		end *= multiplier;
	}

	@Override
	public Puzzle getPuzzle() {
		return new Puzzle(start, end, createSolution(difficulty.getValue()));
	}

	public int createSolution(int dif) {
		Random r = new Random();
		return r.nextInt(end * dif - start * dif + 1) + start * dif;
	}

}
