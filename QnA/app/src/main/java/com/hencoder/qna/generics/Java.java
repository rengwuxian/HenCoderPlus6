package com.hencoder.qna.generics;

import java.util.ArrayList;
import java.util.List;

public class Java {
  List<? super Shop<? extends Fruit>> shops = new ArrayList<Shop<? extends Object>>();
  List<? super Shop<? extends Apple>> shops1 = new ArrayList<Shop<Object>>();

  void doSomething() {
    ? extends Fruit 是 Object 的子类吗？
    ? super Shop<? extends Apple> 的取值可以是 Shop<? extends Object> 可以是 Shop<? extends Fruit>;
    Shop<Object> objectShop;objectShop 卖 Apple 卖 Banana;
    Shop<Banana>;
    Shop<? extends Fruit> shop = new Shop<Apple>();
    List<Shop<? extends Fruit>> shopList = new ArrayList<Shop<Apple>>();
  }
}
