import java.util.LinkedList;

public class Linklist {
//    Linkedlist -
//    Doubly Link List
//    Insertion and Deletion

//    *********     Non Generic Version ***********

    public static void main(String[] args) {

        LinkedList l = new LinkedList<> ();
        l.add("mayuri");
        l.add(30);
        l.add (null);
        System.out.println(l);
        l.set(0,"rahul");
        System.out.println(l);
        l.removeLast();
        System.out.println(l);
        l.addFirst("Apple");
        System.out.println(l);


    }




}
