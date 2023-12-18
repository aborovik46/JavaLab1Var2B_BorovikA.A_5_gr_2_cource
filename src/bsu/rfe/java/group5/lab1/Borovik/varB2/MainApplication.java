package bsu.rfe.java.group5.lab1.Borovik.varB2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;

public class MainApplication {
	public static void main(String[] args)  throws Exception {
		Food[] breakfast = new Food[20];
		int itemsSoFar = 0;
		int a = 0;
		int p = 0;
		int ch = 0;
		int j = 0;
		Boolean bCalories = false;
        Boolean bSort = false;
        for (String arg: args) {
            if (Objects.equals(arg, "-calories")){
                bCalories = true;
                continue;
            }
            if (Objects.equals(arg, "-sort")) {
                bSort = true;
                continue;
            }
		
			
			String[] parts = arg.split("/");
			if (parts[0].equals("Cheese")) {
				breakfast[itemsSoFar] = new Cheese();
				ch++;
				} else
					if (parts[0].equals("Apple")) {
						breakfast[itemsSoFar] = new Apple(parts[1]);
						a++;
						} 
						else
							if (parts[0].equals("Pie")) {
								breakfast[itemsSoFar] = new Pie(parts[1]);
								p++;
								} 
							else
								if (parts[0].equals("Juice")) {
									breakfast[itemsSoFar] = new Juice(parts[1]);
									j++;
									} 
						itemsSoFar++;
			}
		Arrays.sort(breakfast, new FoodComparator());
		Integer calories = 0;
		for (int i=0; i<breakfast.length; i++) {
			 if (breakfast[i]!=null) {
			 breakfast[i].consume();
			 if (bCalories) {calories += breakfast[i].calculateCalories();}
				
			 }
			 else
				 break;
			 }
		
		if (bCalories) System.out.println(calories + " калорий");
		if (bSort) { // сортировка по калорийности
            Arrays.sort(breakfast, new Comparator<Food>() {
                @Override
                public int compare(Food o1, Food o2) {
                    if (o1 == null) return 1;
                    if (o2 == null) return -1;
                    return ((Food) o1).calculateCalories() - ((Food) o2).calculateCalories();
                }
            });
            for (Food item : breakfast) {
                if(item == null) break;
                System.out.println(item);
            }
            System.out.println("Хотите вывести количество конкретного продуктва?(1-Да,2-Нет)");
            Scanner in = new Scanner(System.in);
            int ans = in.nextInt();
            switch (ans) {
            case 1:
            	System.out.println("Какой продукт хотите посчитать ?(1-Яблоки,2-Сыры,3-Пироги,4-)");
            	Scanner inn = new Scanner(System.in);
            	int anss = inn.nextInt();
            	switch(anss) {
            	case 1:
            		System.out.println(a);
            	break;
            	case 2:
            		System.out.println(ch);
            	break;
            	case 3:
            		System.out.println(p);
            	break;
            	case 4:
            		System.out.println(j);
            	break;
            	default:
            		System.out.println("Error");
            	break;
            	}
            break;
            case 2:
            break;
            default:
            	System.out.println("Error");
            break;
            	}
            }
		System.out.println("Всего хорошего!");
		}
		}
        
	
        
