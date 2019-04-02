package es.tearain.mate.model;

import java.util.List;

import es.tearain.mate.model.combat.Weapon;

public class Monster extends Character {
	
	private final int toHit;
	
	
	
	public Monster(int id, String name, int baseHp, int currentHp, int hpDice, int speed, boolean flyable, int strength,
			int dexerity, int constitution, int intelligence, int wisdom, int charisma, List<Weapon> weapons,
			List<Spell> spells, int toHit) {
		super(id, name, baseHp, currentHp, hpDice, speed, flyable, strength, dexerity, constitution, intelligence,
				wisdom, charisma, weapons, spells);
		this.toHit = toHit;
	}

	public int getToHit() {
		return toHit;
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
