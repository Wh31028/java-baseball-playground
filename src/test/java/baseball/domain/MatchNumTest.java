package baseball.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MatchNumTest {
    List<Integer> answer;
    MatchNum m;
    @BeforeEach
    void setUp() {
         answer =Arrays.asList(1,2,3);
        m = new MatchNum();
    }
    @Test
    void arra(){
        List<Integer> a =Arrays.asList(1,2,3);
        int result =a.get(1);
        assertThat(result).isEqualTo(2);
    }
    @Test
    void getMatchNum() {
        int result =m.match(answer,Arrays.asList(1,2,3));
        assertThat(result).isEqualTo(3);
    }

    @DisplayName("숫주 확인")
    @ParameterizedTest
    @CsvSource({"1,2,3,3","2,5,1,2","6,7,8,0","5,6,3,1"})
    void getMatchNum2(int number1,int number2,int number3,int expected){
        int expect =m.match(answer,Arrays.asList(number1,number2,number3));
        assertThat(expect).isEqualTo(expected);
    }

}