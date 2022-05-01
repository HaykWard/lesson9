/* Написать метод высшего порядка Reduce (пишем свою, не пользуемся готовым), которая принимает лямбду
принимающую два аргумента и массив типа int.

Метод должен выполнить указанную лямбду на переданном массиве таким образом:

пример лямбды: (x, y) -> x + y
пример массива [1, 2, 3, 4, 5]
результат 15

пример работы:
1 шаг: В лямбду передается x=1, y=2 результат 3
2 шаг: В лямбду передается x=3 (результат предыдущего вызова функции), y=3 результат 6
3 шаг: В лямбду передается x=6 (результат предыдущего вызова функции), y=4 результат 10
4 шаг: В лямбду передается x=10 (результат предыдущего вызова функции), y=5 результат 15

таким образом результатом работы Reduce стало 15

должно работать с разными лямбдами, принимающими 2 аргумента и разными массивами типа int*/

package lesson9;

public class hw {

    public static void main(String [] args){

        Integer[] digits = new Integer[]{1,2,3,4,5};

        Func func = Integer::sum;

        System.out.println(reduce(func, digits ));

    }

    public static int reduce(Func f, Integer[] param){

        int y;
        int x = 0;

        for(int i = 0; i<param.length; i++){
             x += (y =  param [i]);
        }
        return x;
    }
}
