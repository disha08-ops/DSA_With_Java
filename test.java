

public class test {
    int arr[] = null;

    public test(int sizeofarray) {
        arr = new int[sizeofarray];
        for(int i = 0; i<arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location, int value) {
        try {
            if(arr[location] == Integer.MIN_VALUE) {
                arr[location] = value;
                System.out.println("Successfully Inserted");
            }else {
                System.out.println("The space is already occupied");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to acess array");

        }
    }

    public void TraverseArray() {
        try {
            for (int i=0; i<arr.length; i++) 
            System.out.println(arr[i] + " ");
        }catch (Exception e) {
            System.out.println("Array no longer exists");
        }
    }

    public static void main(String[] args) {
        test obj = new test(7);
        obj.insert(0, 10);
        obj.insert(1, 20);
        obj.insert(2, 30);
        obj.insert(3, 40);
        obj.insert(4, 50);
        obj.insert(12, 40);
        obj.insert(1, 30);

        var element = obj.arr[0];
        System.out.println(element);
        var element2 = obj.arr[1];
        System.out.println(element2);

        System.out.println("Array Traversal : ");
        obj.TraverseArray();
    }


}