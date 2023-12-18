package bsu.rfe.java.group5.lab1.Borovik.varB2;

public class Cheese extends Food {

	public Cheese() {
		super("Cheese");
		
	}

	@Override
	public void consume() {
		
		System.out.println(this + " съеден");
	}
	 public Integer calculateCalories() {
	        return 23;
	  }

}
