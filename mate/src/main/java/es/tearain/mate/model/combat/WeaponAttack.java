package es.tearain.mate.model.combat;

public class WeaponAttack extends Attack{

	private final Weapon weapon;

	public WeaponAttack(int id, String attackName, int baseDamage, DamageType damageType, int range, Weapon weapon) {
		this.id = id;
		this.attackName = attackName;
		this.baseDamage = baseDamage;
		this.damageType = damageType;
		this.range = range;
		this.weapon = weapon;
	}

	public Weapon getWeapon() {
		return this.weapon;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + this.id;
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
		Attack other = (Attack) obj;
		if (this.id != other.id)
			return false;
		return true;
	}
	
}
