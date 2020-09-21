package ru.mirea;



public class Main {

    public static void main(String[] args) {
	// write your code here

       FamilyOfQueues f=new FamilyOfQueues(10);
//
//       Queue_list g=new Queue_list(5);
//       g.add(3);
//        System.out.println(g);
//       g.add(5);
//        System.out.println(g);
//       g.add(6);
//        System.out.println(g);
//       System.out.println(g.poll());
//       System.out.println(g.poll());
//       System.out.println(g.poll());
//       System.out.println(g);


     System.out.println("До поразрядной сортировки: ");
     f.out();
     f.sort();
     System.out.println("После поразрядной сортировки:");
     f.out();

    }
}
