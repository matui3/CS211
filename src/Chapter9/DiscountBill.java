package Chapter9;

public class DiscountBill extends GroceryBill {

    private boolean preferred;

    public DiscountBill(Employee clerk) {
        super(clerk);
    }

    public DiscountBill(Employee clerk, boolean preferred) {
        super(clerk);
        this.preferred = preferred;

    }

    public int getDiscountCount() {
        if (preferred) {

        }
    }

    public double getDiscountAmount() {

    }

    public double getDiscountPercent() {

    }
}
