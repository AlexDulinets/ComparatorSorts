import java.util.Comparator;
public class SelectComp implements Comparator<String> {
    private String abc;
    SelectComp(String abc)
    {
        this.abc=abc;
    }
    int count(String str, String target) {
        return (str.length() - str.replace(target, "").length()) / target.length();
    }
    @Override
    public int compare(String o1, String o2) {
        return Integer.compare(count(o1,abc),count(o2,abc));
    }
}
