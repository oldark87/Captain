package captain;
/**
 * Contains the weapon object and key statistics for it.
 * Used in ship class
 * @author Matthew Henderson
 */
public class Weapon {
	String type;
	int damage, firerate;
	
	/*
	 * Primary Constructor for all 3 attributes
	 */
	public Weapon(int dmg, int fr, String typ){
		type = typ;
		damage = dmg;
		firerate = fr;		
	}
	
	/*
	 * Default empty constructor for a basic gun
	 */
	public Weapon(){
		damage = 5;
		firerate = 1;
		type = "gun";
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
	
	public void setFireRate(int firerate){
		this.firerate = firerate;
	}
	
	public int getDamage(){
		return damage;
	}
	
	public String getType(){
		return type;
	}
	
	public int getFireRate(){
		return firerate;
	}
	
}
