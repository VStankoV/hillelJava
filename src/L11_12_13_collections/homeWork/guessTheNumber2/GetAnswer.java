package L11_12_13_collections.homeWork.guessTheNumber2;

import L11_12_13_collections.homeWork.guessTheNumber.DialogResult;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GetAnswer extends JDialog {
	int input;
	private int min;
	private int max;
	private JPanel contentPane;
	private JButton buttonOK;
	private JTextField inputTF;
	private JLabel labelRange;

	public GetAnswer(int min, int max) {
		setLocationRelativeTo(null);
		this.min = min;
		this.max = max;
		labelRange.setText("Enter number from " + min + "to " + max);
		setContentPane(contentPane);
		setModal(true);
		getRootPane().setDefaultButton(buttonOK);

		buttonOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				onOK();
			}
		});

		pack();
		setVisible(true);
//		System.exit(0);


	}

	public int getInput() {
		return input;
	}

	private void onOK() {
// add your code her
		try {
			input = Integer.parseInt(inputTF.getText());

		} catch (NumberFormatException e) {
			inputTF.setText("");
			new DialogResult(null, "Wrong Input!");
			return;
		}

		if (input < min || input > max) {
			inputTF.setText("");
			new DialogResult(null, "outOfBounds!");
			return;
		}
		dispose();
	}

}
