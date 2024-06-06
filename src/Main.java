import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Сегодня " + permission(18, 25));
        System.out.println("Сегодня " + permission(21, 18));
        System.out.println("Сегодня " + permission(20, 35));
        System.out.println("Сегодня " + permission(25, 40));
        System.out.println("Сегодня " + permission(10, 15));
        int randomAge = generateRandomAge();
        System.out.println("Сгенерированный рандомный возраст " + randomAge);
    }

    public static String permission(int age, int temperature) {
        if ((age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) ||
                (age < 20 && temperature >= 0 && temperature <= 28) ||
                (age > 45 || temperature >= -10 && temperature <= 25)) {
            return "можно идти гулять ";
        } else return "оставайтесь дома ";

    }
    public static int generateRandomAge() {
        Random random = new Random() ;
        int  minAge = 1;
        int  maxAge = 100;
        return random.nextInt(maxAge - minAge );
    }


}