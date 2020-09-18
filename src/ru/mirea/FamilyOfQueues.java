package ru.mirea;

import java.util.ArrayList;
import java.util.Arrays;

public class FamilyOfQueues {
    ArrayList<Queue> queues;
    int maxElem=(int)(Math.random()+1)*20;
    int [][] allNumbers;
    FamilyOfQueues(int quantity){
        queues=new ArrayList<>();
        allNumbers = new int[quantity][];

        for (int i = 0; i < quantity ; i++) {
            allNumbers[i]=new int[maxElem];//инициализируем cтолбцы массива для каждой очереди
        }

        for (int i = 0; i < quantity ; i++) {
            Queue ex= new Queue(maxElem);
            ex.generate();//заполняем очередь
            queues.add(ex);
        }


        for (int i = 0; i < queues.size() ; i++) {//заполняем массив
            int j=0;
            while(!queues.get(i).isEmpty()){

                allNumbers[i][j]= queues.get(i).poll();
                j++;

            }

        }

    }

    public void sort(){



        for (int i = 0; i < allNumbers.length; i++) {
           allNumbers[i]=sort(allNumbers[i]);
        }



    }

 public void out(){
     for (int i = 0; i < queues.size() ; i++) {
         System.out.print(i+1+": ");
         for (int j = 0; j < allNumbers[i].length ; j++) {
             System.out.print(allNumbers[i][j] +" ");


         }
         System.out.println();

     }
 }

    public  int[] sort(int[] old) {
        for (int shift = Integer.SIZE - 1; shift > -1; shift--) {
            int[] tmp = new int[old.length];
            int j = 0;

            for (int i = 0; i < old.length; i++) {
                boolean move = old[i] << shift >= 0;


                if (shift == 0 ? !move : move) {
                    tmp[j] = old[i];
                    j++;
                } else {
                    old[i - j] = old[i];
                }
            }

            for (int i = j; i < tmp.length; i++) {
                tmp[i] = old[i - j];
            }

            old = tmp;
        }

        return old;
    }
}
