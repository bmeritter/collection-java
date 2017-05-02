package collection;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * 求并集
 */
public class UnionTest {
  @Test
  public void should_return_two_array_union() {
    int[] collection_a = {10, 27, 28, 19, 5};
    int[] collection_b = {5, 78, 28, 19, 23};
    int[] collection_c = {10, 27, 28, 19, 5, 78, 23};

    Union union = new Union();
    int[] result = union.get_union(collection_a, collection_b);
    assertArrayEquals(result, collection_c);


  }

}