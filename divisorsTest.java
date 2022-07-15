import org.junit.jupiter.api.*;

import java.util.ArrayList;

class divisorsTest {

    @Test
    void firstTest() {
        ArrayList<Integer> result = new ArrayList<>();
        divisors.counting(result, 5);
        ArrayList<Integer> TestFor5 = new ArrayList<>();
        TestFor5.add(1);
        TestFor5.add(5);
        Assertions.assertEquals(result, TestFor5);
    }

    @Test
    void secondTest() {
        ArrayList<Integer> result = new ArrayList<>();
        divisors.counting(result, 10);
        ArrayList<Integer> TestFor10 = new ArrayList<>();
        TestFor10.add(1);
        TestFor10.add(2);
        TestFor10.add(5);
        TestFor10.add(10);
        Assertions.assertEquals(result, TestFor10);
    }
    @Test
    void thirdTest() {
        ArrayList<Integer> result = new ArrayList<>();
        divisors.counting(result, 97);
        ArrayList<Integer> TestFor97 = new ArrayList<>();
        TestFor97.add(1);
        TestFor97.add(97);
        Assertions.assertEquals(result, TestFor97);
    }
}