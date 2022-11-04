public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new int[]{9, 1, 0, 7});
        System.out.println("Максимальное число продаж: " + salesManager.max());
        System.out.println("Среднее значение равно "+ salesManager.average);
    }
}
