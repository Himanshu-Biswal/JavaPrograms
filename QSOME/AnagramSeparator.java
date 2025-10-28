package QSOME;

import java.util.*;

public class AnagramSeparator {
    public static void main(String[] args) {
        String[] str = {"eat", "tea", "ate", "tan", "bat", "nat"};

        // Map to group anagrams
        Map<String, List<String>> map = new HashMap<>();

        for (String s : str) {
            // Sort the characters of the string to use as a key
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            // Group all anagrams by their sorted character key
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        // Print anagrams and non-anagrams
        List<List<String>> anagramGroups = new ArrayList<>();
        List<String> nonAnagrams = new ArrayList<>();

        for (List<String> group : map.values()) {
            if (group.size() > 1) {
                anagramGroups.add(group);
            } else {
                nonAnagrams.add(group.get(0));
            }
        }

        // Output
        System.out.println("Anagram groups:");
        for (List<String> group : anagramGroups) {
            System.out.println(group);
        }

        System.out.println("\nNon-anagram strings:");
        System.out.println(nonAnagrams);
    }
}

