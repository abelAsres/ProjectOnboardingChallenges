package com.revature.main;

import com.revature.challenges.MyStack;
import com.revature.challenges.SumList;

import java.util.LinkedList;

public class Driver{
  public static void main(String[] args) {
    System.out.println("Test Sum List");
    LinkedList<Integer> numbers1 = new LinkedList<Integer>();
    LinkedList<Integer> numbers2 = new LinkedList<Integer>();

    numbers1.push(7);
    numbers1.push(1);
    numbers1.push(6);

    numbers2.push(5);
    numbers2.push(9);
    numbers2.push(2);

    System.out.println(SumList.sumLists(numbers1,numbers2));


    System.out.println("Test Sum List Reverse");
    LinkedList<Integer> numbers3 = new LinkedList<Integer>();
    LinkedList<Integer> numbers4 = new LinkedList<Integer>();

    numbers3.push(6);
    numbers3.push(1);
    numbers3.push(7);

    numbers4.push(2);
    numbers4.push(9);
    numbers4.push(5);

    System.out.println(SumList.sumListsReverse(numbers3,numbers4));

    System.out.println("Test Min Stack");
    MyStack myStack = new MyStack();

    myStack.push(10);
    myStack.push(1);
    myStack.push(12);
    myStack.push(-13);
    myStack.push(13);

    System.out.println("The min should be -13 and myStack reveals the min as  "+myStack.getMin());
  }
}
