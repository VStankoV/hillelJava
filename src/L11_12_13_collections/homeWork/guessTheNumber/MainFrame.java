package L11_12_13_collections.homeWork.guessTheNumber;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

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

	private GTNGameController controller;

	public MainFrame() {
		super("GuessTheNumber");

		JRadioButton pve = new JRadioButton("PvE");
		pve.setSelected(true);
		pve.setActionCommand("pve");
		JRadioButton pvp = new JRadioButton("PvP");
		pvp.setActionCommand("pvp");
		JRadioButton eve = new JRadioButton("EvE");
		eve.setActionCommand("eve");
		JRadioButton evp = new JRadioButton("EvP");
		evp.setActionCommand("evp");


		ButtonGroup group = new ButtonGroup();
		group.add(pve);
		group.add(pvp);
		group.add(eve);
		group.add(evp);

		radioPanel.add(pve);
		radioPanel.add(pvp);
		radioPanel.add(eve);
		radioPanel.add(evp);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(rootPanel);
		setLocationRelativeTo(null);
		setSize(350,450);

		fromLabel.setHorizontalAlignment(SwingConstants.CENTER);
		toLabel.setHorizontalAlignment(SwingConstants.CENTER);
//		instructionLabel.setHorizontalAlignment(SwingConstants.CENTER);



		startButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				switch (group.getSelection().getActionCommand()) {
					case "pve":

						break;
					case "pvp":

						break;
					case "eve":

						break;
					case "evp":

						break;
				}

				int start = Integer.parseInt(startBoundTF.getText());
				int end = Integer.parseInt(endBoundTF.getText());

				controller = new GTNGameController(start, end);

				startBoundTF.setEnabled(false);
				endBoundTF.setEnabled(false);
				inputTF.setEnabled(true);
				inputTF.setText("");
				startButton.setEnabled(false);

				refresh();

				inputTF.requestFocus();

			}
		});
		setVisible(true);
		inputTF.addKeyListener(
				new KeyAdapter() {
					@Override
					public void keyPressed(KeyEvent keyEvent) {
						if (keyEvent.getKeyCode() != KeyEvent.VK_ENTER) {
							return;
						}
						controller.increaseTryCounter();

						int input;
						try {
							input = Integer.parseInt(inputTF.getText());
						} catch (NumberFormatException e) {
							inputTF.setText("");
							refresh();
							new DialogResult(MainFrame.this, "Wrong Input!");
							return;
						}

						if (input < controller.getStartBound() || input > controller.getEndBound()) {
							inputTF.setText("");
							refresh();
							new DialogResult(MainFrame.this, "outOfBounds!");
							return;
						}

						String message = controller.nextMove(input);

						inputTF.setSelectionStart(0);
						inputTF.setSelectionEnd(100500);

						refresh();
						new DialogResult(MainFrame.this, message);
					}
				}
		);
	}

	public static void main(String[] args) {
		new MainFrame();
	}

	public void refresh() {
		if (controller.isEnd()) {
			startBoundTF.setEnabled(true);
			endBoundTF.setEnabled(true);
			inputTF.setEnabled(false);
			startButton.setEnabled(true);

			instructionLabel.setText("жми START !");
			fromLabel.setText("");
			toLabel.setText("");
			tryCounterLabel.setText("Попыток : " + controller.getTryCounter());

		} else {
			String start = String.valueOf(controller.getStartBound());
			String end = String.valueOf(controller.getEndBound());

			tryCounterLabel.setText("Попыток : " + controller.getTryCounter());
			instructionLabel.setText("<html>Введите число в диапазоне [" +
					start + "," + end + "]<p>и нажмите ENTER</html>");
			fromLabel.setText(start);
			toLabel.setText(end);
		}
	}
}
