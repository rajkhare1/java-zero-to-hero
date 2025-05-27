package com.rajkhare.java24;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Gatherer;

public class F_ParallelGatherer {

    public static void main(String[] args) {
        Gatherer<Integer, ?, Integer> parallelSum =
                Gatherer.of(AtomicInteger::new,
                        (sum, number, downstream) -> {
                            sum.addAndGet(number);
                            return true;
                        });
    }

}
