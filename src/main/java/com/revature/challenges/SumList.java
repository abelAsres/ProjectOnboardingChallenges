package com.revature.challenges;

import java.util.LinkedList;

public class SumList {
  /**
   *
   * @param num1 The digits are stored in reverse order, such that the 1 's digit is at the head of the list.
   * @param num2 The digits are stored in reverse order, such that the 1 's digit is at the head of the list.
   * returns summation of the 2 lists
   * */
  public static LinkedList<Integer> sumLists(LinkedList<Integer> num1, LinkedList<Integer> num2){

    int addend1 = 0;
    int addend2 = 0;
    int num1Size = num1.size();
    int num2Size = num2.size();
    LinkedList<Integer> result = new LinkedList<>();


    for(int i =1, j=0; j < num1Size; i*=10,j++){
      addend1+= num1.removeLast()* i;
    }

    for(int i =1, j=0; j < num2Size; i*=10,j++){
      addend2+= num2.removeLast() * i;
    }

    Integer answer = addend1 + addend2;

    for(int i=0;i<answer.toString().length();i++){
      result.add(Character.getNumericValue(answer.toString().charAt(i)));
    }

    return result;
  }

  /**
   *
   * @param num1 The digits are stored in reverse order, such that the 1 's digit is at the end of the list.
   * @param num2 The digits are stored in reverse order, such that the 1 's digit is at the end of the list.
   * returns summation of the 2 lists
   * */
  public static LinkedList<Integer> sumListsReverse(LinkedList<Integer> num1, LinkedList<Integer>num2){

    int addend1 = 0;
    int addend2 = 0;
    int num1Size = num1.size();
    int num2Size = num2.size();
    LinkedList<Integer> result = new LinkedList<>();


    for(int i =1, j=0; j < num1Size; i*=10,j++){
      addend1+= num1.removeFirst()* i;
    }

    for(int i =1, j=0; j < num2Size; i*=10,j++){
      addend2+= num2.removeFirst() * i;
    }

    Integer answer = addend1 + addend2;

    for(int i=0;i<answer.toString().length();i++){
      result.add(Character.getNumericValue(answer.toString().charAt(i)));
    }

    return result;

  }
}
