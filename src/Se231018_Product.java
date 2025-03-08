public class Se231018_Product {
    private String code;
    private String description;
    private double price;

    // Parameterized Constructor
    public Se231018_Product(String code, String description, double price) {
        this.code = code;
        this.description = description;
        this.price = price;
    }

    // Setter and Getter methods for code
    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    // Setter and Getter methods for description
    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    // Setter and Getter methods for price
    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    // Method to calculate discount price (giving 10% discount as mentioned in the sample output)
    public double getDiscountPrice() {
        return price * 0.9; // 10% discount
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating two products
        Se231018_Product product1 = new Se231018_Product("501", "Double Wall Glass Coffee Mugs", 2900.0);
        Se231018_Product product2 = new Se231018_Product("502", "Double Wall Glass jug", 4000.0);
        Se231018_Product product3 = new Se231018_Product("503", "Double Wall clear Glass plate", 3000.0);

        // Displaying product details
        System.out.println("Product 1:");
        System.out.println("Code: " + product1.getCode());
        System.out.println("Description: " + product1.getDescription());
        System.out.println("Price: $" + product1.getPrice());
        System.out.println("Discount Price: $" + product1.getDiscountPrice());

        System.out.println();

        System.out.println("Product 2:");
        System.out.println("Code: " + product2.getCode());
        System.out.println("Description: " + product2.getDescription());
        System.out.println("Price: $" + product2.getPrice());
        System.out.println("Discount Price: $" + product2.getDiscountPrice());

        System.out.println();

        System.out.println("Product 3:");
        System.out.println("Code: " + product3.getCode());
        System.out.println("Description: " + product3.getDescription());
        System.out.println("Price: $" + product3.getPrice());
        System.out.println("Discount Price: $" + product3.getDiscountPrice());
    }
}

