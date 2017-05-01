package collection;

/**
 * Created by ritter on 17-5-1.
 */
public class IntegerInterval2 {
  public int[] get_integer_interval(int number_a, int number_b) {

    int[] result;
    int j = 0;
    if (number_a == number_b) {
      if (number_a % 2 == 0) {
        result = new int[]{number_a};
        return result;
      } else {
        result = new int[0];
        return result;
      }
    } else if (number_a < number_b) {
      int len = number_b - number_a + 1;
      result = new int[len / 2];
      for (int i = number_a; i <= number_b; ++i) {
        if (i % 2 == 0) {
          result[j++] = i;
        }
      }
    } else {
      int len = number_a - number_b + 1;
      result = new int[len / 2];
      for (int i = number_a; i >= number_b; --i) {
        if (i % 2 == 0) {
          result[j++] = i;
        }
      }
    }
    return result;
  }
}
