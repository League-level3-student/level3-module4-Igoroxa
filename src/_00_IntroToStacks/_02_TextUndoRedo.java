package _00_IntroToStacks;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class _02_TextUndoRedo implements KeyListener, ActionListener {
	/*
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look
	 * like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character
	 * is erased from the JLabel.
	 * 
	 * Save that deleted character onto a Stack of Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed,
	 * the top Character is popped off the Stack and added back to the JLabel.
	 */
	public static void main(String[] args) {
		_02_TextUndoRedo texteditor = new _02_TextUndoRedo();
		texteditor.setup();

	}

	Stack<Character> chars = new Stack<Character>();
	
	Stack<Character> deleted = new Stack<Character>();
	JFrame frame = new JFrame("Text Editor");
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JButton button = new JButton("Undo");

	void setup() {

		chars.push(' ');
		deleted.push(' ');
		frame.setVisible(true);
		frame.add(panel);
		panel.add(label);
		panel.add(button);
		frame.pack();
		frame.addKeyListener(this);
		panel.addKeyListener(this);
		button.addActionListener(this);
		System.out.println(chars);
		frame.pack();
		KeyListener[] arcs = frame.getKeyListeners();
		frame.requestFocusInWindow();


	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("works");
		// TODO Auto-generated method stub
		if (e.getKeyCode() != 8) {
			chars.push(e.getKeyChar());
			System.out.println("yes");
			label.setText(chars.toString());

		}
		if (e.getKeyCode() == 8) {
			chars.pop();
			deleted.push(chars.pop());
			label.setText(chars.toString());
			
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button) {
			char dele = deleted.pop();
			chars.push(dele);
			label.setText(chars.toString());
			
		}
	}


}
