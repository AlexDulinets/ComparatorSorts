import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MainTest {
    @Test
    public void test1() {
        String[] args = {"пРииииииииииииииииииииииииииВит", "пРИееееМ", "предел", "приемный"};
        String abc = "е";
        SelectionSort<String> c1 = new SelectionSort<>();
        c1.sort(args,new SelectComp(abc));
        String[] test = {"пРииииииииииииииииииииииииииВит", "приемный", "предел","пРИееееМ"};
        Assertions.assertEquals(Arrays.toString(test), Arrays.toString(args));
    }

    @Test
    public void test2() {
        String[] args = {"corOva", "ogorod", "dom"};
        ShellSort<String> c2 = new ShellSort<>();
        c2.sort(args,new ShellComp());
        String[] test = {"dom", "corOva", "ogorod"};
        Assertions.assertEquals(Arrays.toString(test), Arrays.toString(args));
    }

    @Test
    public void test3() {
        String[] args = {"ooo", "ozzon", "argone"};
        String abc = "o";
        SelectionSort<String> c1 = new SelectionSort<>();
        c1.sort(args,new SelectComp(abc));
        String[] test = {"argone", "ozzon", "ooo"};
        Assertions.assertEquals(Arrays.toString(test), Arrays.toString(args));
    }
    @Test
    public void test4() {
        String[] args = {"OcurVA", "archON", "da"};
        ShellSort<String> c2 = new ShellSort<>();
        c2.sort(args,new ShellComp());
        String[] test = {"da", "OcurVA", "archON"};
        Assertions.assertEquals(Arrays.toString(test), Arrays.toString(args));
    }
}