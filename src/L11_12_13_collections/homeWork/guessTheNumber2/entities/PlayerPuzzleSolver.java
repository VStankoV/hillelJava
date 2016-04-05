package L11_12_13_collections.homeWork.guessTheNumber2.entities;

import L11_12_13_collections.homeWork.guessTheNumber2.GetAnswer;

public class PlayerPuzzleSolver implements PuzzleSolver {
	@Override
	public int getAnswer(RangeTemp range) {
		GetAnswer dialog = new GetAnswer(range.min, range.max);
		return dialog.getInput();
	}
}
