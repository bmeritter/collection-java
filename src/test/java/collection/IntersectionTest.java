package collection;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * 弹出两个集合的交集
 */
public class IntersectionTest {
  @Test
  public void should_return_intersection() {
    int[] collection_a = {10, 27, 28, 19, 5};
    int[] collection_b = {5, 78, 28, 19, 23};
    int[] collection_c = {5, 28, 19};

    Intersection intersection = new Intersection();
    int[] result = intersection.get_intersection(collection_a, collection_b);
    assertArrayEquals(result, collection_c);
  }
}