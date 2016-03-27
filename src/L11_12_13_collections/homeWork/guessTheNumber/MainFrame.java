package L11_12_13_collections.homeWork.guessTheNumber;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MainFrame extends JFrame {
	private JPanel rootPanel;
	private JButton startButton;
	private JTextField startBoundTF;
	private JTextField endBoundTF;
	private JTextField inputTF;
	private JLabel tryCounter;
	private JLabel fromLabel;
	private JLabel toLabel;
	private JLabel instructionLabel;
	private JPanel radioPanel;

	private int startBound;
	private int endBound;
	private int solution;

	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(rootPanel);

		startButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				startBoundTF.setEnabled(false);
				endBoundTF.setEnabled(false);
				inputTF.setEnabled(true);
				startBound = Integer.parseInt(startBoundTF.getText());
				endBound = Integer.parseInt(endBoundTF.getText());

				if (startBound > endBound) {
					int temp = startBound;
					startBound = endBound;
					endBound = temp;
				}

				int fromZeroTo = 0;


				Random r = new Random();
				solution = r.nextInt(endBound - startBound + 1) + startBound - 1;
				System.out.println(solution);
				System.out.println(endBound - startBound + 1);


				instructionLabel.setText("<html>Введите число в диапазоне [" + startBound + "," + endBound + "]<p> и нажмите ENTER</html>");
			}
		});
		pack();
		setVisible(true);
	}
}
