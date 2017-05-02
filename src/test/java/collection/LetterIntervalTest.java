package collection;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by ritter on 17-5-2.
 */
public class LetterIntervalTest {

  @Test
  public void should_return_letter_interval_1() {
    String[] collection_a = {"a", "b", "c", "d", "e"};
    LetterInterval letterInterval = new LetterInterval();
    String[] result = letterInterval.get_letter_interval(1, 5);
    assertArrayEquals(result, collection_a);
  }

  @Test
  public void should_return_letter_interval_2() {
    String[] collection_a = {"e", "d", "c", "b", "a"};
    LetterInterval letterInterval = new LetterInterval();
    String[] result = letterInterval.get_letter_interval(5, 1);
    assertArrayEquals(result, collection_a);
  }

  @Test
  public void should_return_letter_interval_3() {
    String[] collection_a = {"e"};
    LetterInterval letterInterval = new LetterInterval();
    String[] result = letterInterval.get_letter_interval(5, 5);
    assertArrayEquals(result, collection_a);
  }

}