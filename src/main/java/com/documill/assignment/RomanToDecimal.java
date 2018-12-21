package com.documill.assignment;

import java.util.HashMap;
import java.util.Map;

public class RomanToDecimal {

    private static Map<Character, Integer> values = new HashMap<Character, Integer>(){{
        put('i', 1);
        put('v', 5);
        put('x', 10);
        put('l', 50);
        put('c', 100);
        put('d', 500);
        put('m', 1000);
    }};

    /**
     * Converts Roman positive numbers to decimal values.
     * @param roman Roman number, e.g. "MMMCMCCXCXXXIXIVIII".
     * @throws IllegalArgumentException when input is not a Roman number.
     * @return Decimal value of provided roman number.
     */
    public static int convert(String roman) throws IllegalArgumentException {
        String romanNormalized = roman.trim().toLowerCase();

        // Checking that input contains only valid characters.
        if (!romanNormalized.matches("^[ivxlcdm]+$")) {
            throw new IllegalArgumentException("Input is not a valid Roman number");
        }

        int result = 0;
        int prev = 0;
        for (int i = romanNormalized.length() - 1; i >= 0; i--) {
            int current = values.get(romanNormalized.charAt(i));
            // if previous character represents smaller number,
            // it means that we have a shortened version of number,
            // like "IX" meaning (10 - 1).
            if (current < prev) {
                result -= current;
            } else {
                result += current;
            }
            prev = current;
        }
        return result;
    }
}
