package com.ran.java8;

import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by ranjithrajd on 20/11/15.
 */

public class StreamSample {
    public static void main(String[] args) {
        Stream.of("r", "a", "b").collect(Collectors.toCollection(LinkedList::new)).descendingIterator().forEachRemaining(System.out::print);
    }
}
