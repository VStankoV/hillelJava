package L11_12_13_collections.homeWork.guessTheNumber2;

import L11_12_13_collections.homeWork.guessTheNumber.DialogResult;
import L11_12_13_collections.homeWork.guessTheNumber2.entities.Puzzle;
import L11_12_13_collections.homeWork.guessTheNumber2.entities.PuzzleSolver;

import javax.swing.*;

public class GameControl {

	public GameControl(Puzzle puzzle, PuzzleSolver puzzleSolver, JFrame frame) {

		int tryCounter = 0;
		int tryNum;
		boolean ugadal;

		StringBuilder sb = new StringBuilder();

		do {
			tryCounter++;
			sb.append("№ " + tryCounter);
			tryNum = puzzleSolver.getAnswer(puzzle.getRange());
			sb.append("; Число " + tryNum);
			ugadal = puzzle.isIt(tryNum);
			sb.append(" - " + ugadal + "\n");
		} while (!ugadal);
		sb.append("Ответ " + tryNum);

		new DialogResult(frame, sb.toString());
	}


}
