// File: P07_FirstNonRepeatingCharacter.java
import java.util.LinkedList;
import java.util.Queue;

public class P07_FirstNonRepeatingCharacter {
    public static void findFirstNonRepeating(String stream) {
        int[] count = new int[26];
        Queue<Character> q = new LinkedList<>();

        System.out.print("Stream output: ");
        for (char ch : stream.toCharArray()) {
            q.add(ch);
            count[ch - 'a']++;

            while (!q.isEmpty() && count[q.peek() - 'a'] > 1) {
                q.remove();
            }

            if (q.isEmpty()) {
                System.out.print("-1 ");
            } else {
                System.out.print(q.peek() + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String str = "aabc";
        findFirstNonRepeating(str);
    }
}
