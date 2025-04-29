package StreamEx;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// Stream Example
public class Example1 {
    public static void main(String[] args) {
        List<Integer>nums = Arrays.asList(1,2,3,4,5);

//        Creating stream
        Stream<Integer> data = nums.stream();

//        If stream is used once, it can't be reused.Here the data was processed and stream was closed.
//        data.forEach(n-> System.out.println(n));

        int result = data.reduce(0,(a,b) -> a+b);
        System.out.println(result);


//        Both won't work, so I commented the below one.
//        data.forEach(n-> System.out.println(n));
    }
}
