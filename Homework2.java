package homework2;

public class Homework2 {

    public static void main(String[] args) {
        int x = 3;
        int[][] m = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("Матрица:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println(); // Переходим на следующую строку
        }
        System.out.println("Все элементы матрицы выше побочной диагонали, включая диагональ:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i + j < x) {
                    System.out.print(m[i][j] + " ");
                }
            }
            System.out.println(); // Переходим на следующую строку
        }
        System.out.println("Все элементы матрицы выше побочной диагонали:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i + j < x - 1) {
                    System.out.print(m[i][j] + " ");
                }
            }
            System.out.println(); // Переходим на следующую строку
        }
        System.out.println("Все элементы матрицы ниже главной диагонали, включая диагональ:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i >= j) {
                    System.out.print(m[i][j] + " ");
                }
            }
            System.out.println(); // Переходим на следующую строку
        }
        System.out.println("Все элементы матрицы ниже главной диагонали:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i > j) {
                    System.out.print(m[i][j] + " ");
                }
            }
            System.out.println(); // Переходим на следующую строку
        }
        System.out.println("Все элементы матрицы ниже побочной диагонали, включая диагональ:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i + j < x - 1) {
                    System.out.print(" " + " ");
                } else {
                    System.out.print(m[i][j] + " ");
                }
            }
            System.out.println(); // Переходим на следующую строку
        }
        System.out.println("Все элементы матрицы ниже побочной диагонали:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i + j <= x - 1) {
                    System.out.print(" " + " ");
                } else {
                    System.out.print(m[i][j] + " ");
                }
            }
            System.out.println(); // Переходим на следующую строку
        }
        System.out.println("Все элементы матрицы выше главной диагонали, включая диагональ:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i > j) {
                    System.out.print(" " + " ");
                } else {
                    System.out.print(m[i][j] + " ");
                }
            }
            System.out.println(); // Переходим на следующую строку
        }

        System.out.println("Все элементы матрицы выше главной диагонали:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i >= j) {
                    System.out.print(" " + " ");
                } else {
                    System.out.print(m[i][j] + " ");
                }
            }
            System.out.println(); // Переходим на следующую строку
        }
        // Вывод на экран равнобедренного треугольника
        // h - высота треугольника
        int h = 16;
        int s = 2 * h - 1;
        System.out.println("Вывод на экран равнобедренного треугольника c высотой " + h + " :");
        int[][] m2 = new int[h][s];

        for (int i = h - 1; i >= 0; i--) {
            int q = h - 1 - i;
            int w = i + h - 1;
            for (int j = q; j <= w; j++) {
                m2[i][j] = 1;
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < s; j++) {
                if (m2[i][j] < 1) {
                    System.out.print(" " + " ");
                } else {
                    System.out.print(m2[i][j] + " ");
                }
            }
            System.out.println(); // Переходим на следующую строку
        }
    }
}
