package _03_Hangman;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.xml.stream.events.Characters;

public class Hangman {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("HangMan");
		JPanel panel = new JPanel();
		JLabel label = new JLabel();
		
		int lives = 10;
		
		frame.add(panel);
		panel.add(label);
		
		String secrets = null;
		
		String question = JOptionPane.showInputDialog("Input number");
		int inputted = Integer.parseInt(question);
		
		String word = Utilities.readRandomLineFromFile("dictionary.txt");
		char[] chars = word.toCharArray();
		
		char[] secret = chars;
		for (int i = 0; i < secret.length; i++) {
			secret[i] = '_';
			 secrets = secret.toString();
		}
		label.setText(secrets);
		
		
		
		
		
		
	}
}
