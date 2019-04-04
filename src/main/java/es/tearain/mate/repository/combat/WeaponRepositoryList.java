package es.tearain.mate.repository.combat;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import es.tearain.mate.DuplicatedDataException;
import es.tearain.mate.model.combat.Weapon;
import es.tearain.mate.repository.NotFoundDataException;

@Repository
public class WeaponRepositoryList implements WeaponRepository {

	private List<Weapon> weapons;
	
	@Autowired
	public WeaponRepositoryList(List<Weapon> weapons) {
		this.weapons = weapons;
	}

	public void addWeapon(Weapon weapon) {
		if (weapons.contains(weapon)) {
			throw new DuplicatedDataException("This weapon already exists here");
		}
		
		this.weapons.add(weapon);
	}
	
	public Weapon getWeaponById(int id) {
		final Weapon weaponToGet = new Weapon(id, null, 0, null, null, 0);
		if (!weapons.contains(weaponToGet)) {
			throw new NotFoundDataException("Weapon with ID {"+id+"} "+"not found");
		}
			
		final int index = weapons.indexOf(weaponToGet);
		return weapons.get(index);
	}

	public void modifyWeaponById(Weapon weapon) {
		if (!weapons.contains(weapon)) {
			throw new NotFoundDataException("Weapon with ID {"+weapon.getId()+"} "+"not found");
		}
		
		this.weapons.set(weapons.indexOf(weapon), weapon);
	}

	public void deleteWeaponById(int id) {
		final Weapon weaponToDelete = new Weapon(id, null, 0, null, null, 0);
		if (!weapons.contains(weaponToDelete)) {
			throw new NotFoundDataException("Weapon with ID {"+id+"} "+"not found");
		}
		
		final int index = weapons.indexOf(weaponToDelete);
		this.weapons.remove(index);
	}

	public List<Weapon> getAllWeapons() {
		return this.weapons;
	}

	public int nextId() {
		final int lastIndex = this.weapons.size()-1;
		if (lastIndex <= 0) {
			return 1;
		}
		
		final int lastId = this.weapons.get(lastIndex).getId();
		return lastId+1;
	}
	
}
