package L11_12_13_collections.homeWork.guessTheNumber2.entities;

public class EnvirPS implements PuzzleSolver {
	private Puzzle puzzle;

	public EnvirPS(Puzzle puzzle) {
		this.puzzle = puzzle;

/*
		switch (Integer.compare(solution, input)) {
			case -1:
				result = "меньше";
				endBound = input - 1;
				break;
			case 0:
				result = "ДА!";
				isEnd = true;

				break;
			case 1:
				result = "больше";
				startBound = input + 1;
				break;
		}
*/


	}

	@Override
	public int getAnswer(int start, int end) {
		return Math.abs(start - end)/2 + start;
	}
}
