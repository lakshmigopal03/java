class Product {
    int pcode;
    String pname;
    double price;

    public Product(int pcode, String pname, double price) {
        this.pcode = pcode;
        this.pname = pname;
        this.price = price;
    }

    public void display() {
        System.out.println("Code: " + pcode + ", Name: " + pname + ", Price: " + price);
    }

    public static Product findLowestPrice(Product p1, Product p2, Product p3) {
        Product cheapest = p1;
        if (p2.price < cheapest.price) {
            cheapest = p2;
        }
        if (p3.price < cheapest.price) {
            cheapest = p3;
        }
        return cheapest;
    }

    public static void main(String[] args) {
        Product p1 = new Product(101, "Laptop", 500000);
        Product p2 = new Product(102, "TV", 300000);
        Product p3 = new Product(103, "Phone", 600000);

        Product cheapestProduct = findLowestPrice(p1, p2, p3);

        System.out.println("Product with the lowest price:");
        cheapestProduct.display();
    }
}

