package L11_12_13_collections.homeWork.guessTheNumber;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class MainFrame extends JFrame {
	private JPanel rootPanel;
	private JButton startButton;
	private JTextField startBoundTF;
	private JTextField endBoundTF;
	private JTextField inputTF;
	private JLabel tryCounterLabel;
	private JLabel fromLabel;
	private JLabel toLabel;
	private JLabel instructionLabel;
	private JPanel radioPanel;

	private int startBound;
	private int endBound;
	private int solution;

	private int tryCounter;

	private boolean isEnd;

	private Comparator intComparator = new Comparator() {
		@Override
		public int compare(Object o, Object t1) {
			int a = (int) o;
			int b = (int) t1;

			return a < b ? -1 : a == b ? 0 : 1;
		}
	};


	public MainFrame() {
		super("GuessTheNumber");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(rootPanel);
		setLocationRelativeTo(null);

		fromLabel.setHorizontalAlignment(SwingConstants.CENTER);
		toLabel.setHorizontalAlignment(SwingConstants.CENTER);


		startButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				isEnd = false;

				startBoundTF.setEnabled(false);
				endBoundTF.setEnabled(false);
				inputTF.setEnabled(true);
				inputTF.setSelectionStart(0);
				inputTF.setSelectionEnd(100500);
				startButton.setEnabled(false);
				startBound = Integer.parseInt(startBoundTF.getText());
				endBound = Integer.parseInt(endBoundTF.getText());

				if (startBound > endBound) {
					int temp = startBound;
					startBound = endBound;
					endBound = temp;
				}
				refresh();

				solution = getRandomIntInRangeInclusive(startBound, endBound);
				System.out.println(solution);

				inputTF.requestFocus();


			}
		});
		pack();
		setVisible(true);
		inputTF.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent keyEvent) {
				if (keyEvent.getKeyCode() == KeyEvent.VK_ENTER) {
					tryCounter++;
					int input;
					String message = "";
					try {
						input = Integer.parseInt(inputTF.getText());
					} catch (Exception e) {
						inputTF.setText("");
						message = "Wrong Input!";
						new DialogResult(MainFrame.this, message);
						return;
					}
					System.out.println(input);
					if (input >= startBound && input <= endBound) {
						switch (intComparator.compare(solution, input)) {
							case -1:
								message = "меньше";
								endBound = input - 1;
								break;
							case 0:
								message = "ДА!";
								startBoundTF.setEnabled(true);
								endBoundTF.setEnabled(true);
								inputTF.setEnabled(false);
								startButton.setEnabled(true);

								isEnd = true;
								tryCounter = 0;

								break;
							case 1:
								message = "больше";
								startBound = input + 1;
								break;
						}
					} else {
						message = "outOfBound!";
						inputTF.setText("");
					}
					inputTF.setSelectionStart(0);
					inputTF.setSelectionEnd(100500);
					new DialogResult(MainFrame.this, message);
					refresh();
				}

			}
		});
	}

	public void refresh() {
		if (isEnd){
			tryCounterLabel.setText("Попыток : " + 0);
			instructionLabel.setText("жми START !");
			fromLabel.setText("");
			toLabel.setText("");

		} else {
			tryCounterLabel.setText("Попыток : " + tryCounter);
			instructionLabel.setText("<html>Введите число<p>в диапазоне [" +
					startBound + "," + endBound + "]<p>и нажмите ENTER</html>");
			fromLabel.setText(String.valueOf(startBound));
			toLabel.setText(String.valueOf(endBound));
		}
	}

	public static int getRandomIntInRangeInclusive(int a, int b) {

		if (a == b) {
			return a;
		}

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

	public static void main(String[] args) {

	}
}
