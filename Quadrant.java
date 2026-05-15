class DiscountCalculator {

    void calculateDiscount(double price) {
        double finalPrice = price - (price * 0.05);
        System.out.println("Final Price: " + finalPrice);
    }

    void calculateDiscount(double price, String customerType) {
        if (customerType.equals("Prime")) {
            price = price - (price * 0.10);
        } else {
            price = price - (price * 0.05);
        }
        System.out.println("Final Price: " + price);
    }

    void calculateDiscount(double price, String customerType, boolean festivalOffer) {

        if (customerType.equals("Prime")) {
            price = price - (price * 0.10);
        } else {
            price = price - (price * 0.05);
        }

        if (festivalOffer == true) {
            price = price - (price * 0.05);
        }

        System.out.println("Final Price: " + price);
    }

    public static void main(String[] args) {

        DiscountCalculator d = new DiscountCalculator();

        d.calculateDiscount(1000);
        d.calculateDiscount(1000, "Prime");
        d.calculateDiscount(1000, "Prime", true);
    }
}