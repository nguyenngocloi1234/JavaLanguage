import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number that you want to read: ");
        int number = scanner.nextInt();
        String readNumber="", readNumberOnes="", readNumbertens="", readNumberHundred="";

        if(number < 10 && number >= 0) {
            switch(number){
                case 0:
                    readNumber = "zero";
                    break;
                case 1:
                    readNumber = "one";
                    break;
                case 2:
                    readNumber = "two";
                    break;
                case 3:
                    readNumber = "three";
                    break;
                case 4:
                    readNumber ="four";
                    break;
                case 5:
                    readNumber ="five";
                    break;
                case 6:
                    readNumber ="six";
                    break;
                case 7:
                    readNumber ="seven";
                    break;
                case 8:
                    readNumber = "eight";
                    break;
                case 9:
                    readNumber ="nine";
                    break;
                default:
                    System.out.println("out of ability!");
            }
        }

        if(number >= 10 && number < 20){
            int ones = number -10;
            switch (ones){
                case 0:
                    readNumber = "ten";
                    break;
                case 1:
                    readNumber = "eleven";
                    break;
                case 2:
                    readNumber = "twelve";
                    break;
                case 3:
                    readNumber = "thirdteen";
                    break;
                case 4:
                    readNumber ="fourteen";
                    break;
                case 5:
                    readNumber ="fiveteen";
                    break;
                case 6:
                    readNumber ="sixteen";
                    break;
                case 7:
                    readNumber = "seventeen";
                    break;
                case 8:
                    readNumber ="eighteen";
                    break;
                case 9:
                    readNumber = "nineteen";
                    break;
                default:
                    System.out.println("out of ability!");

            }
        }

        if(number < 100 && number >=20){
            int ones = number % 10;
            int tens = (number -ones)/10;
            switch (ones){
                case 0:
                    readNumberOnes = "";
                    break;
                case 1:
                    readNumberOnes = "one";
                    break;
                case 2:
                    readNumberOnes = "two";
                    break;
                case 3:
                    readNumberOnes = "three";
                    break;
                case 4:
                    readNumberOnes ="four";
                    break;
                case 5:
                    readNumberOnes ="five";
                    break;
                case 6:
                    readNumberOnes ="six";
                    break;
                case 7:
                    readNumberOnes = "seven";
                    break;
                case 8:
                    readNumberOnes ="eight";
                    break;
                case 9:
                    readNumberOnes = "nine";
                    break;
                default:
                    System.out.println("out of ability!");
            }
            switch (tens){
                case 2:
                    readNumbertens = "twenty";
                    break;
                case 3:
                    readNumbertens = "thirdty";
                    break;
                case 4:
                    readNumbertens ="fourty";
                    break;
                case 5:
                    readNumbertens ="fivety";
                    break;
                case 6:
                    readNumbertens ="sixty";
                    break;
                case 7:
                    readNumbertens = "seventy";
                    break;
                case 8:
                    readNumbertens ="eighty";
                    break;
                case 9:
                    readNumbertens = "ninety";
                    break;
                default:
                    System.out.println("out of ability!");
            }

        }

        if(number>=100 && number<1000){
            int ones = number % 10;
            int tens = ((number -ones)%100)/10;
            int hundreds = (number-ones-tens*10)/100;
            int number1=number-hundreds*100;

            switch (hundreds){
                case 1:
                    readNumberHundred = "one hundred";
                    break;
                case 2:
                    readNumberHundred= "two hundred";
                    break;
                case 3:
                    readNumberHundred = "three hundred";
                    break;
                case 4:
                    readNumberHundred ="four hundred";
                    break;
                case 5:
                    readNumberHundred ="five hundred";
                    break;
                case 6:
                    readNumberHundred ="six hundred";
                    break;
                case 7:
                    readNumberHundred = "seven hundred";
                    break;
                case 8:
                    readNumberHundred ="eight hundred";
                    break;
                case 9:
                    readNumberHundred = "nine hundred";
                    break;
                default:
                    System.out.println("out of ability!");
            }
            if(number1 < 10 && number1 >= 0) {
                switch(number1){
                    case 0:
                        readNumber = "zero";
                        break;
                    case 1:
                        readNumber = "one";
                        break;
                    case 2:
                        readNumber = "two";
                        break;
                    case 3:
                        readNumber = "three";
                        break;
                    case 4:
                        readNumber ="four";
                        break;
                    case 5:
                        readNumber ="five";
                        break;
                    case 6:
                        readNumber ="six";
                        break;
                    case 7:
                        readNumber ="seven";
                        break;
                    case 8:
                        readNumber = "eight";
                        break;
                    case 9:
                        readNumber ="nine";
                        break;
                    default:
                        System.out.println("out of ability!");
                }
            }

            if(number1 >= 10 && number1 < 20){
                switch (ones){
                    case 0:
                        readNumber = "ten";
                        break;
                    case 1:
                        readNumber = "eleven";
                        break;
                    case 2:
                        readNumber = "twelve";
                        break;
                    case 3:
                        readNumber = "thirdteen";
                        break;
                    case 4:
                        readNumber ="fourteen";
                        break;
                    case 5:
                        readNumber ="fiveteen";
                        break;
                    case 6:
                        readNumber ="sixteen";
                        break;
                    case 7:
                        readNumber = "seventeen";
                        break;
                    case 8:
                        readNumber ="eighteen";
                        break;
                    case 9:
                        readNumber = "nineteen";
                        break;
                    default:
                        System.out.println("out of ability!");

                }
            }

            if(number1 < 100 && number1 >=20){
                switch (ones){
                    case 0:
                        readNumberOnes = "";
                        break;
                    case 1:
                        readNumberOnes = "one";
                        break;
                    case 2:
                        readNumberOnes = "two";
                        break;
                    case 3:
                        readNumberOnes = "three";
                        break;
                    case 4:
                        readNumberOnes ="four";
                        break;
                    case 5:
                        readNumberOnes ="five";
                        break;
                    case 6:
                        readNumberOnes ="six";
                        break;
                    case 7:
                        readNumberOnes = "seven";
                        break;
                    case 8:
                        readNumberOnes ="eight";
                        break;
                    case 9:
                        readNumberOnes = "nine";
                        break;
                    default:
                        System.out.println("out of ability!");
                }
                switch (tens){
                    case 0:
                        readNumbertens ="zero";
                    case 2:
                        readNumbertens = "twenty";
                        break;
                    case 3:
                        readNumbertens = "thirdty";
                        break;
                    case 4:
                        readNumbertens ="fourty";
                        break;
                    case 5:
                        readNumbertens ="fivety";
                        break;
                    case 6:
                        readNumbertens ="sixty";
                        break;
                    case 7:
                        readNumbertens = "seventy";
                        break;
                    case 8:
                        readNumbertens ="eighty";
                        break;
                    case 9:
                        readNumbertens = "ninety";
                        break;
                    default:
                        System.out.println("out of ability!");
                }

            }

        }
        System.out.println(number +":" +readNumberHundred+" "+readNumber+readNumbertens+" "+readNumberOnes);

    }
}
