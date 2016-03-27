package L11_12_13_collections.homeWork.guessTheNumber;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogResult extends JDialog implements ActionListener {

	JPanel rootPanel;

	public DialogResult(JFrame parent, String message) {
		super(parent, "", true);
		if (parent != null) {
			Dimension parentSize = parent.getSize();
			Point p = parent.getLocation();
			setLocation(p.x + parentSize.width / 4, p.y + parentSize.height / 4);
		}
		JPanel messagePane = new JPanel();
		messagePane.add(new JLabel("<html><h1><strong>"+message+"</strong></h1></html>"));
		getContentPane().add(messagePane);
		JPanel buttonPane = new JPanel();
		JButton button = new JButton("OK");
		buttonPane.add(button);
		button.addActionListener(this);
		getContentPane().add(buttonPane, BorderLayout.SOUTH);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		pack();
		setVisible(true);
		button.requestFocus();
	}

	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		this.setVisible(false);
		dispose();
	}
}
