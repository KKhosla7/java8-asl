package lambdaexercise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by Karan Khosla
 */
public class LambdaExerciseOne {

    public List<String> uppercaseNamesWithoutLambda(List<String> namesList) {
        for (int counter = 0; counter < namesList.size(); counter++)
            namesList.set(counter, namesList.get(counter).toUpperCase());
        return namesList;
    }

    public List<String> uppercaseNamesWithLambda(List<String> namesList) {
        return namesList.stream().map(String::toUpperCase).collect(Collectors.toList());
    }

    public List<Integer> listOfPrimesWithLambda(List<Integer> numList) {
        return numList.stream().filter(this::isPrimeWithLambda).collect(Collectors.toList());
    }

    public List<Integer> listOfPrimesWithoutLambda(List<Integer> numList) {
        List<Integer> primeNumberList = new ArrayList<>();
        for (Integer num : numList)
            if (isPrimeWithoutLambda(num))
                primeNumberList.add(num);
        return primeNumberList;
    }

    private boolean isPrimeWithLambda(int number) {
        return IntStream.range(2, number).noneMatch((index) -> number % index == 0) && number > 1;
    }


    private boolean isPrimeWithoutLambda(int number) {
        for (int counter = 2; counter < number; counter++)
            if (number % counter == 0)
                return false;
        return number > 1;
    }

    private boolean isEven(int number) {
        return (number & 1) == 0;
    }

    public List<Integer> isEvenWithLambda(List<Integer> numList) {
        return numList.stream().filter(this::isEven).collect(Collectors.toList());
    }

    public List<Integer> isEvenWithoutLambda(List<Integer> numList) {
        List<Integer> evenNumList = new ArrayList<>();
        for (Integer number : numList)
            if (isEven(number))
                evenNumList.add(number);
        return evenNumList;
    }


}
