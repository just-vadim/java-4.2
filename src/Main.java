public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightInMeters = 1.99;
        double weight = 100;
        double bmi = service.calculate(heightInMeters, weight);
        System.out.printf("%.1f", bmi);
    }
}