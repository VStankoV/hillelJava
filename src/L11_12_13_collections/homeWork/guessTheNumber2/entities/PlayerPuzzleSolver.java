package L11_12_13_collections.homeWork.guessTheNumber2.entities;

import L11_12_13_collections.homeWork.guessTheNumber2.GetAnswer;

public class PlayerPuzzleSolver implements PuzzleSolver {
	@Override
	public int getAnswer(Range range) {
		GetAnswer dialog = new GetAnswer(range.getMin(), range.getMax());
		return dialog.getInput();
	}
}
