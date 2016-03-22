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
	Random rand;
	private GameData gameData;
	
	/**
	 * Creates the new Panel
	 */
	public CaptainPanel(){
		gameData = new GameData();
		gameData.setPlayerShip(new Ship());
		
		rand = new Random();
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
			
			//Player shooting
			if(rand.nextInt(101) > 20){
				System.out.println(gameData.player);
				System.out.println("Enemy hit!");
				int damage = gameData.player.getWeapon().getDamage();
				if(gameData.enemy.getSp() > 0){
					damage = gameData.enemy.damageShields(damage*-1);
				}
				
				if(damage < 0){
					damage = damage * -1;
					damage = gameData.enemy.damageHull(damage);
					if(damage < 1){
						System.out.println("Enemy destroyed!");
					}
				}
				
			}
			
			//Enemy return fire
			if(rand.nextInt(101) > 80){
				System.out.println("You've been hit!");
				int damage = gameData.enemy.getWeapon().getDamage();
				
				if(gameData.player.getSp() > 0){
					damage = gameData.player.damageShields(damage*-1);
				}
				
				if(damage < 0){
					damage = damage * -1;
					damage = gameData.player.damageHull(damage);
					if(damage < 1){
						System.out.println("You've been destroyed!");
					}
				}
				
			}
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
