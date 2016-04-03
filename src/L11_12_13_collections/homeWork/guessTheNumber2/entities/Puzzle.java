package L11_12_13_collections.homeWork.guessTheNumber2.entities;

public class Puzzle {
	private Range range = new Range();
	private int solution;

	public Puzzle(int min, int max, int solution) {

		if (min > max) {
			int temp = min;
			min = max;
			max = temp;
		}

//		solution = solution < min ? min : solution > max ? max : solution;

		this.solution = solution;
		range.setMin(min);
		range.setMax(max);
	}

	public Range getRange() {
		return range;
	}

	public boolean isIt(int number) {
		switch (Integer.compare(solution, number)) {
			case -1:
				range.setMax(number - 1);
				return false;
			case 0:
				return true;
			case 1:
				range.setMin(number + 1);
				return false;
		}
		return false;
	}

}

class Range {
	private int min;
	private int max;

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}
}
