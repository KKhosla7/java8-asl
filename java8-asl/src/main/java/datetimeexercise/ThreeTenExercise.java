package datetimeexercise;

import java.time.LocalDate;
import java.time.Period;

/**
 * Created by Karan Khosla
 */
public class ThreeTenExercise {


    public int findAgeByDOB(int year, int month, int day) {
        LocalDate today = LocalDate.now();
        LocalDate dateOfBirth = LocalDate.of(year, month, day);
        return Period.between(dateOfBirth, today).getYears();
    }
}
