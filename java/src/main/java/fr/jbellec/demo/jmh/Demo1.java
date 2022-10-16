package fr.jbellec.demo.jmh;

import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class Demo1 {
	@Benchmark
	@Measurement(iterations = 20, time = 2000, timeUnit = TimeUnit.MILLISECONDS) // 20 iterations of 2000ms each
	public void benchmarkSomething() {
	   int a = 0;
	   while (a < 100) {
		   a++;
	   }
	   
	}
	
    public static void main(String... args) throws Exception {
        Options opt = new OptionsBuilder()
                .include(Demo1.class.getSimpleName())
                .forks(1)
                .build();
        new Runner(opt).run();
      }    
}
