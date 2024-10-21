package baseball.domain;

import java.util.List;

public class MatchStrike {
    public int matchStrike(List<Integer> answer, List<Integer> input) {
        int count =0;
        for(int i=0;i<answer.size();i++){
            count+= matchStrikeCount(answer.get(i),input.get(i));
        }
        return count;
    }
    private int matchStrikeCount(int answer,int input){
        if(answer==input) return 1;
        else return 0;
    }
}
