package stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListStream {

	public static void main(String[] args) {

		Integer[] myArray = { 1, 7, 9, 8, 5, 4, 3, 11, 22, 64, 99 };
		List<Integer> myList = Arrays.asList(myArray);

		Stream<Integer> myStream = myList.stream();
		Stream<Integer> mySquaredStream = myStream.map((n) -> n * n);
		Object mySquaredList = mySquaredStream.collect(Collectors.toList());

		System.out.println(mySquaredList);

		List<Integer> mySquaredStream1 = myList.stream().map((n) -> n * n).collect(Collectors.toList());
		System.out.println(mySquaredStream1);

		List<Integer> myEvenStream = myList.stream().filter((n) -> n % 2 == 0).collect(Collectors.toList());
		System.out.println(myEvenStream);

	}
}
