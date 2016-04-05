package L11_12_13_collections.homeWork.guessTheNumber2.entities;

public class Puzzle {
	private RangeTemp range;
	private int solution;

	public Puzzle(RangeTemp range, int solution) {

		this.solution = solution;
		this.range = range;
	}

	public RangeTemp getRange() {
		return range;
	}

	public boolean isIt(int number) {
		switch (Integer.compare(solution, number)) {
			case -1:
				range = new RangeTemp(range.min, number - 1);
				return false;
			case 0:
				return true;
			case 1:
				range = new RangeTemp(number + 1, range.max);
				return false;
		}
		return false;
	}

}
