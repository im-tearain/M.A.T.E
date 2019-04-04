package es.tearain.mate.controller.combat;

import es.tearain.mate.model.combat.Weapon;

public class WeaponRequestMapper {

	public static Weapon toWeapon(WeaponRequest weaponRequest) {
		Weapon weapon = Weapon.builder()
				.withId(0)
				.withName(weaponRequest.getName())
				.withBaseDamage(weaponRequest.getBaseDamage())
				.withBonificator(weaponRequest.getBonificator())
				.withDamageType(weaponRequest.getDamageType())
				.withRange(weaponRequest.getRange())
				.build();
		
		return weapon;
	}

}
