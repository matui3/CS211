package Chapter9a;

// Jon Formantes
// CS 211
// Winter 2023 - 1/4/2023
// Discount bill class contains 3 methods of get discount items, discount amount, and percent of discount from total price. Overrides get total and add method.
public class DiscountBill extends GroceryBill {

    private int discountedItems;
    private double totalDiscount;
    private boolean preferred;

    public DiscountBill() {
        this(new Employee("no name provided"), false);
    }

    public DiscountBill(boolean preferred) {
        super(new Employee("no name provided"));
        this.preferred = preferred;
    }

    public DiscountBill(Employee clerk, boolean preferred) {
        super(clerk);
        this.preferred = preferred;
    }

    public int getDiscountCount() {
        return discountedItems;
    }

    public double getDiscountAmount() {
        return totalDiscount;
    }

    public double getDiscountPercent() {
        return (getDiscountAmount()/super.getTotal()) * 100;
    }

    @Override
    public void add(Item i) {
        super.add(i);
        if (preferred && i.getDiscount() > 0) {
            discountedItems++;
            totalDiscount += i.getDiscount();
        }
    }

    @Override
    public double getTotal() {
        if (preferred) {
            return super.getTotal() - totalDiscount;
        }
        return super.getTotal();
    }
}
