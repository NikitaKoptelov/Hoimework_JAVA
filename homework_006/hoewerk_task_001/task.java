//        Задача
//  Подумать над структурой класса Ноутбук для магазина техники - 
//  выделить поля и методы. Реализовать в java.
//  Создать множество ноутбуков.
//  Написать метод, который будет запрашивать у пользователя критерий 
//  (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. 
//  Критерии фильтрации можно хранить в Map. Например: “Введите цифру, 
//  соответствующую необходимому критерию:
//                                          1 - ОЗУ
//                                          2 - Объем ЖД
//                                          3 - Операционная система
//                                          4 - Цвет …
//  Далее нужно запросить минимальные значения для указанных 
//  критериев - сохранить параметры фильтрации можно также в Map.
//  Отфильтровать ноутбуки их первоначального множества и 
//  вывести проходящие по условиям.
//
//      Решение:

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class task{

    public static String magazin_nout(int zapros){
        String rez;
        // ArrayList<Map<String, String>> noutbok_1 = new ArrayList<>();
        // noutbok_1.add()
        Map<String, String> noutbook_1 = new HashMap<>();
        noutbook_1.put("OZU", "10");
        noutbook_1.put("HDD", "500");
        noutbook_1.put("OS", "Windows");
        noutbook_1.put("color", "red");
        Map<String, String> noutbook_2 = new HashMap<>();
        noutbook_2.put("OZU", "20");
        noutbook_2.put("HDD", "1000");
        noutbook_2.put("OS", "Windows");
        noutbook_2.put("color", "green");
        Map<String, String> noutbook_3 = new HashMap<>();
        noutbook_3.put("OZU", "16");
        noutbook_3.put("HDD", "300");
        noutbook_3.put("OS", "Ubuntu");
        noutbook_3.put("color", "gree");

        switch(zapros){
            case 0:
                rez = "noutbook_1 - " + noutbook_1.toString() + "\n" + 
                        "noutbook_2 - " + noutbook_2.toString() + "\n" + 
                        "noutbook_3 - " + noutbook_3.toString() + "\n";
                break;
            case 1:
                rez = "OZU :\n" + "noutbook_2 - " + noutbook_2.get("OZU").toString()+"\n"+
                                    "noutbook_3 - " + noutbook_3.get("OZU").toString()+"\n"+
                                    "noutbook_1 - " + noutbook_1.get("OZU").toString()+"\n";
                break;
            case 2:
                rez = "HDD :\n" + "noutbook_2 - " + noutbook_2.get("HDD").toString()+"\n"+
                                    "noutbook_1 - " + noutbook_1.get("HDD").toString()+"\n"+
                                    "noutbook_3 - " + noutbook_3.get("HDD").toString()+"\n";
                break;
            case 3:
                rez = "OS :\n" + "noutbook_1 - " + noutbook_1.get("OS").toString()+"\n"+
                                    "noutbook_2 - " + noutbook_2.get("OS").toString()+"\n"+
                                    "noutbook_3 - " + noutbook_3.get("OS").toString()+"\n";
                break;
            case 4:
                rez = "color :\n" + "noutbook_1 - " + noutbook_1.get("color").toString()+"\n"+
                                    "noutbook_2 - " + noutbook_2.get("color").toString()+"\n"+
                                    "noutbook_3 - " + noutbook_3.get("color").toString()+"\n";
                break;
            default:
                rez = "error";
        }

        return rez;
    }

    public static void main(String[] args) {
        // Map<String, String> mag_noutbook = new HashMap<>();

        System.out.println("список доступного: \n"+magazin_nout(0));
        System.out.println("сортировка по ОЗУ: \n"+magazin_nout(1));
        System.out.println("сортировка по ЖД: \n"+magazin_nout(2));
        System.out.println("OS ноутбука: \n"+magazin_nout(3));
        System.out.println("цвет ноутбука: \n"+magazin_nout(4));

    }
}


