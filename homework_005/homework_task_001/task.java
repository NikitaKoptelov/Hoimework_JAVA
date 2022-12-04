//        Задача
//  Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
//
//      Решение:



import java.util.ArrayList;
import java.util.HashMap;
 
public class task {

    public static HashMap<String, ArrayList<Integer>> phones(HashMap<String, ArrayList<Integer>> phoneNumber, String key, int value){
        if (phoneNumber.containsKey(key)) {
            phoneNumber.get(key).add(value);
        } else {
            ArrayList<Integer> arrayList = new ArrayList<Integer>(1);
            arrayList.add(value);
            phoneNumber.put(key, arrayList);
        }
        
        // System.out.println(phoneNumber);
        return phoneNumber;
    }
    
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> phoneNumber = new HashMap<String, ArrayList<Integer>>();

        phones(phoneNumber, "dfg", 753);
        phones(phoneNumber, "dfg", 456);
        phones(phoneNumber, "abc", 123);
        phones(phoneNumber, "wer", 741);
        phones(phoneNumber, "qaz", 851);
        phones(phoneNumber, "tgb", 965);
        phones(phoneNumber, "tgb", 452);

        System.out.println(phoneNumber);
        
    }
}

