package baseball.domain;

import java.util.ArrayList;

public class InputNum {
    public static ArrayList<Integer> input(int num){
        ArrayList<Integer> list = new ArrayList<>();
        int first = num/100;
        int second = num%100/10;
        int third = num%10;
        list.add(first);
        list.add(second);
        list.add(third);
        return list;
    }
}
