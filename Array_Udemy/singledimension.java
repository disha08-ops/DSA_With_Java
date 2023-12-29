public class singledimension {
    int arr[] = null;

    public singledimension(int sizeofarray) {
        arr = new int[sizeofarray];
        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    // Insertion in an array :
    // O(1) time complexity 
    // O(1) space complexity
    public void insert(int location, int value){
            try {
                if(arr[location] == Integer.MIN_VALUE) {
                    arr[location] = value;
                    System.out.println("The value is inserted successfully !!");
                } else {
                    System.out.println("The space is already occupied !!");
                }

            }catch (ArrayIndexOutOfBoundsException e ) {
                System.out.println("Invalid index to acess array !!");
            }
        }
    
    
    // Array Traversal :
    // Time Complexity : O(n)
    // Space Complexity : O(1)
    public void TraverseArray () {
        try {
            for (int i = 0; i < arr.length; i++) 
            System.out.println(arr[i] + " ");
        } catch(Exception e) {
            System.out.println("Array no longer exists !!");
        }
        
    }

    // Search for an element in the array
    // Time Complexity : O(n)
    // Space Complexity : O(1) 
    public void SearchArray(int valueToSearch) {
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] == valueToSearch) {
                System.out.println("The element is found at index : "+i);
                return;
            }
        }
        System.out.println("The element is not found !!");
    }

    // Delete Value from an array
    // Time Complexity : O(1)
    // Space Complexity : O(1)
    public void DeleteValue(int valueToDeleteIndex) {
        try {
            arr[valueToDeleteIndex] = Integer.MIN_VALUE;
            System.out.println("The value is deleted successfully!!");
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The value provided not in range !!");
        }
    }

}


