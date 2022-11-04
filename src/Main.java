public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new long[]{9, 5, 0, 7, 122, 150});
        System.out.println("Максимальное число продаж: " + salesManager.max());
        System.out.println("Среднее значение равно " + salesManager.average);
    }
}
