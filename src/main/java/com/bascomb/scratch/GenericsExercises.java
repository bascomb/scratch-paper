//package com.bascomb.scratch;
//
//import java.util.Collection;
//import java.util.List;
//import java.util.function.Predicate;
//
///**
// *
// */
//public class GenericsExercises {
//
//    //count elements in generic collection
//    public static <T> int count(Collection<T> collection) {
//        return collection.size();
//    }
//
//    //2. Will not compile because type T can't be assumed to be evaluated as such.
//
//    //exchange position in array
//    public static <T> void exchange(T[] array, int pos1, int pos2) {
//        T temp = array[pos1];
//        array[pos1] = array[pos2];
//        array[pos2] = temp;
//    }
//
//    //4. The compiler erases all type parameters at compile time but replaces the type parameters with the checkable value.
//
//    //5
//    public class Pair {
//
//
//    }
//
//    //6
//    public static int findFirstGreaterThan(Integer[] at, Integer elem) {
//        return 0;
//    }
//
//    //7 will compile because the list extends Number and element of list is always Number so System.out.print(n + " ") can be converted to String.
//
//    //8 find max element in range of list
//    public static <E> E max(List<? super E> list, int begin, int end) {
//       return list.subList(begin,end).stream().max((o1, o2) -> return 0;);
//    }
//
//    //9
//    //The class will not compile bc the static field instance is generic. A static field belongs to a class that is
//    // generic so what would be the type for new instances? If it is generic then it can be multiple but that is not allowed.
//
//    //10
//    //Can you assign a Circle to a Shape. A Circle is a shape. A Node of Shape is not a node of circle but you can still compile but can only do Node of Shape things.
//
//    //11
//
//    //12
//    //invocation
//    int begin = 0;
//    int end = 0;
//    List<Integer> list;
//    Predicate<Integer> pred = (a, b) -> return a % b == 0;
//    //Unary means one Operation. Predicate is a Java Type used in Java 8 Streams API to apply operations. So Unary PRedicate is a
//    //a functional interface. It contains several methods for comparison.
//    //So unary predicate just means one operation. We can infer the method will take two parameters (The numbers to be gcd'd" and will return a boolean that tells us
//    //if gcd is one or not
//    int x = findFirst(list, begin, end, pred );
//
//
//}
