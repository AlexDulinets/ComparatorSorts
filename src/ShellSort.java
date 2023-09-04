import java.util.Comparator;

public class ShellSort <T> implements Sort<T> {

    @Override
    public void sort(T[] array,Comparator<T> comp) {
        int d = 1;
        while (d <= array.length / 3) {
            d = d * 3 + 1;
        }

        while (d > 0) {
            for (int i = d; i < array.length; i++) {
                T tmp = array[i];
                int j = i;

                while (j > d - 1 && (0 < comp.compare(array[j - d],tmp))/*array[j - d] > tmp*/) {
                    array[j] = array[j - d];
                    j -= d;
                }
                array[j] = tmp;
            }
            d = (d - 1) / 3;
        }
    }
}