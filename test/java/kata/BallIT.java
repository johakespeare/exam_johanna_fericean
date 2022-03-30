package kata;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



/**
 * IT integration-test testing the real thing in integration
 * the suffix IT means that it's run in a separate test suite.
 * Another possibility is to put this into a separate directory like src/integration-test/java
 */
public class BallIT {



    Ball b = new Ball(200);

    @Test
    @Timeout(200)
    public void itRollsForAGivenAmountOfTime() throws Exception {


        b.roll();


    }
}
