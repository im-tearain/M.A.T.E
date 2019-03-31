package es.tearain.mate.model.combat;

public class SkillAttack extends Attack {
	
	private final State state;
	
	public SkillAttack(int id, String attackName, int baseDamage, DamageType damageType, int range, State state) {
		this.id = id;
		this.attackName = attackName;
		this.baseDamage = baseDamage;
		this.damageType = damageType;
		this.range = range;
		this.state = state;
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
