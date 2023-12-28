// Insertion in an array 

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
    
    
        // public static void main(String[] args) {
        //     singledimension obj = new singledimension(5);
        //     obj.insert(0, 10);
        //     obj.insert(1, 20);
        //     obj.insert(2, 30);
        //     obj.insert(1, 40);
        //     obj.insert(4, 50);
        // }
    }


