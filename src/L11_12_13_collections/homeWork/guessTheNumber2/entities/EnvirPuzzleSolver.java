package L11_12_13_collections.homeWork.guessTheNumber2.entities;

public class EnvirPuzzleSolver implements PuzzleSolver {

	@Override
	public int getAnswer(RangeTemp range) {
		return Math.abs(range.max - range.min) / 2 + range.min;
	}
}
