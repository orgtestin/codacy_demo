// Copyright 2016-2018 Diffblue limited. All rights reserved.

package io.diffblue.javademo.nestedobjects.subpackage;

import io.diffblue.javademo.nestedobjects.User;
import org.junit.Assert;
import org.junit.Test;

public class OrderTest {
  @Test
  public void hasItem() {
    Order order = new Order();

    boolean result = order.hasItem();
    Assert.assertFalse(result);
  }

  @Test
  public void checkItemCost() {
    Order order = new Order();
    User user = new User(order);
    Item item = new Item();

    boolean result = user.checkItemCost(item);
    Assert.assertFalse(result);
  }

}
