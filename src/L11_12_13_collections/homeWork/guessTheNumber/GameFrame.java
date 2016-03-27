package L11_12_13_collections.homeWork.guessTheNumber;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GameFrame extends JFrame {
	JLabel labelStart, labelEnd;
	private int startBound = 0;
	private int endBound = 100;


	public GameFrame() throws HeadlessException {
		setLayout(new BoxLayout(null, BoxLayout.Y_AXIS));
		setTitle("!!! GuessTheNumber !!!");

	}

	public int proposeNumber(int startBound, int endBound) {
		return startBound + (new Random()).nextInt(endBound - startBound + 1);
	}


}
