package captain;


/**
 * Contains data for the game such as ships in combat and scores
 * @author Matthew Henderson
 */

public class GameData {
	protected Ship player;
	protected Ship enemy;
	private int kills;
	
	/*
	 * Constructor for GameData
	 */
	public void GameData(){
		player = new Ship();
		enemy = new Ship();
		kills = 0;
	}
	
	public void setPlayerShip(Ship ship){
		player = ship;
	}
	public void setEnemyShip(Ship ship){
		enemy = ship;
	}
	public void setPlayerKills(int n){
		kills = n;
	}
	public void incrementPlayerKills(){
		kills += 1;
	}
	public Ship getPlayerShip(){
		return player;
	}
	public Ship getEnemyShip(){
		return enemy;
	}
	public int getKills(){
		return kills;
	}
}
