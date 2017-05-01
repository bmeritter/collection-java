package collection;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CollectionTest {

  @Test
  public void should_return_all_oven() {
    Collection collection = new Collection();
    int[] collection_a = {1, 2, 3, 4, 5};
    int[] expected = {2, 4};
    int[] result = collection.collect_all_even(collection_a);
    assertArrayEquals(result, expected);

  }

  @Test
  public void should_return_last_element() {
    Collection collection = new Collection();
    int[] col = {1, 2, 3, 4, 5};
    int result = collection.collect_last_element(col);
    assertThat(result,is(5));
  }
}