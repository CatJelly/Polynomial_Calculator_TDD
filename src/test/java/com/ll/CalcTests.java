package com.ll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalcTests {

    @Test
    @DisplayName("1 + 1 == 2")
    void test1() {
        String expression = "1 + 1";
        assertThat(Calculator.run(expression)).isEqualTo(2);
    }

    @Test
    @DisplayName("2 + 1 == 3")
    void test2() {
        String expression = "2 + 1";
        assertThat(Calculator.run(expression)).isEqualTo(3);
    }

    @Test
    @DisplayName("2 + 2 == 4")
    void test3() {
        String expression = "2 + 2";
        assertThat(Calculator.run(expression)).isEqualTo(4);
    }

    @Test
    @DisplayName("1000 + 280 == 1280")
    void test4() {
        String expression = "1000 + 280";
        assertThat(Calculator.run(expression)).isEqualTo(1280);
    }

    @Test
    @DisplayName("50 - 30 == 20")
    void test5() {
        assertThat(Calculator.run("50 - 30")).isEqualTo(20); // 구현
    }

    @Test
    @DisplayName("3 - 1 == 2")
    void test6() {
        assertThat(Calculator.run("3 - 1")).isEqualTo(2); // 구현
    }

    @Test
    @DisplayName("100 - 20 == 80")
    void test7() {
        assertThat(Calculator.run("100 - 20")).isEqualTo(80); // 구현
    }
    @Test
    @DisplayName("10 + 20 + 30 == 60")
    void test8() {
        assertThat(Calculator.run("10 + 20 + 30")).isEqualTo(60); // 구현
    }
}
