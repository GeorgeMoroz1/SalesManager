public class SalesManager {
    protected long[] sales;
    protected long average = 0;
    protected long numbers = 0;

    public SalesManager(long[] sales) {
        this.sales = sales;
        if (sales.length > 0) {
            long sum = 0;
            for (int i = 0; i < sales.length; i++) {
                if (sales[i] != min() && sales[i] != max()) {
                    sum += sales[i];
                    numbers += 1;
                }
            }
            average = sum / numbers;
        }
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long min() {
        long min = sales[0];
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }
}
