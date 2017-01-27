import java.util.*;
public class SortArray  {

	public static void main(String args[]){
	   String[] foodArray = {"Pizza" , "Burrito", "Cracker and Cheese", "Bagel"}; 

	   List<String> foodList = new ArrayList<String>();
	   foodList.add("Pizza");
	   foodList.add("Burrito");
	   foodList.add("Cracker and Cheese");
	   foodList.add("Bagel");

	   System.out.println("FoodArray Before Sorting:");

	   for(String food: foodArray){
			System.out.println(food);
		}
		System.out.println("");

	   System.out.println("FoodList Before Sorting:");

	   for(String food: foodList){
			System.out.println(food);
		}
		System.out.println("");
		

	   Arrays.sort(foodArray);
	   Collections.sort(foodList);

		System.out.println("FoodArray After Sorting:");
	   for(String food: foodArray){
			System.out.println(food);
		}
		System.out.println("");

	   System.out.println("FoodList After Sorting:");
	   for(String food: foodList){
			System.out.println(food);
		}
		System.out.println("");
	}
}