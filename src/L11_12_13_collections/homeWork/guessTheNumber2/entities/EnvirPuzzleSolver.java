package L11_12_13_collections.homeWork.guessTheNumber2.entities;

public class EnvirPuzzleSolver implements PuzzleSolver {

	@Override
	public int getAnswer(Range range) {
		return Math.abs(range.getMax() - range.getMin()) / 2 + range.getMin();
	}
}
