//        Задача
// Пусть дан произвольный список целых чисел, удалить из него четные числа
// 
//        Решение:


import java.util.ArrayList;
import java.util.Collections;
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

        for(int i=0; i<spisok_numb.size(); i++){
            int chet_num = spisok_numb.get(i)%2;
            if(chet_num==0){
                System.out.println("числа для удаления - "+spisok_numb.get(i));
                spisok_numb.remove(i);
            }
        }
        Collections.sort(spisok_numb);
        System.out.println("список чисел после изменения - "+spisok_numb);

    }

}

