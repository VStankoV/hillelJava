package L11_12_13_collections.homeWork.guessTheNumber2;

import L11_12_13_collections.homeWork.guessTheNumber.DialogResult;
import L11_12_13_collections.homeWork.guessTheNumber2.entities.*;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Start extends JFrame {

	private JRadioButton envPM;
	private JRadioButton playerPM;

	private JRadioButton envPS;
	private JRadioButton playerPS;

	private JComboBox diffChooser;
	private JButton startButton;
	private JPanel rootPanel;
	private JPasswordField inputNum;

	PuzzleMaker puzzleMaker;
	PuzzleSolver puzzleSolver;
	PuzzleMaker.Difficulty difficulty;

	private int solution;


	public Start() throws HeadlessException {
		super("GuessTheNumber");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(rootPanel);
		setLocationRelativeTo(null);
		setSize(500, 288);
		setResizable(false);
		setVisible(true);

		ButtonGroup maker = new ButtonGroup();
		envPM.setActionCommand("env");
		playerPM.setActionCommand("player");
		maker.add(envPM);
		maker.add(playerPM);

		ButtonGroup solver = new ButtonGroup();
		envPS.setActionCommand("env");
		playerPS.setActionCommand("player");
		solver.add(envPS);
		solver.add(playerPS);

		playerPM.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent changeEvent) {
				if (playerPM.isSelected()) {
					inputNum.setEnabled(true);
				} else {
					inputNum.setEnabled(false);
				}

			}
		});

		startButton.addActionListener(new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {

				if (playerPM.isSelected()) {
					try {
						solution = Integer.parseInt(inputNum.getText());
					} catch (NumberFormatException e) {
						inputNum.setText("");
						new DialogResult(Start.this, "Wrong Number!");
						return;
					}
				}
				getDifficulty();
				getGameModeFromRadiobox(maker, solver);

			}
		});
	}

	private void getGameModeFromRadiobox(ButtonGroup maker, ButtonGroup solver) {
		switch (maker.getSelection().getActionCommand()) {
			case "env":
				puzzleMaker = new EnvirPM(difficulty);
				break;
			case "player":
				puzzleMaker = new PlayerPM(solution, difficulty);
				break;
		}

		switch (solver.getSelection().getActionCommand()) {
			case "env":
//				puzzleSolver = new EnvirPS();
				break;
			case "player":
				puzzleSolver = new PlayerPS();
				break;
		}
	}

	private void getDifficulty() {
		switch (diffChooser.getSelectedItem().toString()) {
			case "easy":
				difficulty = PuzzleMaker.Difficulty.EASY;
				break;
			case "medium":
				difficulty = PuzzleMaker.Difficulty.MEDIUM;
				break;
			case "hard":
				difficulty = PuzzleMaker.Difficulty.HARD;
				break;
			case "extra-hard":
				difficulty = PuzzleMaker.Difficulty.EXTRA_HARD;
				break;
			case "nightmare":
				difficulty = PuzzleMaker.Difficulty.NIGHTMARE;
				break;
		}
	}

	public static void main(String[] args) {
		Start f = new Start();
	}

}
