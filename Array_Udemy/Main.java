// Main function of insert array
class Main {
    public static void main(String[] args) {
        singledimension obj = new singledimension(7);
        obj.insert(0, 10);
        obj.insert(1, 20);
        obj.insert(2, 30);
        obj.insert(3, 40);
        obj.insert(4, 50);
        obj.insert(12, 40);
        obj.insert(1, 30);

        // Accessing array elements
        // time complexity : O(1)
        // space complexity : O(1)
        var element = obj.arr[0];  // insertElementname.arrayName[index]
        System.out.println(element);
        var element2 = obj.arr[1];
        System.out.println(element2);

        // Array traversal
        System.out.println("Array Traversal : ");
        obj.TraverseArray();

        //Array Searching
        obj.SearchArray(10);
        obj.SearchArray(60);

        // Delete value from array
        obj.DeleteValue(0);
        System.out.println(obj.arr[0]);
        obj.SearchArray(10);
        obj.TraverseArray();  


    }
}