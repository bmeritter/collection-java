package collection;

/**
 * Created by ritter on 17-5-2.
 */
public class LetterInterval {
  public String[] get_letter_interval(int a, int b) {
    String[] result;
    int j = 0;
    if (a < b) {
      int len = b - a + 1;
      result = new String[len];
      for (int i = 97 + a - 1; i <= 97 + b - 1; ++i) {
        result[j++] = String.valueOf((char) i);
      }
    } else {
      int len = a - b + 1;
      result = new String[len];
      for (int i = a + 97 - 1; i >= 97 + b - 1; --i) {
        result[j++] = String.valueOf((char) i);
      }
    }


    return result;
  }
}
