import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        boolean isPrime = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("The number that you want to check is : ");
        int number = scanner.nextInt();

        if(number <2) System.out.println(number + " is not a prime!");
        else{
            int i=2;
            while(i<=Math.sqrt(number)){
                if (number % i ==0){
                    isPrime = false;
                    break;
                }
                i++;
            }
            if(isPrime)
                System.out.println(number + " is a prime!");
            else
                System.out.println(number + " is not a prime!");
        }
    }


}
