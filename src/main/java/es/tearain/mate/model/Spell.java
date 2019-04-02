package es.tearain.mate.model;

import es.tearain.mate.model.combat.State;

public class Spell {

	private final int id;
	private final String name;
	private final State buff;
	private final int range;
	private final int area;
	private final int level;
	
	public Spell(int id, String name, State buff, int range, int area, int level) {
		this.id = id;
		this.name = name;
		this.buff = buff;
		this.range = range;
		this.area = area;
		this.level = level;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public State getBuff() {
		return buff;
	}

	public int getRange() {
		return range;
	}
	
	public int getArea() {
		return area;
	}	

	public int getLevel() {
		return level;
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
		Skill other = (Skill) obj;
		if (id != other.getId())
			return false;
		return true;
	}
	
}
