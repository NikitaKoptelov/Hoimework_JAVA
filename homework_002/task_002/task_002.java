//    Задача
// Реализуйте алгоритм сортировки 
// пузырьком числового массива, 
// результат после каждой итерации запишите в лог-файл.
//  
//  Решение:

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class task_002 {
    public static void main(String[] args) throws IOException {
        Integer[] array_num = {2, 1, 4, 6, 3, 5};

        String str_zap = "";
        FileWriter b = new FileWriter("task_faile.txt", true);

        str_zap = Arrays.toString(array_num);
        b.write(str_zap);

        boolean sorted = false;
        int temp;
        while (!sorted) {
//            System.out.println(Arrays.toString(array_num));
            str_zap = Arrays.toString(array_num);
            b.append(str_zap);
            sorted = true;
            for (int i = 0; i < array_num.length - 1; i++) {
                if (array_num[i] > array_num[i+1]) {
//                    System.out.println(array_num[i]+"--"+array_num[i+1]);
                    str_zap = (array_num[i]+"--"+array_num[i+1]);
                    b.append(str_zap);
                    temp = array_num[i];
                    array_num[i] = array_num[i+1];
                    array_num[i+1] = temp;
                    sorted = false;
                }

            }
        }

        b.append("\n");
        b.close();
        System.out.println(Arrays.toString(array_num));

    }
}
