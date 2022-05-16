package sample.java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSample {
    public static void main(String[] s) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] array2 = {11, 12, 13, 14, 15, 16, 17, 18, 19};

        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        System.out.println("intstream -> boxed -> collect: " + list);
        List<String> filter = list.stream().filter(i -> i % 2 == 0).map(Object::toString).collect(Collectors.toList());
        System.out.println("stream -> filter -> collect: " + filter);



    }
}
