import java.util.ArrayDeque;
import java.util.Queue;

public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        int freq[] = new int[26]; // Frequency array for characters
        Queue<Integer> q = new ArrayDeque<>(); // Queue to store indices of characters

        // Step 1: Count frequency of each character and populate the queue with indices
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
            q.add(i); // Add the index of the character
        }

        // Step 2: Process the queue to find the first unique character
        while (!q.isEmpty()) {
            int index = q.peek(); // Get the index of the character
            if (freq[s.charAt(index) - 'a'] == 1) {
                return index; // Return the index of the first unique character
            }
            q.remove(); // Remove the processed index from the queue
        }

        // Step 3: If no unique character exists, return -1
        return -1;
    }
}
