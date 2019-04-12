import java.util.Scanner;

public class Prime20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter a number of primes: ");
        int number = scanner.nextInt();
        int element =2;
        int count=0;
        while(count<number) {
            if (isPrime(element)) {
                count++;
                System.out.println("Prime"+count+": " + element);

            }
            element++;
        }

    }

    private static boolean isPrime(int number){
        if(number <2)
            return false;
        else {
            int i=2;
            while(i<=Math.sqrt(number)){
                if(number % i ==0){
                    return false;
                }
                else
                    i++;
            }
            return true;
        }
    }
}
