package src;

import javax.swing.SwingUtilities;

public class Main {
	
	public static void main(String args[]) {
		SwingUtilities.invokeLater(Window::new);
		SwingUtilities.invokeLater(Computer::new);
	}
	
}
