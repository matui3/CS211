package Chapter9;
public class DiscountBill extends GroceryBill {

    private int discountedItems;
    private double totalDiscount;
    private boolean preferred;

    public DiscountBill(Employee clerk) {
        super(clerk);
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
        double total = super.getTotal();
        if (preferred) {
            total = super.getTotal() - totalDiscount;
        }
        return total;
    }
}
