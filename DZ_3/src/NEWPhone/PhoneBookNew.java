package NEWPhone;

import java.util.HashMap;
import java.util.Map;

public class PhoneBookNew {
    private Integer number;
    private HashMap<String,Integer> hashMap;

    public void add(String name,Integer number){
        hashMap.put(name,number);
    }
}
