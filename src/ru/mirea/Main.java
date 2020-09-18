package ru.mirea;



public class Main {

    public static void main(String[] args) {
	// write your code here

       FamilyOfQueues f=new FamilyOfQueues(10);

  System.out.println("До поразрядной сортировки: ");
     f.out();
    f.sort();
     System.out.println("После поразрядной сортировки:");
     f.out();

    }
}
