package baseball.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MatchStrikeTest {

    List<Integer> answer;
    MatchStrike strike;
    @BeforeEach
    void setUp() {
        answer =Arrays.asList(1,2,3);
        strike = new MatchStrike();
    }
    @Test
    void getStrike() {
        int result = strike.matchStrike(answer,Arrays.asList(1,2,3));
        assertThat(result) .isEqualTo(3);
    }
    @ParameterizedTest
    @CsvSource({"1,2,3,3","2,5,1,0","6,7,8,0","5,6,3,1","2,1,3,1","1,4,3,2"})
    void getMatchNum2(int number1,int number2,int number3,int expected){
        int expect =strike.matchStrike(answer,Arrays.asList(number1,number2,number3));
        assertThat(expect).isEqualTo(expected);
    }
}