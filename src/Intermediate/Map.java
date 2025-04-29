package Intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map {
    public static void main(String[] args) {
        List<String> ex = Arrays.asList("one", "two", "three");

//        Converting to uppercase and print the strings

//        ex.stream().map(x-> x.toUpperCase()).forEach(System.out::println);   //Or
        ex.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
