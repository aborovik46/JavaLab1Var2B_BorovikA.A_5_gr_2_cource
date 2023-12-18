package bsu.rfe.java.group5.lab1.Borovik.varB2;

import java.util.Objects;

	public class Juice extends Food {

		private String compound;
		public Juice(String compound) {
			super("Juice");
			this.compound=compound;
		}
		public void consume() {
			System.out.println(this + " выпито");
			}
		public String getCompound() {
			return compound;
		}
		public void setCompound(String compound) {
			this.compound = compound;
		}

		public boolean equals(Object arg0) {
			if (super.equals(arg0)) {
				if (!(arg0 instanceof Juice)) return false;
				return compound.equals(((Juice)arg0).compound);
				} else
				return false;
		}@Override
		public String toString() {
			return super.toString() + " из'" + compound.toUpperCase() + "'";
		}

		public Integer calculateCalories() {
	        Integer calories = 15;
	        if (Objects.equals(compound, "Apple")) calories+= 2;
	        if (Objects.equals(compound, "Cherry")) calories+= 6;
	        if (Objects.equals(compound, "Strawberry")) calories+= 7;
	        return calories;
	    }
	}
	
