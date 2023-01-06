package BJPExercises.Chapter9;

public class FilteredAccount extends Account {

    private double zeroTransac;
    private double totalTransac;

    public FilteredAccount(Client c) {
        super(c);
    }

    @Override
    public boolean process(Transaction t) {
        if (t.value() == 0) {
            totalTransac++;
            zeroTransac++;
            return true;
        } else {
            totalTransac++;
            return super.process(t);
        }

    }

    public double percentFiltered() {
        if (totalTransac == 0) {
            return 0;
        }
        return zeroTransac/totalTransac * 100;
    }


}
