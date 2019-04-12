public class PrimeSmallerThan100 {
    public static void main(String[] args) {
        for(int number=2;number<100;number++){
            if (isPrime(number)) {
                System.out.println("PrimeSmallerThan100: "+number);
            }
}
    }

    private static boolean isPrime(int number) {
        if(number <2){
            return false;
        }
        else{
            int i=2;
            while(i<=Math.sqrt(number)){
                if (number % i ==0){
                    return false;
                }
                i++;
            }
            return true;

        }
    }
}
