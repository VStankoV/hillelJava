package L11_12_13_collections.homeWork.guessTheNumber2.entities;

public interface PuzzleMaker {

	enum Difficulty {
		EASY(1), MEDIUM(10), HARD(100), EXTRA_HARD(1000), NIGHTMARE(10000);
		private int value;

		Difficulty(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}
	}

	Puzzle getPuzzle();
}
