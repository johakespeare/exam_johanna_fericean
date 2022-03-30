package kata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ResultTest {

    @Test
    public void the37CorrespondsTo00() {
        Result res = new Result(37);
        assertTrue(res.number == "00");


    }

    @Test()
    public void theResultIsAlwaysBetween00and36() throws Exception {
    }


    @Test
    public void theColorOf0and00IsGreen() throws Exception {
        Result res = new Result(0);
        assertTrue(res.color == Result.Color.GREEN);
        Result res2 = new Result(00);
        assertTrue(res2.color == Result.Color.GREEN);

    }

    @Test
    public void theColorOfEvenNumbersIsBlack() throws Exception {
        Result res = new Result(8);
        assertTrue(res.color == Result.Color.BLACK);

    }

    @Test
    public void theColorOfOddNumbersIsRed() throws Exception {
        Result res = new Result(7);
        assertTrue(res.color == Result.Color.RED);
    }


    @Test
    public void itThrowsExceptionWhenTheRandomizerIsGreaterThan37()
            throws Exception {
        RouletteException exception = Assertions.assertThrows(
                RouletteException.class,
                () -> new Result(47)
        );
        assertEquals("Result can't be 47",exception.getMessage());

    }

    @Test
    public void itThrowsExceptionWhenTheRandomizerIsLesserThan0()
            throws Exception {
        RouletteException exception = Assertions.assertThrows(
                RouletteException.class,
                () -> new Result(-5)
        );
        assertEquals("Result can't be -5",exception.getMessage());

    }

    private void assertColorResult(int randomizerValue, Result.Color expectedColor) {
        Result res = new Result(randomizerValue);
        assertTrue(res.color == expectedColor);

    }

    private void assertNumberResult(int randomizerValue, String expectedNumber) {
        Result res = new Result(randomizerValue);
        assertTrue(res.number == expectedNumber);
    }
}