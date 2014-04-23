package lambdaexercise;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

/**
 * Created by Karan Khosla
 */
public class LambdaExerciseOneTest {

    private LambdaExerciseOne exercise;

    @Before
    public void setUp() throws Exception {
        exercise = new LambdaExerciseOne();
    }

    @Test
    public void testUppercaseNames() {
        assertEquals(exercise.uppercaseNamesWithoutLambda(namesList), exercise.uppercaseNamesWithLambda(namesList));
    }

    @Test
    public void testPrimes() {
        assertEquals(exercise.listOfPrimesWithoutLambda(numList), exercise.listOfPrimesWithLambda(numList));
    }


    @Test
    public void testEvenNumbers() {
        assertEquals(exercise.isEvenWithoutLambda(numList), exercise.isEvenWithLambda(numList));
    }

    @Test
    public void testNoDuplicates() {
        assertEquals(duplicateNumList.stream().distinct().collect(Collectors.toList()),
                Arrays.asList(1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 13, 14));
    }

    @Test
    public void testSumOfPrimes() {
        int sumWithoutLambda = 0;
        List<Integer> allPrimesList = exercise.listOfPrimesWithoutLambda(numList);
        for (Integer num : allPrimesList) {
            sumWithoutLambda += num;
        }

        int sumWithLambda = exercise.listOfPrimesWithLambda(numList).stream().reduce( (num, sum) -> num + sum ).get();

        assertEquals(sumWithoutLambda,sumWithLambda);
    }


    // Test Data

    private static List<String> namesList = new ArrayList<String>() {{
        add("Brian");
        add("John");
        add("Joe");
        add("Joel");
        add("Gavin");
        add("Joshua");
        add("Jim");
        add("Terry");
        add("Tom");
        add("Tim");
        add("Kim");
        add("Walter");
        add("Mark");
        add("Greg");
        add("Walden");
    }};

    private static List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18,
            19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45,
            46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72,
            73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99,
            100);

    private static List<Integer> duplicateNumList = Arrays.asList(1, 2, 3, 4, 1, 6, 7, 8, 9, 10, 11, 11, 13, 14);
}
