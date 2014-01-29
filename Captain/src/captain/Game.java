package captain;

import java.util.Random;

/**
 * Contains main function for testing.
 * Contains game functions
 * @author Matthew Henderson
 *
 */

public class Game {
	Random generator = new Random();

	/**
	 * @param attacker The ship that is firing
	 * @param target   The target of the attack
	 * @return int the damage done
	 */
	public int fire(Ship attacker, Ship target){
		Weapon weapon = attacker.getWeapon();
		//indicates a miss (70% accuracy)
		if(generator.nextInt(101) < 30){
			return 0;
		}
		
		//Hit
		else{
			int damage = weapon.getDamage();
			//deal damage to shields first if they still exist
			int sp = target.getSp();
			if(sp > 0){
				sp -= damage;
				if(sp < 0)
					sp = 0;
				target.setSp(sp);
			}
			
			//damage goes to hull if no shields are up
			else{
				int hp = target.getHp();
				hp -= damage;
				target.setHp(hp);
			}
			return damage;
		}		
	}
	//Will transition the turn to the ai with no actions from player
	// (turns not yet implemented
	public void pass(){
	    //TODO
	}
	
	/**
	 * Attempts to retreat from the enemy ship (not fully implemented)
	 * @param player Ship object of the player
	 * @param enemy  Ship object of the ai
	 * @return String was retreat successful or not?
	 */
	public String retreat(Ship player,Ship enemy){
		if(player.getMaxSpeed() > enemy.getMaxSpeed()){
			return "Escape Successful";
		}
		else if(player.getMaxSpeed() < enemy.getMaxSpeed()){
			return "Failed to get away!";
		}
		//if equal speeds 50/50 chance
		else{
			if(generator.nextInt(2) == 0){
				return "Failed to get away!";
			}
			else return "Escape Successful!";
		}
	}
			
	
	public static void main(String[] args) {
		Game game = new Game();
		Ship ship1 = new Ship();
		Ship ship2 = new Ship();
		//ship2.setMaxSpeed(50);
		System.out.println(game.retreat(ship1, ship2));
		System.out.println(game.retreat(ship2, ship1));
	}

}
