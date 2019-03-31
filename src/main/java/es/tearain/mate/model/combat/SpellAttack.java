package es.tearain.mate.model.combat;

public class SpellAttack extends Attack {
	
	private final int area;
	private final State state;
	
	public SpellAttack(int id, String attackName, int baseDamage, DamageType damageType, int range, int area, State state) {
		this.id = id;
		this.attackName = attackName;
		this.baseDamage = baseDamage;
		this.damageType = damageType;
		this.range = range;
		this.area = area;
		this.state = state;
	}

	public int getArea() {
		return this.area;
	}
	
	public State getState() {
		return this.state;
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
