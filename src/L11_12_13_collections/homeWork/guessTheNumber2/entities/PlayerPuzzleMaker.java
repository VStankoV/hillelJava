package L11_12_13_collections.homeWork.guessTheNumber2.entities;

import java.util.Random;

public class PlayerPuzzleMaker implements PuzzleMaker {

	private Puzzle puzzle;

	public PlayerPuzzleMaker(int solution, Difficulty difficulty) {
		Random random = new Random();
		int multiplier = difficulty.getValue();
		int min = solution - (random.nextInt(20) + 10) * multiplier;
		int max = solution + (random.nextInt(20) + 10) * multiplier;
		puzzle = new Puzzle(min, max, solution);
	}

	@Override
	public Puzzle getPuzzle() {
		return puzzle;
	}
}
