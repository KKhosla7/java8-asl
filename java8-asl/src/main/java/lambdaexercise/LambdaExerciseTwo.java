package lambdaexercise;

/**
 * Created by Karan Khosla
 */
public class LambdaExerciseTwo {
    public static void main(String[] args) {
        Runnable run1 = () -> System.out.println("Hello, World!");
        Runnable run2 = () -> System.out.println("Hello, Java!");
        Runnable run3 = () -> System.out.println("Hello, Java J2EE!");
        Runnable run4 = () -> System.out.println("Hello, Java J2ME!");
        Runnable run5 = () -> System.out.println("Hello, Big Data!");
        Runnable run6 = () -> System.out.println("Hello, Hadoop!");

        new Thread(run1).start();
        new Thread(run2).start();
        new Thread(run3).start();
        new Thread(run4).start();
        new Thread(run5).start();
        new Thread(run6).start();
    }
}
