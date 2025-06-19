package Aa_Interview_Question;

import java.util.*;
import java.util.stream.IntStream;

public class Java8 {
    public static void main(String[] args) {
        String input = "malayalam";
        String result = getLongestUniqueSubstring(input);
        System.out.println("Longest substring without repeating characters: " + result);
    }

    public static String getLongestUniqueSubstring(String str) {
        int n = str.length();
        int start = 0;
        int maxLen = 0;
        int maxStart = 0;

        Set<Character> set = new HashSet<>();

        for (int end = 0; end < n; end++) {
            char current = str.charAt(end);
            while (set.contains(current)) {
                set.remove(str.charAt(start));
                start++;
            }
            set.add(current);

            if (end - start + 1 > maxLen) {
                maxLen = end - start + 1;
                maxStart = start;
            }
        }

        // Use Java Stream API to build the final substring
        return IntStream.range(maxStart, maxStart + maxLen)
                .mapToObj(str::charAt)
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
    }
}

