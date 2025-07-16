//IceCreamRush- Sorting Flavours by popularity
//Story: At "IceCreamRush" a small local vendor sells 8 different ice cream flavours. At the end of each week, the shopkeeper wants to sort these flavours based on how many times each was sold. Since the list is short and he updates it manually ,he prefers a simple sorting method bubble sort- where he repeatedly compare adjacent sales figures and swap them if needed.
//Concept involved;
//⦁	Bubble Sort
//⦁	Small data size
//⦁	Repeated adjacent comparison
//⦁	use OOPS

public class icecreamrush {
    private String[] flavours;
    private int[] sales;

    public icecreamrush(String[] flavours, int[] sales) {
        this.flavours = flavours;
        this.sales = sales;
    }

    public void sortFlavours() {
        int n = sales.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (sales[j] < sales[j + 1]) {
                    int tempSales = sales[j];
                    sales[j] = sales[j + 1];
                    sales[j + 1] = tempSales;

                    String tempFlavour = flavours[j];
                    flavours[j] = flavours[j + 1];
                    flavours[j + 1] = tempFlavour;
                }
            }
        }
    }

    public void displaySortedFlavours() {
        for (int i = 0; i < flavours.length; i++) {
            System.out.println(flavours[i] + ": " + sales[i]);
        }
    }

    public static void main(String[] args) {
        String[] flavours = {"Vanilla", "Chocolate", "Strawberry", "Mint", "Cookie Dough", "Pistachio", "Mango", "Blueberry"};
        int[] sales = {50, 75, 30, 60, 90, 20, 80, 40};

        icecreamrush icecreamRush = new icecreamrush(flavours, sales);
        icecreamRush.sortFlavours();
        icecreamRush.displaySortedFlavours();
    }   

}
