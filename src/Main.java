import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длинну массива");
        int n = Integer.parseInt(scan.nextLine());
        System.out.println("Введите массив");
        String[] arr = new String[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextLine();
        }

        System.out.println("Введите подстроку S");
        String abc = scan.nextLine();
        SelectionSort<String> c1 = new SelectionSort<>();
        c1.sort(arr,new SelectComp(abc));
        //Arrays.sort(arr, c1);
        System.out.println("После сортировки выбором (Selection Sort), по количеству вхождений заданной подстроки " + "["  + abc + "]" + " в строку:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        ShellSort<String> c2 = new ShellSort<>();
        c2.sort(arr,new ShellComp());
        System.out.println("После сортировки по количеству маленьких букв:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}