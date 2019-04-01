package es.tearain.mate.model;

public class Player extends Character {
	
	public Player(int id, String name, int baseHp, int currentHp, int hpDice, int speed, 
				boolean flyable,  int strength, int dexerity, int constitution, 
				int intelligence, int wisdom, int charisma) {
	this.id = id;
	this.name = name;
	this.baseHp = baseHp;
	this.currentHp = currentHp;
	this.hpDice = hpDice;
	this.speed = speed;
	this.flyable = flyable;
	
	this.setStrength(strength);
	this.setDexerity(dexerity);
	this.setConstitution(constitution);
	this.setIntelligence(intelligence);
	this.setWisdom(wisdom);
	this.setCharisma(charisma);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Character other = (Character) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
