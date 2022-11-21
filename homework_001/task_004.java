//    Задача
// *+Задано уравнение вида q + w = e. При q, w, e >= 0. 
//  Некоторые цифры могут быть заменены знаком вопроса, 
//  например 2? + ?5 = 69. Требуется восстановить выражение 
//  до верного равенства. Предложить хотя бы одно решение 
//  или сообщить, что его нет.
//  
//  Решение:

import java.lang.reflect.Array;
import java.util.Scanner;
public class task_004 {
    static void geet_num(int num, String iskom_sum){
        String nabor_numb = "";
        String rezultat_num = "";
        int count=0;
        int count_pousk = 0;
        int number_1 = 0;
        int number_2 = 0;
        for(number_1 = 0; number_1<=num; number_1++){
            for(number_2 = 0; number_2<=num; number_2++){
                if(number_1+number_2==num){
                    nabor_numb+= number_1+"+"+number_2+";";
                    count++;
                }
            }
        }
        String[] array_sum_num= new String[count];
        for(int i = 0; i<count; i++){
            array_sum_num[i] = nabor_numb.split(";")[i];
        }

        for(int j=0; j<array_sum_num.length; j++){
            String poisc_sum = array_sum_num[j];
            for(int l = 0; l<=poisc_sum.length(); l++){
                if(new String(poisc_sum.substring(l)).equals(iskom_sum.substring(l))){
                    count_pousk++;
                    if(count_pousk>=2){
                        System.out.println(poisc_sum);
                    }
                }
            }
            count_pousk=0;
        }
    }
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("введите вырожение с искомыми чцифрами в числах -  ");
        String formula = iScanner.nextLine();
        String znach = formula.split("=")[1];
        int num_znach = Integer.parseInt(znach);
        String summa_num = formula.split("=")[0];
        iScanner.close();
        geet_num(num_znach, summa_num);
    }
}
