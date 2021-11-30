package streams;

import java.util.Arrays;
import java.util.List;

public class Q4 {

public static void main(String[] args) {

List<Integer> numbers=Arrays.asList(1,19,33,12,192,141,898);


System.out.println("************Even numbers************");


numbers.stream().filter(n -> n%2==0).forEach(System.out::println);

System.out.println("************ numbers starting with 1************");

numbers.stream().map(n -> n+" ").filter(n ->n.startsWith("1")).forEach(System.out::println);


long n=numbers.stream().count();

System.out.println("Total number of elements:"+n);

System.out.println("************sorted numbers************");

numbers.stream().sorted().forEach(System.out::println);










}

}