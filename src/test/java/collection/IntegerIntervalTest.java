package collection;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 根据给出的两个数字得到一个自增1的数字区间
 */
public class IntegerIntervalTest {
  @Test
  public void should_return_integer_interval_1() {
    IntegerInterval integerInterval = new IntegerInterval();
    int[] collection_a = {1, 2, 3, 4, 5};
    int[] result = integerInterval.get_integer_interval(1, 5);
    assertArrayEquals(result, collection_a);
  }

  @Test
  public void should_return_integer_interval_2() {
    IntegerInterval integerInterval = new IntegerInterval();
    int[] collection_a = {5, 4, 3, 2, 1};
    int[] result = integerInterval.get_integer_interval(5, 1);
    assertArrayEquals(result, collection_a);
  }

  @Test
  public void should_return_integer_interval_3() {
    IntegerInterval integerInterval = new IntegerInterval();
    int[] collection_a = {5};
    int[] result = integerInterval.get_integer_interval(5, 5);
    assertArrayEquals(result, collection_a);
  }
}