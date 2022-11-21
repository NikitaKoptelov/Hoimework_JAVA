//    Задача
// Реализовать простой калькулятор
//  
//  Решение:
import java.util.Scanner;
import java.lang.Math;

public class task_003 {
    static Scanner scanner = new Scanner(System.in);
 
    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        double result = calc(num1,num2,operation);
        String result_s = String.format("%.3f", result);
        System.out.println("Результат операции: "+result_s);
    }
 
    public static int getInt(){
        System.out.println("Введите число:");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();//рекурсия
            num = getInt();
        }
        return num;
    }
 
    public static char getOperation(){
        System.out.println("Введите операцию:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();//рекурсия
            operation = getOperation();
        }
        return operation;
    }
 
    public static double calc(int num1, int num2, char operation){
        double result;
        double num_1 = (double) num1;
        double num_2 = (double) num2;
        switch (operation){
            case '+':
                result = num_1+num_2;
                break;
            case '-':
                result = num_1-num_2;
                break;
            case '*':
                result = num_1*num_2;
                break;
            case '/':
                result = num_1/num_2;
                break;
            case '^':
                result = Math.pow(num_1, num_2);
                break;
            case 's':
                result = Math.sqrt(num_1);
                break;
            case 'c':
                result = Math.cbrt(num_1);
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, getOperation());//рекурсия
        }
        return result;
    }
}
