package es.tearain.mate.controller.combat;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import es.tearain.mate.model.combat.Weapon;
import es.tearain.mate.service.combat.WeaponService;

@RestController
public class WeaponController {

	private WeaponService weaponService;

	@Autowired
	public WeaponController(WeaponService weaponService) {
		this.weaponService = weaponService;
	}
	
	@PostMapping("/weapons")
	public void addWeapon(WeaponRequest weaponRequest) {
		final Weapon weaponToAdd = WeaponRequestMapper.toWeapon(weaponRequest);	//use mapper(need to implement) or param Stat and DamageType
		this.weaponService.addWeapon(weaponToAdd);
	}
	
	//@GetMapping("/weapons")
	
	//@GetMapping("/weapons/{id}")
		
	//@PutMapping("/weapons/{id}")
	
	//@DeleteMapping("/weapons/{id}")
	
	
}
