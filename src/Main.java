public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new long[]{9, 0, 7});
        System.out.println("Максимальное число продаж: " + salesManager.max());
    }
}
