package fr.jbellec.demo.jmh;

import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

@State(Scope.Thread)
public class JMHSortBenchmark {

    List<Integer> arrayList;

    int[] array;

    Random random;

    @Setup(Level.Trial)
    public void init() {
        random = new Random();
        array = new int[1000];
        arrayList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            int randomNumber = random.nextInt();
            array[i] = randomNumber;
            arrayList.add(Integer.valueOf(randomNumber));
        }
    }

    @Benchmark
    public void arraysSort() {
        Arrays.sort(array);
    }

    @Benchmark
    public void collectionsSort() {
        Collections.sort(arrayList);
    }

    public static void main(String[] args) throws RunnerException {

        //		Options options = new OptionsBuilder()
        //				.include(JMHSortBenchmark.class.getSimpleName()).threads(1)
        //				.forks(1).shouldFailOnError(true).shouldDoGC(true)
        //				.jvmArgs("-server").build();
        Options options = new OptionsBuilder().include(JMHSortBenchmark.class.getSimpleName()).forks(1).warmupIterations(10).measurementIterations(10).mode(Mode.AverageTime)
            .timeUnit(TimeUnit.MILLISECONDS).build();
        new Runner(options).run();

    }
}
