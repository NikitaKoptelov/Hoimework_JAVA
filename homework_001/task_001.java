//    Задача
// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
//  
//  Решение:


import java.util.Scanner;

public class task_001 {
    
    static int traigle(int n){
        if(n==1){
            return 1;
        }
        else{
            return(n*traigle(n-1));
        }
    }
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("number ");
        String number = iScanner.nextLine();
        int n = Integer.parseInt(number);
        for(int i = 1; i<=n; i++){
            System.out.println("введенное число - " + i + "   вычесленное число - " + traigle(i));
        }
        iScanner.close();
    }
}
