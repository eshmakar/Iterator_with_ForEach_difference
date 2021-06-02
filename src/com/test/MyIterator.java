package com.test;

import java.util.ArrayList;
import java.util.Iterator;

public class MyIterator {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            integerArrayList.add(i);
        }


        Iterator<Integer> iterator = integerArrayList.iterator();
        System.out.println("ITERATOR");
        while (iterator.hasNext()) {
            int element = iterator.next();
            if (element != 5)
                System.out.print(element + " ");
            else iterator.remove();
        }

        System.out.println();
        System.out.println("FOR EACH");
        for (Integer a : integerArrayList) {
            System.out.print(a + " ");
        }
    }
}
/*
    ЧЕМ ОТЛИЧАЕТСЯ ITERATOR ОТ FOREACH?
    - С ПОМОЩЬЮ ITERATOR МОЖНО УДАЛИТЬ ЭЛЕМЕНТЫ, НАПРИМЕР:
      Iterator<Integer> iterator = integerArrayList.iterator();
        while (iterator.hasNext()) { //если есть следующий элемент
            iterator.next(); //переключаемся на этот элемент
            iterator.remove(); //удаляем этот элемент
            System.out.println(iterator.next());
        }

*/
