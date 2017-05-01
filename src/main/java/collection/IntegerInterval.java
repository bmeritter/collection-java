package collection;


public class IntegerInterval {

  public int[] get_integer_interval(int number_a, int number_b) {
    int[] result;
    int j = 0;
    if (number_a > number_b) {
      int len = number_a - number_b + 1;
      result = new int[len];
      for (int i = number_a; i >= number_b; --i) {
        result[j++] = i;
      }

    } else {
      int len = number_b - number_a + 1;
      result = new int[len];
      for (int i = number_a; i <= number_b; ++i) {
        result[j++] = i;
      }
    }

    return result;
  }
}
