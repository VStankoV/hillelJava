package L16_gui_swing;

import javax.swing.*;
import java.awt.event.ActionListener;

public class MainForm extends JFrame{
	private JPanel panel;
	private JButton closeBtn;
	private JButton anotherCloseOperationButton;

	public MainForm() {
		setContentPane(panel);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("hi");

		ActionListener actionListener = actionEvent -> {
			actionEvent.getActionCommand();
			System.exit(0);
		};

		closeBtn.addActionListener(actionListener);
		anotherCloseOperationButton.addActionListener(actionListener);


		closeBtn.setActionCommand("");


		pack();
	}

	public static void main(String[] args) {
		new MainForm();
	}
}
