public class BmiService {
    public double calculate(int weight, double height) {
        double bmi = weight / (height * height); // считаем индекс массы тела
        return bmi; // возвращаем индекс массы тела
    }
}
