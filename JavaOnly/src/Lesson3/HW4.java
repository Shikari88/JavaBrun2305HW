package Lesson3;

import java.util.Arrays;

/*
    Задание со "звездочкой"
    Внутри класса HW4 написать метод quadraticEq в классе HW4, который принимает три дробных числа a, b и c
    и решает квадратное уравнение
    Тип возвращаемого значения - массив дробных чисел
    (возможно три варианта: 0 корней, 1 корень и 2 корня,
    в зависимости от того какой вариант, столько и должно быть элементов в массиве)
    Например, аргументы 1 2 1 должны привести к массиву {-1},
    потому что у x*x+2*x+1=0 только 1 корень = -1
    Аргументы 1 7 12 должны привести к массиву {-3, -4},
    потому что x*x+7*x+12=0 имеет два решения -3 и -4
    В psvm проверить работу метода на примерах или любых других значениях
    Результат работы метода выводить с помощью Arrays.toString()
     */
public class HW4 {
    static double[] doubles(double a, double b, double c){

        double D = b * b - 4 * a * c;
        if(D > 0) {
            double x1, x2;
            x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = (-b - Math.sqrt(D)) / (2 * a);
            return new double[] {x1, x2};
        } else if(D == 0) {
            double x;
            x = -b / (2 * a);
            return new double[]{x};
        } else {
            return new double[]{};
        }
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(doubles(1,2,1)));
        System.out.println(Arrays.toString(doubles(1,7,12)));
    }
}
