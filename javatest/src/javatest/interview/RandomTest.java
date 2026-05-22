package javatest.interview;

import java.util.Random;

/**
 * get 10 Random number 
 * using forEach
 * @author yadav
 *
 */
public class RandomTest {

public static void main(String[] args){

Random random = new Random();
random.ints().limit(10).forEach(System.out::println);

}

}
