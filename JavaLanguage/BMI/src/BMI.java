import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your weight (in kilogram): ");
        double weight = scanner.nextDouble();

        System.out.println("Your height (in meter): ");
        double height = scanner.nextDouble();

        double bmi = weight/Math.pow(height,2);

        if(bmi<18)
            System.out.println(bmi+": Underweight");
        else if (bmi<25.0)
            System.out.println(bmi+": Nomal");
        else if (bmi < 30.0)
            System.out.println(bmi+": Overweight");
        else
            System.out.println(bmi+": Obese");

    }
}
