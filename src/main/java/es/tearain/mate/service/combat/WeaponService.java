package es.tearain.mate.service.combat;

import java.util.List;

import es.tearain.mate.model.combat.Weapon;

public interface WeaponService {

	void addWeapon(Weapon weapon);
	Weapon getWeaponById(int id);
	void modifyWeaponById(Weapon weapon);
	void deleteWeaponById(int id);
	List<Weapon> getAllWeapons();
	int nextId();
	
}
