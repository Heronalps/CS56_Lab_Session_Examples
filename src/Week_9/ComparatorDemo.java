import java.util.Arrays;
import java.util.Comparator;

public class Fruit implements Comparator<Fruit>{

    private String fruitName;
    private String fruitDesc;
    private int quantity;

    public Fruit(String fruitName, String fruitDesc, int quantity) {
        super();
        this.fruitName = fruitName;
        this.fruitDesc = fruitDesc;
        this.quantity = quantity;
    }
    // Implement Comparator Interface

    public int compare(Fruit fruit1, Fruit fruit2) {

        int quantity1 = fruit1.getQuantity();
        int quantity2 = fruit2.getQuantity();

        return quantity1 - quantity2;

    }

    // Define a comparator in class

    public static Comparator<Fruit> FruitNameComparator
            = new Comparator<Fruit>() {

        public int compare(Fruit fruit1, Fruit fruit2) {

            int quantity1 = fruit1.getQuantity();
            int quantity2 = fruit2.getQuantity();

            return quantity1 - quantity2;

        }
    };

    public static void main(String[] args) {
        Arrays.sort(fruits);
        Arrays.sort(fruits, FruitNameComparator);
        Arrays.sort(fruits, new SortByQuantity());

        //Lambda Expression 

        Arrays.sort(fruits, new Comparator<Fruit>() {
            public int compare(Fruit fruit1, Fruit fruit2) {

                int quantity1 = fruit1.getQuantity();
                int quantity2 = fruit2.getQuantity();

                return quantity1 - quantity2;

            }
        });

    }
}

// Define a comparator outside the class

public class SortByQuantity implements Comparator<Fruit> {

    @Override
    public int compare(Fruit fruit1, Fruit fruit2) {

        int quantity1 = fruit1.getQuantity();
        int quantity2 = fruit2.getQuantity();

        return quantity1 - quantity2;

    }
}
