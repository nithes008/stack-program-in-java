// File: P10_FindDuplicatesArray.java
import java.util.HashSet;

public class P10_FindDuplicatesArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 7, 8, 8, 3};
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        System.out.println("Duplicate elements: " + duplicates);
    }
}
