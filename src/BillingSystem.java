import java.util.Scanner;

public class BillingSystem {
    public static void main(String[] args) {
        System.out.println("WELCOME...!");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your address: ");
        String address = scanner.nextLine();

        System.out.print("Enter total items: ");
        int totalItems = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left in the buffer

        // Create an array to store item objects
        Item[] items = new Item[totalItems];

        // Insert items
        for (int i = 0; i < totalItems; i++) {
            int itemId = i + 1;
            System.out.print("Enter item name for item " + itemId + ": ");
            String itemName = scanner.nextLine();

            System.out.print("Enter price for item " + itemId + ": ");
            int itemPrice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character left in the buffer

            items[i] = new Item(itemId, itemName, itemPrice);
        }

        // Call the display function
        displayBill(items, name, address);
    }

    public static void displayBill(Item[] items, String customerName, String customerAddress) {
        int total = 0;
        System.out.println("\n\n\n\n================================================");
        System.out.println("\t\t SAI STORE");
        System.out.println("================================================");
        System.out.println("\nName: " + customerName + "\t\tAddress: " + customerAddress + "\n");

        for (Item item : items) {
            System.out.println("Id: " + item.id + "\tName: " + item.itemName + "\tPrice: " + item.price);
            System.out.println("------------------------------------------------");
            total += item.price;
        }

        System.out.println("\t\t\tTotal: " + total);
        System.out.println("------------------------------------------------");
        System.out.println("\n================================================");
        System.out.println("\t\t !..VISIT AGAIN..!");
        System.out.println("================================================");
        System.out.println("\n\n");
    }
}