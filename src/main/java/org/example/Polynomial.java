package org.example;

public class Polynomial {
    private String express;
    public Polynomial(String input) {
        express = input;
    }

    public int calc() {
        int result = 0;
        int operator = 1;
        String [] split = express.split(" ");
        for(int i=0; i<split.length; i++) {
            if(split[i].equals("+")) {
                operator = 1;
                continue;
            } else if(split[i].equals("-")) {
                operator = 2;
                continue;
            } else if(split[i].equals("*")) {
                operator = 3;
                continue;
            } else if(split[i].equals("/")) {
                operator = 4;
                continue;
            }

            int temp = Integer.parseInt(split[i]);
            switch(operator) {
                case 1:
                    result += temp;
                    break;
                case 2:
                    result -= temp;
                    break;
                case 3:
                    result *= temp;
                    break;
                case 4:
                    result /= temp;
                    break;
            }
        }
        return result;
    }
}