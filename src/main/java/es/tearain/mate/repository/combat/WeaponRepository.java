package es.tearain.mate.repository.combat;

import java.util.List;

import es.tearain.mate.model.combat.Weapon;

public interface WeaponRepository {

	void addWeapon(Weapon weapon);
	Weapon getWeaponById(int id);
	void modifyWeaponById(Weapon weapon);
	void deleteWeaponById(int id);
	List<Weapon> getAllWeapons();
	int nextId();

}
