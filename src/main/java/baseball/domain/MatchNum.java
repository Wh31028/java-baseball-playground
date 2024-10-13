package baseball.domain;

import java.util.List;

public class MatchNum {

    public int match(List<Integer> answer, List<Integer> input){
        int countNum=0;
        for(int i=0;i<input.size();i++){
            countNum += count(answer,input.get(i));
        }
        return countNum;
    }
    public int count(List<Integer> answer, int number ){
        if(answer.contains(number)){
            return 1;
        }
        return 0;
    }
}
