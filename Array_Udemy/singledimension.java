// Insertion in an array 
// O(1) time complexity 

public class singledimension {
    int arr[] = null;

    public singledimension(int sizeofarray) {
        arr = new int[sizeofarray];
        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

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
    
    
    // Array Traversal
    public void TraverseArray () {
        try {
            for (int i = 0; i < arr.length; i++) 
            System.out.println(arr[i] + " ");
        } catch(Exception e) {
            System.out.println("Array no longer exists !!");
        }
        
    }

    }


