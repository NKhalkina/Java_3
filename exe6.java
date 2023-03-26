
/* Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class exe6 {
       public static void main (String[] args){
        ArrayList<Integer> arrayList=new ArrayList<> (Arrays.asList(1,2,5,6,7,8,9,10) );
        System.out.println(arrayList);
        int min = arrayList.get(0);
        int max = arrayList.get(0);
        Integer summ = 0;
        int temp =0;

        for (Integer i: arrayList) {
            summ += i;
            if(i < min) 
                min = i;
            if(i > max) 
                max = i;}
            temp = summ / (arrayList.size()-1);
            
            System.out.println("минимальное число: " + min);
            System.out.println("максимальное число: " + max);
            System.out.println("среднее число: " + temp);
     

        

    }
}
