
import java.util.Scanner;

public class MenuDesignRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the square triangle");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4.Exit");
        System.out.println(" Enter your choice: ");


        while(true){
            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                {
                    System.out.println("Print the rectangle");
                    System.out.print("Enter a width: ");
                    int width = scanner.nextInt();
                    System.out.print("Enter a height: ");
                    int height = scanner.nextInt();

                    for(int i=1;i<=width;i++){
                        for(int j=1;j<=height;j++){
                            System.out.print("0");
                        }
                        System.out.println();
                    }
                }
                break;
                case 2:
                    System.out.println("print the square triangle: 1.Botton- left or 2.Top-left ");
                    System.out.println("number: ");
                    int number = scanner.nextInt();
                    if(number ==1){
                        System.out.println("1.Botton-left: ");
                        for(int i =1; i<=5;i++){
                            for(int j =1; j<=i; j++){
                                System.out.print("0");
                            }
                            System.out.println();
                        }
                    }
                    if(number ==2){
                        System.out.println("2.Top-left");
                        for(int i=5;i>=1;i--){
                            for(int j=1;j<=i;j++){
                                System.out.print("0");
                            }
                            System.out.println();
                        }
                    }
                    break;


                case 3:
                    System.out.println(" Draw the isosceles triangle");
                    System.out.println("Enter a height: ");
                    int n= scanner.nextInt();
                    for( int i=1;i<=n;i++){
                        for(int j=1;j<=n-i;j++){
                            System.out.print(" ");
                        }
                        for(int j=1;j<=2*i-1;j++){
                            System.out.print("0");
                        }
                        System.out.println();
                    }


                    break;
                case 0: System.exit(0);
                default:
                    System.out.println("No choice!");

            }
            System.out.println("Menu");
            System.out.println("1.Print the rectangle");
            System.out.println("2.Print the square triangle");
            System.out.println("3.Print isosceles triangle");
            System.out.println("4.Exit");
            System.out.println(" Enter your choice: ");
        }
    }

}
