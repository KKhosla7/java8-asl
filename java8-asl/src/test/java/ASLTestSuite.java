import datetimeexercise.ThreeTenExerciseTest;
import lambdaexercise.LambdaExerciseOneTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by Karan Khosla
 */

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                LambdaExerciseOneTest.class,
                ThreeTenExerciseTest.class,
        }
)
public class ASLTestSuite {

}