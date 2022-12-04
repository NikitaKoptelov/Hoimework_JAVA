//        Задача
//  Пусть дан список сотрудников:Иван Иванов, Светлана Петрова, Кристина Белова
//  Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов
//  Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова
//  Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов. Написать программу, 
//  которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
//
//      Решение:


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class task {

    public static HashMap<String, Integer> poisk(ArrayList<String> list){
        HashMap<String, Integer> result = new HashMap<>();
        int count = 1;
        for(int i=0; i<list.size()-1; i++){
            String name = list.get(i).split(" ")[0];
            for(int j=i+1; j<list.size(); j++){
                String name_srav = list.get(j).split(" ")[0];
                if(name.equals(name_srav)){
                    count++;
                }
            }
            if(! result.containsKey(name)){
                result.put(name, count);
            }
            count = 1;
        }

        return result;
    }

    public static ArrayList<String> sort(ArrayList<String> list, HashMap<String, Integer> znach){
        ArrayList<String> sort_result = new ArrayList<>();
        Map<String, Integer> sortedMap = znach.entrySet().stream() 
                            .sorted(Comparator.comparingInt(e -> e.getValue())) 
                            .collect(Collectors.toMap(Map.Entry::getKey, 
                            Map.Entry::getValue, (a, b) -> { throw new AssertionError(); }, 
                            LinkedHashMap::new));
        ArrayList<String> key_names = new ArrayList<>(sortedMap.keySet());

        for(int k=0, c=key_names.size()-1; k<key_names.size(); k++, c--){
            String key_name_for = key_names.get(c);
            for(int l=0; l<list.size(); l++){
                String name_list = list.get(l).split(" ")[0];
                if(key_name_for.equals(name_list)){
                    sort_result.add(list.get(l));
                }
            }

        }

        return sort_result;
    }

    public static void main(String[] args) {
        ArrayList<String> spisok = new ArrayList<>();
        spisok.add("Иван Иванов");
        spisok.add("Светлана Петрова");
        spisok.add("Кристина Белова");
        spisok.add("Анна Мусина");
        spisok.add("Анна Крутова");
        spisok.add("Иван Юрин");
        spisok.add("Петр Лыков");
        spisok.add("Павел Чернов");
        spisok.add("Петр Чернышов");
        spisok.add("Мария Федорова");
        spisok.add("Марина Светлова");
        spisok.add("Мария Савина");
        spisok.add("Мария Рыкова");
        spisok.add("Марина Лугова");
        spisok.add("Анна Владимирова");
        spisok.add("Иван Мечников");
        spisok.add("Петр Петин");
        spisok.add("Иван Ежов");


        System.out.println("полный список - "+spisok);

        System.out.println("список с колличествов упоменаний имен - "+poisk(spisok));

        Collections.sort(spisok, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {              
                return o1.compareToIgnoreCase(o2);
            }
        });

        System.out.println("отсортированный список по алфавиту - "+spisok);

        System.out.println("сортировка по колличеству упоменаний - "+sort(spisok, poisk(spisok)));
        
    }
}
