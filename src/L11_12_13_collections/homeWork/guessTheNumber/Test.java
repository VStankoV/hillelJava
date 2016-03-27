package L11_12_13_collections.homeWork.guessTheNumber;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Test {
	private JFormattedTextField formattedTextField1;
	private JPanel panel1;

	public Test() {
		formattedTextField1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				super.keyTyped(e);
			}
		});
	}


	public static void main(String[] args) {

	}
}
