package BJPExercises.Chapter9;

public class MinMaxAccount extends BankingAccount {

    private int min;
    private int max;
    public MinMaxAccount(Startup s) {
        super(s);
        min = s.startup_getBalance();
        max = s.startup_getBalance();

    }

    private void min_max(int value) {
        if (value > max) {
            max = value;
        }
        if (value < min) {
            min = value;
        }
    }

    @Override
    public void debit(Debit d) {
        super.debit(d);
        min_max(super.getBalance());
    }

    @Override
    public void credit (Credit c) {
        super.credit(c);
        min_max(super.getBalance());
    }

    public int getMin() {

        return min;
    }

    public int getMax() {


        return max;
    }

}
