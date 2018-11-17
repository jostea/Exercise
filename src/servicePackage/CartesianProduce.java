package servicePackage;

import java.util.*;
import java.util.stream.Collectors;

public class CartesianProduce {

    public static void main(String[] args) {
        List<Integer> listOfInteger = new ArrayList<>();
        listOfInteger.add(1);
        listOfInteger.add(2);
        listOfInteger.add(3);
        listOfInteger.add(4);
        listOfInteger.add(5);

        List<Character> lisOfChar = new ArrayList<>();
        lisOfChar.add('a');
        lisOfChar.add('b');
        lisOfChar.add('c');
        lisOfChar.add('d');


//        List<String> integerToString = listOfInteger.stream()
//                .map(Object::toString).collect(Collectors.toList());
//
//        List<List<String>> cartesianProduct = lisOfChar.stream()
//                .map(Object::toString).map(String::toUpperCase)
//                .map(s1 -> integerToString.stream().map(s2 -> s1 + s2).collect(Collectors.toList()))
//                .collect(Collectors.toList());
//
//        cartesianProduct.forEach(System.out::println);



        Count count = new Count();
        count.counting(listOfInteger, lisOfChar).forEach(System.out::println);
    }
}

class Count<T> {

    public List<List<String>> counting(List<T> list1, List<T> list2) {
        return list1.stream()
                .map(Object::toString).map(String::toUpperCase)
                .map(s1 -> list2.stream().map(s2 -> s1 + s2).collect(Collectors.toList()))
                .collect(Collectors.toList());
    }


}