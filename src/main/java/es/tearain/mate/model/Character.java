package es.tearain.mate.model;

public abstract class Character extends Stat {
	
	protected String name;
	protected int level;
	protected int baseHp;
	protected int currentHp;
	protected int hpDice;
	protected int speed;
	protected boolean flyable;
	
	protected int getId() {
		return id;
	}
	
	protected void setId(int id) {
		this.id = id;
	}
	
	protected int getLevel() {
		return level;
	}
	
	protected void setLevel(int level) {
		this.level = level;
	}
	
	protected int getBaseHp() {
		return baseHp;
	}
	
	protected void setBaseHp(int baseHp) {
		this.baseHp = baseHp;
	}
	
	protected int getCurrentHp() {
		return currentHp;
	}
	
	protected void setCurrentHp(int currentHp) {
		this.currentHp = currentHp;
	}
	
	protected int getHpDice() {
		return hpDice;
	}
	
	protected void setHpDice(int hpDice) {
		this.hpDice = hpDice;
	}
	
	protected String getName() {
		return name;
	}
	
	protected void setName(String name) {
		this.name = name;
	}
	
	protected int getSpeed() {
		return speed;
	}
	
	protected void setSpeed(int speed) {
		this.speed = speed;
	}
	
	protected boolean isFlyable() {
		return flyable;
	}
	
	protected void setFlyable(boolean flyable) {
		this.flyable = flyable;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + this.id;
		return result;
	}
	
}
