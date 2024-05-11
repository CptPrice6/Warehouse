import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MergeSort {

    public void sort(List v, Comparator cmp, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;

        ArrayList<Object> left = new ArrayList<>(mid);
        ArrayList<Object> right = new ArrayList<>(n - mid);

        for (int i = 0; i < mid; i++) {
            left.add(v.get(i));
        }
        for (int i = mid; i < n; i++) {
            right.add(v.get(i));
        }
        sort(left, cmp, mid);
        sort(right, cmp, n - mid);

        merge(v, left, right, mid, n - mid, cmp);

    }

    public void merge(List v, List l, List r, int left, int right, Comparator cmp) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (cmp.compare(l.get(i), r.get(j)) <= 0) {
                v.set(k++, l.get(i++));
            } else {
                v.set(k++, r.get(j++));
            }

        }

        while (i < left) {
            v.set(k++, l.get(i++));
        }
        while (j < right) {
            v.set(k++, r.get(j++));
        }

    }

}
