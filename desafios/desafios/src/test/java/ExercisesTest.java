import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ExercisesTest {
    @Test
    public void testQuestion1(){
        assertEquals(55, Exercises.question1(10));
    }


    @Test
    public void testQuestion2(){
        String expectedMessage = "O número %d %s aparece na sequência!";

        assertEquals(String.format(expectedMessage, 0, ""), Exercises.question2(0));
        assertEquals(String.format(expectedMessage, 1, ""), Exercises.question2(1));
        assertEquals(String.format(expectedMessage, 2, "não"), Exercises.question2(2));
        assertEquals(String.format(expectedMessage, 9, "não"), Exercises.question2(9));
    }

    @Test
    public void testQuestion5(){
        assertEquals("leirbag", Exercises.question5("gabriel"));
        assertEquals("edoc", Exercises.question5("code"));

    }
}
