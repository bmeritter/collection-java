package collection;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * 根据给出的两个数字得到自增的偶数区间
 */
public class IntegerInterval2Test {
  @Test
  public void should_return_integer_interval_1() {
    IntegerInterval2 integerInterval2 = new IntegerInterval2();
    int[] collection_a = {2, 4, 6, 8, 10};
    int[] result = integerInterval2.get_integer_interval(1, 10);
    assertArrayEquals(result, collection_a);
  }

  @Test
  public void should_return_integer_interval_2() {
    IntegerInterval2 integerInterval2 = new IntegerInterval2();
    int[] collection_a = {10, 8, 6, 4, 2};
    int[] result = integerInterval2.get_integer_interval(10, 1);
    assertArrayEquals(result, collection_a);
  }

  @Test
  public void should_return_integer_interval_3() {
    IntegerInterval2 integerInterval2 = new IntegerInterval2();
    int[] collection_a = {10};
    int[] result = integerInterval2.get_integer_interval(10, 10);
    assertArrayEquals(result, collection_a);
  }

  @Test
  public void should_return_integer_interval_4() {
    IntegerInterval2 integerInterval2 = new IntegerInterval2();
    int[] collection_a = {};
    int[] result = integerInterval2.get_integer_interval(5, 5);
    assertArrayEquals(result, collection_a);
  }

}