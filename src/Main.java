public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 90; //вес кг
        double height = 1.75; //рост в м
        double bmi = service.calculate(weight, height); // считаем индекс массы тела
        String bmiResult = String.format("%.2f", bmi); // округляем
        System.out.println("Ваш вес: " + weight + " кг.");
        System.out.println("Ваш рост: " + height * 100 + " см.");
        System.out.println("Ваш индекс массы тела: " + bmiResult);
    }
}
