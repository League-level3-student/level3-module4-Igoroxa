package _03_Hangman;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.xml.stream.events.Characters;

public class Hangman implements KeyListener {

	JFrame frame = new JFrame("HangMan");
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	String secrets = null;
	char[] secret;
	char[] actual;
	String temp2;
	String word;

	void run() {

		frame.setVisible(true);
		int lives = 10;

		frame.add(panel);
		panel.add(label);

		frame.addKeyListener(this);

		String question = JOptionPane.showInputDialog("Input number");
		int inputted = Integer.parseInt(question);

		word = Utilities.readRandomLineFromFile("dictionary.txt");
		char[] chars = word.toCharArray();
		// System.out.println(word);
		actual = chars.clone();
		System.out.println(actual);
		secret = chars;
		System.out.println(chars);
		// System.out.println(secret[1]);

		StringBuilder empty = new StringBuilder();

		for (int i = 0; i < secret.length; i++) {
			secret[i] = '_';
			empty.append('_');

		}
		String constructed = empty.toString();
		label.setText(constructed);
		// System.out.println(constructed);
		frame.pack();

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		char pressed = e.getKeyChar();
		System.out.println(pressed);
		//System.out.println(actual);
		System.out.println(secret);
		String temps = null;
		for (int i = 0; i < secret.length; i++) {
			if (actual[i] == pressed) {
				secret[i] = pressed;
			}
			

		}
		label.setText(new String(secret));
		System.out.println(label.getText());
		
		if (label.getText().equals(word)) {
			JOptionPane.showMessageDialog(null, "You win the game");
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
