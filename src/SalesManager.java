public class SalesManager {
    protected int[] sales;

    protected double average = 0;
    protected int numbers = 0;

    public SalesManager(int[] sales) {
        this.sales = sales;
        if (sales.length > 0) {
            double sum = 0;
            for (int i = 0; i < sales.length; i++) {
                if (sales[i] != min() && sales[i] != max()) {
                    sum += sales[i];
                    numbers += 1;
                }
            }
            average = sum / numbers;
        }
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int min() {
        int min = sales[0];
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }
}
