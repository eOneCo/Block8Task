import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList=new ArrayList<>();
        int[]mass={1,2,3,4,5,6,7,7,8,9,7,6,5,6,8,6,5,5,5,5,5,5,0};
        for (Integer element:
                mass) {
            arrayList.add(element);
        }

        System.out.println(ElementCounter.count(arrayList).size());
    }
}
