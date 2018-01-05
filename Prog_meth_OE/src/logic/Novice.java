package logic;

public class Novice {
	protected int hp;
	protected int attack;
	protected int defense;
	
	public Novice(int hp,int attack,int defense){
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
	}
	
	public boolean hasAlive(){
		if(hp <= 0) {return false;}
		return true;
	}
	
	public int getHp(){
		return this.hp;
	}
	
	public int getAttack(){
		return this.attack;
	}
	
	public int getDefense(){
		return this.defense;
	}
}
