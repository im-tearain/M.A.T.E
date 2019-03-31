package es.tearain.mate.model.combat;

import es.tearain.mate.model.Stat;

public class Weapon {
	protected int id;
	protected String name;
	protected int baseDamage;
	protected Stat bonificator;
	protected DamageType damageType;
	protected int range;
	
	public Weapon(int id, String name, int baseDamage, Stat bonificator, DamageType damageType, int range) {
		super();
		this.id = id;
		this.name = name;
		this.baseDamage = baseDamage;
		this.bonificator = bonificator;
		this.damageType = damageType;
		this.range = range;
	}

	protected int getId() {
		return id;
	}
	
	protected void setId(int id) {
		this.id = id;
	}
	
	protected String getName() {
		return name;
	}
	
	protected void setName(String name) {
		this.name = name;
	}
	
	protected int getBaseDamage() {
		return baseDamage;
	}
	
	protected void setBaseDamage(int baseDamage) {
		this.baseDamage = baseDamage;
	}
	
	protected Stat getBonificator() {
		return bonificator;
	}
	
	protected void setBonificator(Stat bonificator) {
		this.bonificator = bonificator;
	}
	
	protected DamageType getDamageType() {
		return damageType;
	}
	
	protected void setDamageType(DamageType damageType) {
		this.damageType = damageType;
	}
	
	protected int getRange() {
		return range;
	}
	
	protected void setRange(int range) {
		this.range = range;
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
		Weapon other = (Weapon) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
