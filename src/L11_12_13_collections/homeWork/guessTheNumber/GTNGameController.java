package L11_12_13_collections.homeWork.guessTheNumber;

import java.util.Random;

public class GTNGameController {
	private int startBound;
	private int endBound;
	private int solution;

	private int tryCounter;

	private boolean isEnd;

	public GTNGameController(int start, int end) {
		solution = getRandomIntInRangeInclusive(start, end);

		this.startBound = start;
		this.endBound = end;

		if (startBound > endBound) {
			int temp = startBound;
			startBound = endBound;
			endBound = temp;
		}

		isEnd = false;
		tryCounter = 0;
	}

	public String nextMove(int input) {
		String result = null;

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
		return result;
	}

	public boolean isEnd() {
		return isEnd;
	}

	public int getStartBound() {
		return startBound;
	}

	public int getEndBound() {
		return endBound;
	}

	public int getTryCounter() {
		return tryCounter;
	}

	public void increaseTryCounter() {
		tryCounter++;
	}

	public int getRandomIntInRangeInclusive(int a, int b) {
		if (a == b) return a;

		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}

		Random r = new Random();
		int result;
		if (a < 0 && b < 0) {
			result = r.nextInt(Math.abs(a) + b + 1) + a;
		} else {
			result = r.nextInt(Math.abs(b) - a + 1) + a;
		}

		return result;
	}

}
