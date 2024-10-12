package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void spilit(){
        String[] actual = "1,2".split(",");
        assertThat(actual).contains("1","2");
        String[] actual2 = "1".split(",");
        assertThat(actual2).contains("1");
    }

    @Test
    void substring(){
        String input = "(1,2)";
        String result = input.substring(1,input.length()-1);
        assertThat(result).isEqualTo("1,2");
    }
    @Test
    void charAt(){
        String str = "abc";
        char result = str.charAt(1);
        assertThat(result).isEqualTo('b');

    }
    @Test
    @DisplayName("예외 발생 테스트")
    void charAtException(){
        String actual = "abc";
        int index = 10;
        assertThatThrownBy(() -> {
            actual.charAt(index);
        }).isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageContaining("String index out of range: %d",index);

    }
}
