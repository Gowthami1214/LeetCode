import java.util.*;

class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> seen = new HashSet<>();
        Set<String> repeated = new HashSet<>();

        for (int i = 0; i + 10 <= s.length(); i++) {
            String window = s.substring(i, i + 10); // Sliding window
            if (!seen.add(window)) {
                repeated.add(window);
            }
        }
        return new ArrayList<>(repeated);
    }
}
