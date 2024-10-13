package study;

import java.util.Scanner;

public class Calculator {
    public Calculator() {

    }

    public String[] stringToArray(String input) {
        return input.split(" ");
    }

    public int stringToInt(String input) {
        return Integer.parseInt(input);
    }

    public int result(String text) {
        String[] textArr = stringToArray(text);
        int sum = 0;
        for (int i = 0; i < textArr.length; i++) {
            if (textArr[i].equals("+")) {
                sum += stringToInt(textArr[i + 1]);
            } else if (textArr[i].equals("-")) {
                sum -= stringToInt(textArr[i + 1]);
            } else if (textArr[i].equals("*")) {
                sum *= stringToInt(textArr[i + 1]);
            } else if (textArr[i].equals("/")) {
                sum /= stringToInt(textArr[i + 1]);
            } else {
                if (sum == 0)
                    sum = stringToInt(textArr[i]);
            }
        }
        return sum;
    }
}


