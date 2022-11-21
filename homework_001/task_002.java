//    Задача
// Вывести все простые числа от 1 до 1000
//  
//  Решение:


public class task_002 {
    public static void main(String[] args) {
 
        int i;
        int num = 0;
        int maxCheck = 1000; // maxCheck limit till which you want to find prime numbers
        boolean isPrime = true;
 
        //Empty String
        String primeNumbersFound = "";
 
        //Start loop 1 to maxCheck
        for (i = 1; i <= maxCheck; i++) {
            isPrime = CheckPrime(i);
            if(i!=1){
                if (isPrime) {
                    primeNumbersFound = primeNumbersFound + i + " ";
                }
            }
        }
        System.out.println("Prime numbers from 1 to " + maxCheck + " are:");
        // Print prime numbers from 1 to maxCheck
        System.out.println(primeNumbersFound);
    }
    public static boolean CheckPrime(int numberToCheck) {
        int remainder;
        for (int i = 2; i <= numberToCheck / 2; i++) {
            remainder = numberToCheck % i;
            //if remainder is 0 than numberToCheckber is not prime and break loop. Elese continue loop
            if (remainder == 0) {
                return false;
            }
        }
        return true;
 
    }
}