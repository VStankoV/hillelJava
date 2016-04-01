package L11_12_13_collections.homeWork.guessTheNumber2.entities;

public class Puzzle {
	private int min;
	private int max;
	private int solution;
	private int counter;

	public Puzzle(int min, int max, int solution) {

		if (min > max) {
			int temp = min;
			min = max;
			max = temp;
		}

		solution = solution < min ? min : solution > max ? max : solution;

		this.solution = solution;
		this.min = min;
		this.max = max;
	}

	public boolean isIt(int number) {
		counter++;
		switch (Integer.compare(solution, number)) {
			case -1:
				max = number - 1;
				return false;
			case 0:
				return true;
			case 1:
				min = number + 1;
				return false;
		}
		return false;

	}

}
