import java.util.HashMap;
import java.util.Map;

public class Sobes {
    public static void main(String[] args) {
        int arr[] = new int[] {0, 0, -7, -7, -7, 1, 2, 5, 3, 1, 2};
        int n = getFirstUnique(arr);
        System.out.println(n);

    }

    private static int getFirstUnique(int[] arr) {

        Map<Integer, Integer> arrayMap = new HashMap<>();

        for (int n: arr
             ) {
            arrayMap.put(n, arrayMap.getOrDefault(n, 0) + 1);
        }

        for (int n: arr
             ) {
            if (arrayMap.get(n) == 1) {
                return n;
            }
        }

        return -1;
    }
}
