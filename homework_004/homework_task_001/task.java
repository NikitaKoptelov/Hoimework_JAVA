//        Задача
//  Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет "перевернутый" список.
//
//      Решение:


import java.util.LinkedList;
 
public class task {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("J");
        list.add("A");
        list.add("V");
        list.add("A");
        System.out.println("оригинал - "+list);
        for(int i = 0, mid = list.size()/2, j = list.size() - 1; i < mid; i++, j--){
            list.set(i, list.set(j, list.get(i)));  
        }
        System.out.println("перевернутый - "+list);
    }
}