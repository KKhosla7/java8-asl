package datetimeexercise;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Karan Khosla
 */
public class ThreeTenExerciseTest {

    ThreeTenExercise exercise;

    @Before
    public void setUp() throws Exception {
        exercise = new ThreeTenExercise();
    }

    @Test
    public void testAgeByDOB() {
        assertEquals("find age by date of birth. DOB", exercise.findAgeByDOB(1988, 7, 6), 25);
    }
}
