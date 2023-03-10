package com.ll;

public class Calculator {
    public static int run(String exp) {
        boolean needToPlus = exp.contains("+");
        boolean needToMinus = exp.contains("-");

        String[] bits = null;
        if (needToPlus) {
            bits = exp.split(" \\+ ");
        } else if (needToMinus) {
            bits = exp.split(" - ");
        }

        int a = Integer.parseInt(bits[0]);
        int b = Integer.parseInt(bits[1]);
        int c = 0;

        if(bits.length > 2) {
            c = Integer.parseInt(bits[2]);
            return a + b + c;
        }
        else if (needToPlus) {
            return a + b;
        } else if (needToMinus) {
            return a - b;
        }

        throw new RuntimeException("올바른 계산식이 아닙니다.");
    }
}