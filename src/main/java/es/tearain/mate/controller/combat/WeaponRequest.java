package es.tearain.mate.controller.combat;

import es.tearain.mate.model.Stat;
import es.tearain.mate.model.combat.DamageType;

public class WeaponRequest {
	
	private String name;
	private int baseDamage;
	private Stat bonificator;
	private DamageType damageType;
	private int range;
	
	public WeaponRequest(String name, int baseDamage, Stat bonificator, DamageType damageType, int range) {
		super();
		this.name = name;
		this.baseDamage = baseDamage;
		this.bonificator = bonificator;
		this.damageType = damageType;
		this.range = range;
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
	
}
