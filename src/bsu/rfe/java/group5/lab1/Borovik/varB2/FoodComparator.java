package bsu.rfe.java.group5.lab1.Borovik.varB2;
import java.util.Comparator;
public class FoodComparator implements Comparator<Food> {

	public int compare(Food arg0, Food arg1) {
		 if (arg0==null) return 1;
		 if (arg1==null) return -1;
		 return arg0.getName().compareTo(arg1.getName());
		 }
		}

