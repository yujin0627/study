package com.simple.basic.command;

import java.util.Arrays;
import java.util.Comparator;

public class 문자열내마음대로정렬하기 {
    public static void main(String[] args) {
        String[] strings = {"sun", "bed", "car"};
        int n = 2;
        String[] answer = new String[strings.length];

        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.charAt(n) - o2.charAt(n);
            }
        });
        answer = strings;
        System.out.println(Arrays.toString(strings));
    }
}
