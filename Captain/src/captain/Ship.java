
package captain;

/**
 * Contains the ship object and key statistics for it.
 * @author Matthew Henderson
 *
 */
public class Ship {
	int maxSpeed;
	int maxHull;
	int hp;
	int maxShields;
	int sp;
	Weapon weapon;
	
	/**
	 * Blank constructor creates a generic ship with a very basic weapon and stats
	 */
	public Ship(){
		maxSpeed = 100;
		maxHull = 20;
		hp = maxHull;
		maxShields = 10;
		sp = maxShields;
		weapon = new Weapon();
	}

	/**
	 * @return the maxSpeed
	 */
	public int getMaxSpeed() {
		return maxSpeed;
	}

	/**
	 * @param maxSpeed the maxSpeed to set
	 */
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	/**
	 * @return the maxHull
	 */
	public int getMaxHull() {
		return maxHull;
	}

	/**
	 * @param maxHull the maxHull to set
	 */
	public void setMaxHull(int maxHull) {
		this.maxHull = maxHull;
	}

	/**
	 * @return the hp
	 */
	public int getHp() {
		return hp;
	}

	/**
	 * @param hp the hp to set
	 */
	public void setHp(int hp) {
		this.hp = hp;
	}

	/**
	 * @return the maxShields
	 */
	public int getMaxShields() {
		return maxShields;
	}

	/**
	 * @param maxShields the maxShields to set
	 */
	public void setMaxShields(int maxShields) {
		this.maxShields = maxShields;
	}

	/**
	 * @return the sp
	 */
	public int getSp() {
		return sp;
	}

	/**
	 * @param sp the sp to set
	 */
	public void setSp(int sp) {
		this.sp = sp;
	}

	/**
	 * @return the weapon
	 */
	public Weapon getWeapon() {
		return weapon;
	}

	/**
	 * @param weapon the weapon to set
	 */
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	/*
	 * Damage the ship's current shields.
	 * @return Shield value post damage (+ or -)
	 */
	public int damageShields(int damage){
		sp -= damage;
		int retVal = sp;
		if(sp < 0){
			sp = 0;
		}
		
		return retVal;
	}
	
	/*
	 * Damage the ship's current hull
	 * @return hull value post damage (+ or -)
	 */
	public int damageHull(int damage){
		hp -= damage;
		int retVal = hp;
		if(hp < 0){
			hp = 0;
		}
		
		return retVal;
	}
	
	
}
