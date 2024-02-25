import javax.management.ListenerNotFoundException;
import java.util.Stack;

public class stackdemo {
    public static void main(String[] args) {
//        *********      STACK      *********
//        LIFO
//        push()
//        pop()
//        peek() - gives top element
//        empty()
//        int search (object) - returns '-1' if  element not present


        Stack<String> s = new Stack<String>();
        s.add("A");
        s.add("B");
        s.add("C");
        System.out.println(s);
        s.pop();
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.search("A"));
        System.out.println(s.empty());


    }
}
