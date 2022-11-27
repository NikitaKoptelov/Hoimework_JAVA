//         Задача
//  Задан целочисленный список ArrayList. 
//  Найти минимальное, максимальное и среднее из этого списка.
//
//         Решение:

import java.util.ArrayList;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;

public class task{
    public static void main(String[] args) {
        List<Integer> spisok_numb = new ArrayList<>();
        spisok_numb.add(1);
        spisok_numb.add(2);
        spisok_numb.add(3);
        spisok_numb.add(4);
        spisok_numb.add(5);
        spisok_numb.add(6);
        spisok_numb.add(7);
        spisok_numb.add(8);
        spisok_numb.add(9);
        spisok_numb.add(10);

        System.out.println("список чисел до изменения - "+spisok_numb);

        IntSummaryStatistics stats = spisok_numb.stream()
                                     .mapToInt((x) -> x)
                                     .summaryStatistics();
        System.out.println(stats);



    }

}

