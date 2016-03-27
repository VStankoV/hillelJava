package L11_12_13_collections.homeWork.guessTheNumber;

import javax.swing.*;
import java.awt.*;

public class IntInput {
	public static void main(String args[]) {
		JFrame frame = new JFrame("Verifier Sample");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTextField textField1 = new JTextField();
		JTextField textField2 = new JTextField();
		InputVerifier verifier = new InputVerifier() {
			public boolean verify(JComponent comp) {
				boolean returnValue;
				JTextField textField = (JTextField) comp;
				try {
					Integer.parseInt(textField.getText());
					returnValue = true;
				} catch (NumberFormatException e) {
					returnValue = false;
				}
				return returnValue;
			}
		};
		textField1.setInputVerifier(verifier);
		frame.add(textField1, BorderLayout.NORTH);
		frame.add(textField2, BorderLayout.CENTER);
		frame.setSize(300, 100);
		frame.setVisible(true);
	}
}