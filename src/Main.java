import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        System.out.println(search(2, 3, 4, 333, 444, 555, 5, 6, 6, 4, 2, 3, 4, 6, 7, 4, 3));
    }

    public static int search(int... mas) {
        Arrays.sort(mas);
        int countDifferentElements = 1;
        for (int i = 0; i < mas.length - 1; i++)
            if (mas[i] != mas[i + 1]) {
                countDifferentElements++;
            }
        return countDifferentElements;
    }
}

