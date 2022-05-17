package com.revature.challenges;

import java.util.Stack;

public class MyStack {
  Stack<Integer> elements = new Stack<>();
  Integer minItem;

  public Integer push(Integer item) {
    if(elements.isEmpty()){
     setMin(item);
    }else{
      if(isMin(item)){
        setMin(item);
      }
    }
    return elements.push(item);
  }

  public Integer pop(Integer num) {
    elements.remove(num);
    if(num == getMin()){
      findMin();
    }
    return num;
  }

  public void setMin(Integer item){
    minItem = item;
  }

  public boolean isMin(Integer item) {
    return item < minItem;
  }

  public Integer getMin() {
    return minItem;
  }

  public void findMin(){
    int newMin = Integer.MAX_VALUE;
    for(int i = 0; i < elements.size(); i++){
      if(elements.get(i) < newMin){
        newMin = elements.get(i);
      }
    }
    setMin(newMin);
  }
}
