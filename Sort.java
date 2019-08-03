import java.util.ArrayList;
import java.util.Collections;

public class Sort {
    public ArrayList ascendingSort(ArrayList al) {
        Collections.sort(al);
        return al;
    }
    public ArrayList descendingSort(ArrayList al) {
        Collections.sort(al, Collections.reverseOrder());
        return al;
    }

    public ArrayList<Student> comparatorSort(ArrayList<Student> al) {
        Collections.sort(al, new StudentComparator());
        return al;
    }
}