package baseball.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Random3Num {
    public List<Integer> answer = new ArrayList<>();
    public List<Integer> create(){
        Random random =new Random();
        while(answer.size()!=3){
            int num =random.nextInt(9)+1;
            answer = addNum(answer,num);
        }
        return answer;
    }
    public List<Integer> addNum(List<Integer> list,int num){
        if(!list.contains(num)){
            list.add(num);
            return list;
        }
        return list;
    }

}
