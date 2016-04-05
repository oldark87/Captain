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
		gameData.setEnemyShip(new Ship());
		
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
			String message = "Your fire ";
			String message2 = "The enemy ship opens fire on you";
			
			//Player shooting
			//Player hit target
			if(rand.nextInt(101) > 50){
				int damage = gameData.player.getWeapon().getDamage();
				
				if(gameData.enemy.getSp() > 0){
					damage = gameData.enemy.damageShields(damage);
					message += "glances off of your enemy's shields.";
				}
				else{
					damage = damage * -1;
				}
				
				if(damage < 0){
					damage = damage * -1;
					damage = gameData.enemy.damageHull(damage);
					if(damage == 0){
						message += "slams into your opponent's hull, and their ship becomes dead in space!";
					}
					else{
						message += "slams into your opponent's hull!";
					}
				}
				
			}
			//Player missed target
			else{
				message += "misses the enemy!";
			}
			
			//Enemy return fire if not ded yet
			//Enemy hits
			if(rand.nextInt(101) > 50 && gameData.enemy.getHp() > 0 ){
				int damage = gameData.enemy.getWeapon().getDamage();

				if(gameData.player.getSp() > 0){
					damage = gameData.player.damageShields(damage);
					message2 += " and the shot splashes onto your shields.";
				}
				
				if(damage < 0){
					damage = damage * -1;
					damage = gameData.player.damageHull(damage);
					message2 += " and your hull shakes from the damage.";
					if(damage < 1){
						System.out.println("You've been destroyed!");
					}
				}
				
			}
			
			//enemy misses
			else if(gameData.enemy.getHp() > 0){
				message2 +=  " and the shot goes wide!";
			}
			
			System.out.println(message);
			System.out.println(message2);
			System.out.println("Player: " + gameData.player.getSp()+ "/"+ gameData.player.getHp());
			System.out.println("Enemy: " + gameData.enemy.getSp()+ "/"+ gameData.enemy.getHp());
			System.out.println("\n");
			
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
