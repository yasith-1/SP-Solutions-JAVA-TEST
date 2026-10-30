import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListCombination {
    public static void main(String[] args) {
        List<Object> list1 = Arrays.asList("a", "b", "c");
        List<Object> list2 = Arrays.asList(1, 2, 3);

        System.out.println(listInterCombination(list1, list2));
    }

    public static List<Object> listInterCombination(List<Object> list1, List<Object> list2) {
        List<Object> result = new ArrayList<>();

        int maxSize = Math.max(list1.size(), list2.size());
        System.out.println(maxSize);

        for (int i = 0; i < maxSize; i++) {

            if (i < list1.size()) {
                result.add(list1.get(i));
            }

            if (i < list2.size()) {
                result.add(list2.get(i));
            }
        }

        return result;
    }
}
