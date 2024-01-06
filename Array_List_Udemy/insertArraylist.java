import java.util.*;

class insertArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<Integer>();
        integers.add(12);
        integers.add(13);
        integers.add(1, 11);
        System.out.println(integers);
        System.out.println(integers.get(0));
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("Ram");
        strings.add("Mahi");
        System.out.println(strings);
        ArrayList intstring = new ArrayList();
        intstring.add("Wx12");
        intstring.add("X233");
        System.out.println(intstring);
    }
}