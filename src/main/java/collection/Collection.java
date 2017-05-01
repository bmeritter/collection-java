package collection;

public class Collection {
  public int[] collect_all_even(int[] collection_a) {
    int[] result = new int[2];
    int j = 0;
    for (int i = 0; i < collection_a.length; ++i) {
      if (collection_a[i] % 2 == 0) {
        result[j++] = collection_a[i];
      }
    }
    return result;
  }

  public int collect_last_element(int[] collection) {

    return collection[collection.length - 1];
  }
}
