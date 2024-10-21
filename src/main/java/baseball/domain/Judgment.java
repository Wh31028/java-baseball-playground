package baseball.domain;

import java.util.ArrayList;

public class Judgment {
    public int judge(ArrayList<Integer> answer, ArrayList<Integer> input) {
        int ball = 0;
         MatchNum matchNum = new MatchNum();
         MatchStrike matchStrike = new MatchStrike();
         int strike = matchStrike.matchStrike(answer, input);
         ball = matchNum.match(answer, input)- strike;
        if(ball>0) System.out.print(ball+"볼 ");
        if(strike>0) System.out.print(strike+"스트라이크");
        if(ball==0&&strike==0) System.out.print("낫싱");
        System.out.println();
        return strike;
    }
}
