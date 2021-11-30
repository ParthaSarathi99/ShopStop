package streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Avg {

public static void main(String[] args) {

List<Integer> numbers=Arrays.asList(9,95,44,111,45,96,108);

int n= numbers.stream().max(Integer::compare).get();

System.out.println("maximum number:"+n);

int p= numbers.stream().min(Integer::compare).get();

System.out.println("minimum number:"+p);

int sum=numbers.stream().mapToInt(i -> i).sum();

System.out.println("sum of number:"+sum);


}

}
