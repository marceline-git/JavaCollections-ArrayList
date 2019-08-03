import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Initialization pattern 01
        ArrayList<String> obj01 = new ArrayList<String>(){{
            add("Dublin");
            add("Tokyo");
            add("Seattle");
        }};

        //Initialization pattern 02
        ArrayList<String> obj02 = new ArrayList<String>(Arrays.asList("Aaron", "Bill", "Brian"));

        //Initialization pattern 03
        ArrayList<String> obj03 = new ArrayList<String>();
        obj03.add("Flint");
        obj03.add("By Fire");
        obj03.add("Landmarks");

        Basics b = new Basics();
        b.loop(obj01);
        b.enumLoop(obj01);

        //Sorting
        ArrayList<Student> memberList = new ArrayList<Student>();
        memberList.add(new Student(30, "Abey"));
        memberList.add(new Student(25, "Vignesh"));
        memberList.add(new Student(20, "Zues"));

        Sort s = new Sort();
        printAL(s.ascendingSort(obj03));
        printAL(s.descendingSort(obj03));

        //Age-order sort
        printStudents(s.comparatorSort(memberList));

        AddAndRemove ar = new AddAndRemove();
        ar.addAll01();
        ar.addAll02();
    }

    private static void printAL(ArrayList al) {
        System.out.println(Arrays.toString(al.toArray()));
    }

    private static void printStudents(ArrayList<Student> al) {
        for(int i=0;i<al.size();i++){
            System.out.format("%s - %d\n", al.get(i).name, al.get(i).age);
        }
    }
}
