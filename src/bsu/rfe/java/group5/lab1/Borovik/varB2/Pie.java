package bsu.rfe.java.group5.lab1.Borovik.varB2;

import java.util.Objects;

public class Pie extends Food {

	private String filling;
	public Pie(String filling) {
		super("Pie");
		this.filling=filling;
	}
	public void consume() {
		System.out.println(this + " съедено");
		}
	public String getFilling() {
		return filling;
	}
	public void setFilling(String filling) {
		this.filling = filling;
	}

	public boolean equals(Object arg0) {
		if (super.equals(arg0)) {
			if (!(arg0 instanceof Pie)) return false;
			return filling.equals(((Pie)arg0).filling);
			} else
			return false;
	}@Override
	public String toString() {
		return super.toString() + " c начинкой'" + filling.toUpperCase() + "'";
	}

	public Integer calculateCalories() {
        Integer calories = 30;
        if (Objects.equals(filling, "Apple")) calories+= 2;
        if (Objects.equals(filling, "Cherry")) calories+= 6;
        if (Objects.equals(filling, "Strawberry")) calories+= 7;
        return calories;
    }
	

}
