package Quizzes;// Jon Formantes
// CS 211
// Winter 2023 - 1/10/2023
// IPhone class that implements asset class, cotains two methods of market value and get profit

public class IPhone implements Asset {

    // initialized fields
    public static final double annualDepreciation = 0.2;
    private double originalCost;
    private int currentAge;

    // constructor chaining 0 - parameter
    public IPhone() {
        this(0, 0);
    }

    // constructor for two parameters (initial cost, and age)
    public IPhone(double originalCost, int currentAge) {
        this.originalCost = originalCost;
        this.currentAge = currentAge;
    }

    // method that returns the current value of the asset
    @Override
    public double getMarketValue() {
        return originalCost * Math.pow((1-annualDepreciation), currentAge);
    }

    //method that returns the current value minus the cost it was purchased at
    @Override
    public double getProfit() {
        return getMarketValue() - originalCost;
    }

    // tostring method to print class
    public String toString() {
        return "IPhone ( " + currentAge + " years old ) ";
    }
}
