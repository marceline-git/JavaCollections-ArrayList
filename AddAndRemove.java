import java.util.ArrayList;

public class AddAndRemove {
    public static void addAll01() {
        // ArrayList1 of String type
        ArrayList<String> al = new ArrayList<String>();
        al.add("Hi");
        al.add("hello");
        al.add("Test");

        al.add(2, "adding");
        System.out.println(al);

        //ArrayList2 of String Type
        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("Text1");
        al2.add("Text2");
        al2.add("Text3");

        //Adding ArrayList2 into ArrayList1
        al.addAll(al2);
        System.out.println("ArrayList1 after addAll01: "+al);
    }
    public static void addAll02() {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Hi");
        al.add("hello");
        al.add("Test");

        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("Text1");
        al2.add("Text2");
        al2.add("Text3");

        //Adding ArrayList2 into ArrayList1
        al.addAll(1, al2);
        System.out.println("ArrayList1 after addAll02: "+al);
    }
}
