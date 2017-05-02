package collection;

/**
 * Created by ritter on 17-5-1.
 */
public class Intersection {
  public int[] get_intersection(int[] collection_a, int[] collection_b) {

    int[] result = new int[3];
    int k = 0;
    for (int i = 0; i < collection_b.length; ++i) {
      for (int j = 0; j < collection_a.length; ++j) {
        if (collection_a[j] == collection_b[i]) {
          result[k++] = collection_a[j];
        }
      }
    }

    return result;
  }
}
