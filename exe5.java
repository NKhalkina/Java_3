/*Пусть дан произвольный список целых чисел, удалить из него чётные числа*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class exe5 {

    public static void main (String[] args){
        ArrayList<Integer> arrayList=new ArrayList<> (Arrays.asList(1,2,5,6,7,8,9,10) );
        System.out.print(arrayList);
        for (int i =arrayList.size()-1; i>=0; i--){
            Integer x = arrayList.get(i);
            if (x %2 == 0){
                arrayList.remove(i);
            }
        }
        System.out.print(arrayList);
    }
}