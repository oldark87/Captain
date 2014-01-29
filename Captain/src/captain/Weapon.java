package captain;
/**
 * Contains the weapon object and key statistics for it.
 * Used in ship class
 * @author Matthew Henderson
 */
public class Weapon {
	String type;
	int damage;
	
	public Weapon(int dmg, String typ){
		type = typ;
		damage = dmg;
	}
	
	/**
	 * Getters and Setters for damage amount (int) and damage type (string)
	 */
	public void setDamage(int dmg){
		damage = dmg;
	}
	
	public void setType(String type){
		this.type = type;
	}
	
	public int getDamage(){
		return damage;
	}
	
	public String getType(){
		return type;
	}
	
}