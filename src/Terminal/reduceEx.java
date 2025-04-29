package Terminal;

import java.util.Arrays;
import java.util.List;

// There are three variations in reduce method java
//1. reduce(Binary Operator)
public class reduceEx {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        // 1. reduce(Binary Operator)
//        Identity is not used in this variant, so there is a chance to get empty stream.

//        Optional<Integer> result1 = list.stream().reduce((a, b)->a+b);
//        System.out.println(result1);

//        2. reduce(T Identity, BinaryOperator)

//        int result2 = list.stream().reduce(1,(a,b)->a+b);
//        System.out.println(result2);

//        3. reduce(T Identity, Bi-function, Binary Operator)

        int result3 = list.parallelStream().reduce(1,(a,b)-> a+b, Integer::sum);
        System.out.println(result3);
    }
}
