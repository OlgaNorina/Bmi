public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int bmiNormal = service.calculate(6000, 164);
        System.out.println("Bmi = " + bmiNormal + ": " + service.getStringOfBmi(bmiNormal));

        int bmiH = service.calculate(9000, 170);
        System.out.println("Bmi = " + bmiH + ": " + service.getStringOfBmi(bmiH));

        int bmiDef = service.calculate(3900, 160);
        System.out.println("Bmi = " + bmiDef + ": " + service.getStringOfBmi(bmiDef));
    }
}
