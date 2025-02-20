package uke6_stabel;

import java.util.Stack;

public class ParentesSjekker {

    public static boolean sjekkParenteser(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (erStartParentes(c)) {
                stack.push(c);
            } else if (erSluttParentes(c)) {
                if (stack.isEmpty() || !erParentesPar(stack.pop(), c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty(); // True hvis alle parenteser er lukket korrekt
    }

    private static boolean erStartParentes(char c) {
        return c == '(' || c == '{' || c == '[';
    }

    private static boolean erSluttParentes(char c) {
        return c == ')' || c == '}' || c == ']';
    }

    private static boolean erParentesPar(char start, char slutt) {
        return (start == '(' && slutt == ')') ||
                (start == '[' && slutt == ']') ||
                (start == '{' && slutt == '}');
    }
}
