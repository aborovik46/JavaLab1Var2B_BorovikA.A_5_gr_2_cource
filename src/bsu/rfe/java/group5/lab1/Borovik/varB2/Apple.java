package bsu.rfe.java.group5.lab1.Borovik.varB2;

import java.util.Objects;

public class Apple extends Food {

	private String size;
	public Apple(String size) {
		super("Apple");
		this.size=size;
	}
	public void consume() {
		System.out.println(this + " съедено");
		}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}

	public boolean equals(Object arg0) {
		if (super.equals(arg0)) {
			if (!(arg0 instanceof Apple)) return false;
			return size.equals(((Apple)arg0).size);
			} else
			return false;
	}@Override
	public String toString() {
		return super.toString() + " размера '" + size.toUpperCase() + "'";
	}
	public Integer calculateCalories() {
        Integer calories = 17;
        if (Objects.equals(size, "Small")) calories+= 2;
        if (Objects.equals(size, "Big")) calories+= 6;
        return calories;
    }
	
	
	

}
