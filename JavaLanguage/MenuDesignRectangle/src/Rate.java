import java.util.Scanner;


public class Rate {
    public static void main(String[] args) {
        int rate = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter USD: ");
        int usd = scanner.nextInt();
        int vnd = usd *rate;
        System.out.println(usd+"USD = "+vnd+" VND");
    }
}
