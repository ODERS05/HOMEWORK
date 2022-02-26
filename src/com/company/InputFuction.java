package com.company;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class InputFuction {
    public Set<Character> setOfNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        String number = scanner.next();
        Set<Character> setNumbers = new HashSet<>();
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == ',') {
                continue;
            }
            setNumbers.add(number.charAt(i));
        }
       return setNumbers;
    }
}

