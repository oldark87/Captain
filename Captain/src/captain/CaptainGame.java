package captain;

import javax.swing.JFrame;

/**
 * Runs the game
 * @author Matthew Henderson
 */

public class CaptainGame {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Captain Battle");
		frame.add(new CaptainPanel());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

}
