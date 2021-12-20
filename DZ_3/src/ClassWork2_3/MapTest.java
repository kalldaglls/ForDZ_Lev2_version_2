package ClassWork2_3;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        HashMap<Integer, String> telHashMap2 = new HashMap<>();
        telHashMap2.put(34355, "Smith");
        telHashMap2.put(55343, "Smith");
        telHashMap2.put(11452, "Wesson");
        telHashMap2.put(59785, "Anderson");
        telHashMap2.put(25411, "Wesson");

//        System.out.println(telHashMap2.get(25411));
//        System.out.println(telHashMap2.entrySet());

        Map<Integer,String> map1 = new HashMap<>();
        map1.put(34355, "Smith");
       map1.put(55343, "Smith");
        map1.put(11452, "Wesson");
        map1.put(59785, "Anderson");
        map1.put(25411, "Wesson");
        System.out.println();
//        Map.Entry<Integer, String> stringEntry = new Map.Entry<Integer, String>() {
////            @Override
////            public Integer getKey() {
////                return null;
////            }
////
////            @Override
////            public String getValue() {
////                return null;
////            }
////
////            @Override
////            public String setValue(String value) {
////                return null;
////            }
////        };
////        stringEntry.setValue("Smith");

        for(Map.Entry<Integer, String> item : map1.entrySet()){

            System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
        }
    }
}
