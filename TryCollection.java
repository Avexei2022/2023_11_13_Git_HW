import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class TryCollection {

    public static void main(String[] args) {
        int list_size_and_bound = 10;
        ArrayList<Integer> my_list = createList(list_size_and_bound);
        System.out.println("Исходный список случайных чисел: " + my_list);
        my_list.removeIf(el -> el % 2 == 0);
        System.out.println("Список с удаленными четными числами: " + my_list);
        System.out.println("Максимальное число: " + Collections.max(my_list));
        System.out.println("Минимальное число: " + Collections.min(my_list));
        System.out.println("Среднее значение: " + my_list.stream()
                                 .mapToInt(a -> a).average().orElse(0));        
}

    private static ArrayList<Integer> createList(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>(n);
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            list.add(i, rand.nextInt(n));
        }
        return list;
    }
}