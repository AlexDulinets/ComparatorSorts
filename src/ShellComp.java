import java.util.Comparator;

public class ShellComp implements Comparator<String> {
    public int kol = 0;
    public int low = 0;
    int count(String str) {
        low=0;
        for (int j=0;j < str.length();j++){
            if (Character.isLowerCase(str.charAt(j))) {
                low++;
            }
        }
        return low;
    }
    @Override
    public int compare(String o3, String o4) {
        return Integer.compare(count(o3),count(o4));
    }
}
