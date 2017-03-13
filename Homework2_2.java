package homework2_2;

public class Homework2_2 {

    public static void main(String[] args) {
        // Задача про белок 1
        System.out.println("Задание №1");
        int n_sigar = 40;
        boolean workingday = true;
        if (n_sigar < 40) {
            System.out.println("Вечеринка не удалась");
        } else {
            if (n_sigar > 60 && workingday == true) {
                System.out.println("Вечеринка не удалась");
            } else {
                System.out.println("Вечеринка удалась");
            }
        }
        // Задача про ресторан
        System.out.println("Задание №2");
        int m1 = 8;
        int m2 = 1;
        int rez;
        if (m1 <= 2 || m2 <= 2) {
            rez = 0;
        } else {
            if (m1 >= 8 || m2 >= 8) {
                rez = 2;
            } else {
                rez = 1;
            }
        }
        System.out.println("Результат получения столика: " + rez);
        // Задача про белок в парке Шевченко
        System.out.println("Задание №3");
        int temp = 30;
        boolean isSummer = false;
        boolean play;
        if (temp < 20) {
            play = false;
        } else {
            if (temp >= 20 && temp <= 30) {
                play = true;
            } else {
                if (temp <= 50 && isSummer == true) {
                    play = true;
                } else {
                    play = false;
                }
            }
        }
        System.out.println("Белки играют в саду: " + play);
        // Задача про скоростной режим
        System.out.println("Задание №4");
        int speed = 80;
        boolean birthday = false;
        int rezult;
        if (speed <= 60) {
            rezult = 0;
        } else {
            if (speed > 60 && speed <= 65 && birthday == true) {
                rezult = 0;
            } else {
                if (speed >= 61 && speed <= 80) {
                    rezult = 1;
                } else {
                    if (speed >= 81 && speed <= 85 && birthday == true) {
                        rezult = 1;
                    } else {
                        rezult = 2;
                    }
                }
            }
        }
        System.out.println("Результат остановки ГАИ: " + rezult);
        System.out.println("Задание №5");
        int a_5 = 9;
        int b_5 = 20;
        int sortaSum = a_5 + b_5;
        if (sortaSum >= 10 && sortaSum <= 19) {
            sortaSum = 20;
        }
        System.out.println("sortaSum = " + sortaSum);

        // Задачи про массивы
        System.out.println("Задание про массивы №1:");
        int[] mas1 = {1, 2, 3, 4, 5, 6, 7, 8};
        if (mas1[0] == 6 || mas1[mas1.length - 1] == 6) {
            System.out.println("В начале или конце массива стоит число 6");
        } else {
            System.out.println("В начале или конце массива не стоит число 6");
        }
        System.out.println("Задание про массивы №2:");
        int[] mas_a = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] mas_b = {1, 2, 3, 4, 8};
        boolean mas_a_b;
        if (mas_a[0] == mas_b[0] && mas_a[mas_a.length - 1] == mas_b[mas_b.length - 1]) {
            mas_a_b = true;
        } else {
            mas_a_b = false;
        }
        System.out.println("Совпадение первых и последних элементов в массивах а и b: " + mas_a_b);
        System.out.println("Задание про массивы №3:");
        int[] mas_3 = {1, 2, 3};
        int[] mas_3_reverse = new int[mas_3.length];
        for (int i = 0; i <= mas_3.length - 1; i++) {
            mas_3_reverse[i] = mas_3[mas_3.length - 1 - i];
        }
        System.out.println("Новый массив с элементами в обратном порядке:");
        for (int i = 0; i <= mas_3_reverse.length - 1; i++) {
            System.out.print(mas_3_reverse[i] + " ");
        }
        System.out.println(); // Переходим на следующую строку
        System.out.println("Задание про массивы №4:");
        int[] mas_4 = {2, 2, 3, 4, 8, 6, 9, 8};
        int min_4 = mas_4[0];
        int max_4 = mas_4[0];
        for (int i = 1; i <= mas_4.length - 1; i++) {
            if (mas_4[i] > max_4) {
                max_4 = mas_4[i];
            }
        }
        for (int i = 1; i <= mas_4.length - 1; i++) {
            if (mas_4[i] < min_4) {
                min_4 = mas_4[i];
            }
        }
        System.out.println("Cамый большой элемент массива: " + max_4);
        System.out.println("Cамый маленький элемент массива: " + min_4);
        System.out.println("Разница между самым большим и самым маленьким элементом массива: " + (max_4 - min_4));
        System.out.println("Задание про массивы №5:");
        int[] mas_5 = {2, 2, 8, 12};
        int min_5 = mas_5[0];
        int max_5 = mas_5[0];
        int sum_5 = 0;
        for (int i = 1; i <= mas_5.length - 1; i++) {
            if (mas_5[i] > max_5) {
                max_5 = mas_5[i];
            }
        }
        for (int i = 1; i <= mas_5.length - 1; i++) {
            if (mas_5[i] < min_5) {
                min_5 = mas_5[i];
            }
        }
        for (int i = 0; i <= mas_5.length - 1; i++) {
            sum_5 = sum_5 + mas_5[i];
        }
        System.out.println("Максимальное значение массива: " + max_5);
        System.out.println("Минивальное значение массива: " + min_5);
        System.out.println("Центральное среднее массива: " + ((sum_5 - min_5 - max_5) / (mas_5.length - 2)));
        System.out.println("Задание про массивы №6:");
        int[] mas_6 = {2, 1, 1, 2, 1};
        int sum_6 = 0;
        boolean canBalance = false;
        for (int i = 0; i <= mas_6.length - 1; i++) {
            sum_6 = sum_6 + mas_6[i];
        }
        int sum_6_1 = 0;
        for (int i = 0; i <= mas_6.length - 1; i++) {
            if ((sum_6_1 + mas_6[i]) == (sum_6 - mas_6[i] - sum_6_1)) {
                canBalance = true;
            }
            sum_6_1 = sum_6_1 + mas_6[i];
        }
        System.out.println("canBalance: " + canBalance);
    }
}
