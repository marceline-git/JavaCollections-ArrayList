import java.util.*;

public class Basics {
    //Iterator loop
    public void loop(ArrayList<String> al) {
        Iterator iter = al.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    //Enumeration loop
    public void enumLoop(ArrayList<String> al) {
        Enumeration<String> e = Collections.enumeration(al);
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
