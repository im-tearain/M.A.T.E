package es.tearain.mate.model;

import es.tearain.mate.model.combat.State;

public class Skill {

	private final int id;
	private final String name;
	private final State buff;
	private final int range;
	
	public Skill(int id, String name, State buff, int range) {
		this.id = id;
		this.name = name;
		this.buff = buff;
		this.range = range;
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
		if (id != other.id)
			return false;
		return true;
	}
	
}
