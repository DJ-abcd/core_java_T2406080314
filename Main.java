import java.util.ArrayList;
import java.util.Enumeration;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        ArrayList a = new ArrayList();
        a.add("A");
        a.add('a');
        a.add(10);
        System.out.println(a);
        a.remove(2);
        System.out.println(a);
        a.add(2,"M");
        System.out.println(a);
        a.add('n');
        System.out.println(a);


//      3  CURSORS IN JAVA
//       1 Enumeration - vectors tag
//       2. Iterator - Universal Cursor , we can make read and write at same time
//       3. ListIterator

    }
}