package org.preparation;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println(firstUniqChar("repeatedrelax"));
    }

    private static int firstUniqChar(String s) {
        Map<Character, Integer> strMap = new HashMap<Character, Integer>();
        int strLength = s.length();

        for (int i = 0; i < strLength; i++) {
            char c = s.charAt(i);
            strMap.put(c, strMap.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < strLength; i++) {
            if (strMap.get(s.charAt(i)) == 1)
                return i;
        }

        return -1;
    }
}
