package Quizzes;

import java.text.DecimalFormat;

public class ClientDriver {
    public static void main(String[] args799) {
        Asset[] investments = new Asset[3];
        investments[0] = new Stock("MSFT", 10, 300, 27);
        investments[1] = new Cash(500);
        investments[2] = new IPhone(799, 5);

        for (int _i = 0; _i < investments.length; _i++) {
            System.out.println(investments[_i]);
            System.out.println("Market value is: " + new DecimalFormat("0.0#").format(investments[_i].getMarketValue())
                    + ", profit is: " + new DecimalFormat("0.0#").format(investments[_i].getProfit()));
            System.out.println();
        }
    }
}
