public class Item {
    int itemCode;
    String itemName;
    double price;
    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }
    public void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }
    public double totalCost(int quantity) {
        return price * quantity;
    }
    public static void main(String[] args) {
        Item item = new Item(1, "Pen", 10);
        item.displayDetails();
        System.out.println("Total Cost for 5: " + item.totalCost(5));
    }
} 