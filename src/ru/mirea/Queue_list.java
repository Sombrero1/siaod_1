package ru.mirea;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class Queue_list {

    private ListElement head;
    private ListElement tail;
    private int elements;
    private int size;

    Queue_list(int quantity){
        elements=0;//кол-во элементов
        size=quantity;



    }

    void add(int element)
    {
        if(elements+1!=size){

        ListElement a = new ListElement();//новый узел
             a.element=element;
        if(head == null)//Если очередь пустая
        {
            elements++;
            head = a;
            head.next=tail;
            tail = a;
        }
        else {
            elements++;
            tail.next=a;
            tail=tail.next;
        }


        }
        }


    public boolean isFull(){
        if(elements!=size) return false;
        else return true;
    }
    public boolean isEmpty(){
        if(elements==0) return true;
        else return false;
    }


    void del()
    {
        if(head == null) //если очередь пуста
            return;

        poll();


    }
    public int poll(){
        elements--;
        ListElement tmp=head;
        head=head.next;

        return tmp.element;
    }

    @Override
    public String toString() {
        return "Queue_list{" +
                "head=" + head +
                ", tail=" + tail +
                ", elements=" + elements +
                ", size=" + size +
                '}';
    }
}
