package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ritter on 17-5-2.
 */
public class Union {
  public Object[] get_union(int[] collection_a, int[] collection_b) {

    List list = new ArrayList();
    for (int a : collection_a) {
      list.add(a);
    }
    for (int b : collection_b) {
      if (!list.contains(b)) {
        list.add(b);
      }
    }
    return list.toArray();

  }
}
