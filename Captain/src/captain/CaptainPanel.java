package captain;

import javax.swing.*;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

/**
 * JPanel class for the battlescreen
 * @author Matthew Henderson
 */
public class CaptainPanel extends JPanel {
	private final int WIDTH = 500;
	private final int HEIGHT = 500;
	private JButton fireButton;
	private JButton waitButton;
	private JButton retreatButton;
	private JLabel scoreLabel;
	private GameData gameData = new GameData();
	
	/**
	 * Creates the new Panel
	 */
	public CaptainPanel(){
		setPreferredSize(new Dimension(WIDTH,HEIGHT));
		scoreLabel = new JLabel("Kills: 0");
		fireButton = new JButton("Fire!");
		waitButton = new JButton("Wait for opponent");
		retreatButton = new JButton("Retreat!");
		fireButton.addActionListener(new FireListener());
		waitButton.addActionListener(new WaitListener());
		retreatButton.addActionListener(new RetreatListener());
		
		fireButton.setActionCommand("Fire");
		waitButton.setActionCommand("Wait");
		retreatButton.setActionCommand("Retreat");
		
		add(fireButton);
		add(waitButton);
		add(retreatButton);
		add(scoreLabel);
		}
	
	private class FireListener implements ActionListener{
		public FireListener(){}
		public void actionPerformed(ActionEvent event){
			//put what the button does here
		}
	}
	
	private class WaitListener implements ActionListener{
		public WaitListener(){}
		public void actionPerformed(ActionEvent event){
			//put what the button does here
		}
	}
	private class RetreatListener implements ActionListener{
		public RetreatListener(){}
		public void actionPerformed(ActionEvent event){
			//put what the button does here
		}
	}
}
