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

  public Integer pop(Integer item) {
    return elements.pop();
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
}
