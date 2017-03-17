package homework2_3;

public class Homework2_3 {

    public static void main(String[] args) {
        // Вывод на экран треугольника Паскаля
        // h - высота треугольника
        int h = 5;
        int s = 2 * h - 1;
        System.out.println("Вывод на экран треугольника Паскаля c высотой " + h + " :");
        int[][] m = new int[h][s];
        int u = (s - 1) / 2;
        m[0][(s - 1) / 2] = 1;
        for (int i = 1; i <= (h - 2); i++) {
            for (int j = (u - i); j <= (u + i); j = j + 2) {
                m[i][j] = m[i - 1][j - 1] + m[i - 1][j + 1];
            }
        }
        m[h - 1][0] = 1;
        m[h - 1][s - 1] = 1;
        for (int j = 2; j <= (s - 3); j++) {
            m[h - 1][j] = m[h - 2][j - 1] + m[h - 2][j + 1];
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < s; j++) {
                if (m[i][j] == 0) {
                    System.out.print(" " + " ");
                } else {
                    System.out.print(m[i][j] + " ");
                }
            }
            System.out.println(); // Переходим на следующую строку
        }
    }

}
