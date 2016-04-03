package L11_12_13_collections.homeWork.guessTheNumber2.entities;

import java.util.Random;

public class EnvirPuzzleMaker implements PuzzleMaker {

	private int start = -10;
	private int end = 10;

	public EnvirPuzzleMaker(Difficulty difficulty) {
		int multiplier = difficulty.getValue();
		start *= multiplier;
		end *= multiplier;
	}

	@Override
	public Puzzle getPuzzle() {
		return new Puzzle(start, end, createSolution());
	}

	public int createSolution() {
		Random r = new Random();
		return r.nextInt(end - start + 1) + start;
	}

}
