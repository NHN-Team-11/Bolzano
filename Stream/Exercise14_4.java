package Bolzano.Stream;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercise14_4 {
    public static void main(String[] args) {
        String[] strArr = {"aaa", "bb", "c", "dddd"};
        
        Stream<String> stream = Stream.of(strArr);
        
        int count = stream.mapToInt(String::length).max().getAsInt();
        Arrays.stream(strArr).mapToInt(String::length).max().getAsInt();
        
        System.out.println(count);

        IntStream intStream = new Random().ints(1, 46);
        intStream.distinct().limit(6).sorted().forEach(System.out::println);
    
    }
}