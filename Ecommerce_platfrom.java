/*  • Product catalog: Displays products with descriptions, images, and prices.
    • Shopping cart: Allows users to add items for purchase.
    • Checkout system: Processes customer payments.
    • Order management: Tracks orders and shipments.
    • User accounts: Manages customer information.
 */
 import java.util.*;
class Ecommerce_platfrom {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> productList = new ArrayList<>();
        ShoppingCart cart = new ShoppingCart();

        // Sample Products (you can expand the list)
        productList.add(new Product(1, "Laptop", 900.00));
        productList.add(new Product(2, "Smartphone", 500.00));
        productList.add(new Product(3, "Headphones", 50.00));
        productList.add(new Product(4, "Keyboard", 30.00));
        productList.add(new Product(5, "Mouse", 20.00));

        System.out.println("Welcome to the E-Commerce Platform!");

        boolean shopping = true;
        while (shopping) {
            System.out.println("\nProduct List:");
            for (Product product : productList) {
                System.out.println(product);
            }

            System.out.print("\nEnter the Product ID to add it to your cart (or 0 to view the cart and checkout): ");
            int productId = scanner.nextInt();

            if (productId == 0) {
                cart.viewCart();
                System.out.println("do you want to checkout?(yes/no)");
                String checkout = scanner.next();

                if (checkout.equalsIgnoreCase("yes")) {
                    double total = cart.cartPrice();
                    System.out.printf("Your total is: $%.2f%n", total);
                    System.out.print("Confirm purchase? (yes/no): ");
                    String confirm = scanner.next();

                    if (confirm.equalsIgnoreCase("yes")) {
                        System.out.println("Purchase confirmed. Thank you for shopping!");
                        shopping = false;  // Exit the shopping loop
                    } else {
                        System.out.println("Returning to the product list.");
                    }
                }
            }else{
                Product select=find(productList,productId);
                if(select!=null){
                    cart.addItem(select);
                }else
                    System.out.println("Invalid product id.Please try again...");
            }
        }
        scanner.close();
    }
    private static Product find(List<Product> productList, int id) {
        for (Product product : productList) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null; // If product not found
    }
}
