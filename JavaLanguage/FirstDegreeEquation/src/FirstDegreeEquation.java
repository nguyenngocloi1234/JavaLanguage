import java.util.Scanner;

public class FirstDegreeEquation {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a = ");
        double a = scanner.nextDouble();

        System.out.println("b = ");
        double b = scanner.nextDouble();

        System.out.println("c = ");
        double c = scanner.nextDouble();

        if(a!=0){
            double x = (c-b)/a;
            System.out.println(" Equation pass with x = " + x);
        }
        else if (b==c){
            System.out.println("Equation pass with any x! ");
        }else{
            System.out.println("Equation has no root!");
        }




    }
}
