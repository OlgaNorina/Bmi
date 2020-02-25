public class BmiService {
    public int bmi;
    public int calculate(int weight, int height) {
        int bmi = weight * 100 / (height * height);
        return bmi;
    }
        public String getStringOfBmi(int bmi) {
            String toReturn = null;
            if (bmi <0) {
                toReturn = "Fail";
            } else if (bmi <= 18) {
                toReturn = "Недостаточный вес";
            } else if (bmi <= 24) {
                toReturn = "Нормальный вес";
            } else if (bmi <= 29) {
                toReturn = "Избыточный вес";
            } else if (bmi >= 30) {
                toReturn = "Ожирение I степени";
            } else if (bmi >= 35) {
                toReturn = "Ожирение II степени";
            } else {
                toReturn = "Ожирение III степени";
            }
            return toReturn;
        }
}
