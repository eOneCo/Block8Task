import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ElementCounter {


    public static Map count(ArrayList<Integer> arrayList) {
        Map<Integer, Integer> elementsCount = new HashMap<>();
        for (int element : arrayList) {
            if (!elementsCount.containsKey(element)) {
                elementsCount.put(element, 1 );

            } else {
                elementsCount.put(element, elementsCount.get(element).intValue()+ 1);
            }
        }

        return elementsCount;
    }


}
