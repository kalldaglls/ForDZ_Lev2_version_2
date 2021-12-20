package NEWPhone;

import java.util.HashMap;
import java.util.Map;

public class MainDZ_2_3 {
    public static void main(String[] args) {
        PhoneBookNew phoneBookNew1 = new PhoneBookNew();
        Map<PhoneBookNew,UserName> map1 = new HashMap<>();
        map1.put(phoneBookNew1,new UserName("Antonov"));
    }
}
