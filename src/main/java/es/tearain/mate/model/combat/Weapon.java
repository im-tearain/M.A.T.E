package es.tearain.mate.model.combat;

import es.tearain.mate.model.Stat;
import javax.annotation.Generated;

public class Weapon {
	private int id;
	private String name;
	private int baseDamage;
	private Stat bonificator;
	private DamageType damageType;
	private int range;

	@Generated("SparkTools")
	public Weapon(Builder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.baseDamage = builder.baseDamage;
		this.bonificator = builder.bonificator;
		this.damageType = builder.damageType;
		this.range = builder.range;
	}
	
	public Weapon(int id, String name, int baseDamage, Stat bonificator, DamageType damageType, int range) {
		super();
		this.id = id;
		this.name = name;
		this.baseDamage = baseDamage;
		this.bonificator = bonificator;
		this.damageType = damageType;
		this.range = range;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getBaseDamage() {
		return baseDamage;
	}
	
	public void setBaseDamage(int baseDamage) {
		this.baseDamage = baseDamage;
	}
	
	public Stat getBonificator() {
		return bonificator;
	}
	
	public void setBonificator(Stat bonificator) {
		this.bonificator = bonificator;
	}
	
	public DamageType getDamageType() {
		return damageType;
	}
	
	public void setDamageType(DamageType damageType) {
		this.damageType = damageType;
	}
	
	public int getRange() {
		return range;
	}
	
	public void setRange(int range) {
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

	/**
	 * Creates builder to build {@link Weapon}.
	 * @return created builder
	 */
	@Generated("SparkTools")
	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder to build {@link Weapon}.
	 */
	@Generated("SparkTools")
	public static final class Builder {
		private int id;
		private String name;
		private int baseDamage;
		private Stat bonificator;
		private DamageType damageType;
		private int range;

		private Builder() {
		}

		public Builder withId(int id) {
			this.id = id;
			return this;
		}

		public Builder withName(String name) {
			this.name = name;
			return this;
		}

		public Builder withBaseDamage(int baseDamage) {
			this.baseDamage = baseDamage;
			return this;
		}

		public Builder withBonificator(Stat bonificator) {
			this.bonificator = bonificator;
			return this;
		}

		public Builder withDamageType(DamageType damageType) {
			this.damageType = damageType;
			return this;
		}

		public Builder withRange(int range) {
			this.range = range;
			return this;
		}

		public Weapon build() {
			return new Weapon(this);
		}
	}
	
}
