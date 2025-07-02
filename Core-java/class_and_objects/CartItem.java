import java.util.ArrayList;
public class CartItem {
    String itemName;
    double price;
    int quantity;
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    public double getTotalCost() {
        return price * quantity;
    }
    public static void main(String[] args) {
        ArrayList<CartItem> cart = new ArrayList<>();
        cart.add(new CartItem("Book", 200, 2));
        cart.add(new CartItem("Pen", 10, 5));
        double total = 0;
        for (CartItem item : cart) {
            total += item.getTotalCost();
        }
        System.out.println("Total Cost: " + total);
    }
} 