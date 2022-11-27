//        Задача
//  К калькулятору из предыдущего дз добавить логирование.
//
//       Решение:

import java.util.Scanner;
import java.lang.Math;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class task_004{
    static Scanner scanner = new Scanner(System.in);
 
    public static void main(String[] args) throws IOException {

        String str_zap = "";
        FileWriter b = new FileWriter("calc_task.txt", true);

        int num1 = getInt();
        str_zap = ("введено число1 - "+num1+" |");
        b.write(str_zap);
        int num2 = getInt();
        str_zap = ("введено число2 - "+num2+" |");
        b.write(str_zap);
        char operation = getOperation();
        str_zap = ("введено операция - "+operation+" |");
        b.write(str_zap);
        double result = calc(num1,num2,operation);
        String result_s = String.format("%.3f", result);
        str_zap = ("результат операции над числами - "+result_s+" |");
        b.write(str_zap);
        System.out.println("Результат операции: "+result_s);
        b.append("\n");
        b.close();
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

