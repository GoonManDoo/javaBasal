package com.edu.generic;

//ArrayList<Integer>  이걸 generic이라고 한대
//Type Parameter :
public class Box<T>{ //타입이 정해지지 않아ㅛㅆ는데 박스에 입력값이 있을때 그 값으로 입,출력 선언
 T obj; // 어떤것이든 담을수 있는 필드

 public void setObj(T obj) {
    this.obj = obj;

 }

 public T getObj() {
    return this.obj;
 }
}