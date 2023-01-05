package Chapter9a;

// Jon Formantes
// CS 211
// Winter 2023 - 1/4/2023
// Discount bill class contains 3 methods of get discount items, discount amount, and percent of discount from total price. Overrides get total and add method.
public class DiscountBill extends GroceryBill {


    // fields for discount bill - includes no. of items discounted, amount of discount as well as boolean for preferred customer or not
    private int discountedItems;
    private double totalDiscount;
    private boolean preferred;


    // constructors of zero, 1 and two param.
    public DiscountBill() {
        this(new Employee(""), false);
    }

    public DiscountBill(boolean preferred) {
        super(new Employee(""));
        this.preferred = preferred;
    }

    public DiscountBill(Employee clerk, boolean preferred) {
        super(clerk);
        this.preferred = preferred;
    }

    // method to get # of discounted items.
    public int getDiscountCount() {
        return discountedItems;
    }

    // method for returning amount of the disount
    public double getDiscountAmount() {
        return totalDiscount;
    }

    // method to get the percent discount out of the total.
    public double getDiscountPercent() {
        return (getDiscountAmount()/super.getTotal()) * 100;
    }

    // override add method to get discounted items and total discount amount;
    @Override
    public void add(Item i) {
        super.add(i);
        if (preferred && i.getDiscount() > 0) {
            discountedItems++;
            totalDiscount += i.getDiscount();
        }
    }

    // returns discount amount based on preferred or not.
    @Override
    public double getTotal() {
        return super.getTotal() - totalDiscount;
    }
}
