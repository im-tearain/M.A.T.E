package es.tearain.mate.service.combat;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.tearain.mate.model.combat.Weapon;
import es.tearain.mate.repository.combat.WeaponRepository;

@Service
public class WeaponServiceImpl implements WeaponService {

	private WeaponRepository weapons;
	
	@Autowired
	public WeaponServiceImpl(WeaponRepository weapons) {
		this.weapons = weapons;
	}

	public void addWeapon(Weapon weapon) {
		final int nextId = this.weapons.nextId();
		Weapon weaponToAdd = Weapon.builder().withId(nextId).withName(weapon.getName())
				.withBaseDamage(weapon.getBaseDamage()).withBonificator(weapon.getBonificator())
				.withDamageType(weapon.getDamageType()).withRange(weapon.getRange()).build();
		
		this.weapons.addWeapon(weaponToAdd);
	}
	
	public Weapon getWeaponById(int id) {
		return this.weapons.getWeaponById(id);
	}

	public void modifyWeaponById(Weapon weapon) {
		this.weapons.modifyWeaponById(weapon);
	}

	public void deleteWeaponById(int id) {
		this.weapons.deleteWeaponById(id);
	}

	public List<Weapon> getAllWeapons() {
		return this.weapons.getAllWeapons();
	}

	public int nextId() {
		return this.weapons.nextId();
	}

}
