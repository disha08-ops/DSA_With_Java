import java.util.*;

class insertArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<Integer>();
        integers.add(12);
        integers.add(13);
        integers.add(1, 11);
        System.out.println(integers);
        // Accessing array
        System.out.println(integers.get(0));

        // Traverse an array
        for (int i=0; i<integers.size(); i++) {   // for loop
            System.out.println(integers.get(i));
        }

        
        // Delete an array 
        integers.remove(1);
        System.out.println(integers);

        //Search an array
        for (int i=0; i<integers.size(); i++) {
            if(integers.get(i) == 11){
                System.out.println("The element is found at the index no:  " + i);
                return;
            }
        }
        System.out.println("The element not found");




        ArrayList<String> strings = new ArrayList<String>();
        strings.add("Ram");
        strings.add("Mahi");
        strings.add("Shyam");
        System.out.println(strings);
        //Delete from array
        strings.remove("Ram");
        System.out.println(strings);
        for (String people: strings) {          // for each loop
            System.out.println(people);
        }
    

        ArrayList intstring = new ArrayList();
        intstring.add("Wx12");
        intstring.add("X233");
        System.out.println(intstring);
    }
}