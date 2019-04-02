package es.tearain.mate.model;

import java.util.List;

import es.tearain.mate.model.combat.Weapon;

public class Character extends Stat {
	
	protected String name;
	protected int level;
	protected int baseHp;
	protected int currentHp;
	protected int hpDice;
	protected int speed;
	protected boolean flyable;
	protected List<Weapon> weapons;
	protected List<Spell> spells;
	
	public Character(int id, String name, int baseHp, int currentHp, int hpDice, int speed, 
			boolean flyable,  int strength, int dexerity, int constitution, 
			int intelligence, int wisdom, int charisma, List<Weapon> weapons, 
			List<Spell> spells) {
		this.id = id;
		this.name = name;
		this.baseHp = baseHp;
		this.currentHp = currentHp;
		this.hpDice = hpDice;
		this.speed = speed;
		this.flyable = flyable;
		this.weapons = weapons;
		this.spells = spells;
		
		this.setStrength(strength);
		this.setDexerity(dexerity);
		this.setConstitution(constitution);
		this.setIntelligence(intelligence);
		this.setWisdom(wisdom);
		this.setCharisma(charisma);
	}
	
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
	
	protected List<Weapon> getWeapons() {
		return weapons;
	}
	
	protected void setWeapons(List<Weapon> weapons) {
		this.weapons = weapons;
	}
	
	protected List<Spell> getSpells() {
		return spells;
	}
	
	protected void setSpells(List<Spell> spells) {
		this.spells = spells;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + this.id;
		return result;
	}
	
}
