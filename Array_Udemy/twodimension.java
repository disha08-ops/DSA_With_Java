import java.util.Arrays;

public class twodimension {
    int arr[][] = null;

    public twodimension(int noOfRows, int noOfColumns) {
        arr = new int[noOfRows][noOfColumns];
        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[0].length; col++) {
                arr[row][col] = Integer.MIN_VALUE;
            }
        }
    }


    // Inserting in a 2D Array
    public void insert2D(int row, int col, int valuetoInsert) {
        try {
            if(arr[row][col] == Integer.MIN_VALUE){
                arr[row][col] = valuetoInsert;
                System.out.println("The value is inserted successfully!!");
            }else {
                System.out.println("The space is already occupied!!");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index for 2D array");
        }

    }

    // Delete in 2D array
    public void delete2D(int delRow, int delCol) {
        try {
            arr[delRow][delCol] = Integer.MIN_VALUE;
            System.out.println("The value is deleted successfully!!");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index for 2D array");
        }
    }

    // Array Traversal 
    public void TraverseArray2D() {
        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[0].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

    // Searching 
    public void SearchArray2D (int valueToSearch) {
        for(int row = 0; row<arr.length; row++) {
            for(int col=0; col<arr[0].length; col++) {
                if(arr[row][col] == valueToSearch) {
                        System.out.println("The element is found at index"+" "+row+" row "+col+" col");
                        return;
                }
            }
            System.out.println("The element is not found!!");
        }
    }

    // Accessing cell 
    public void accessCell(int row, int col) {
        System.out.println("Accessign row :  "+ row + " and accessign col :  "+col);
        try {
            System.out.println("The cell value is : " + arr[row][col]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index for 2D array");
        }
    }

    // Main Function
    public static void main(String[] args) {
            twodimension obj = new twodimension(3,3);
            obj.insert2D(1,1,190);
            obj.insert2D(1,1,200);
            obj.insert2D(0,0,300);
            obj.insert2D(1,0,400);
            obj.insert2D(2,0,500);
            System.out.println(Arrays.deepToString(obj.arr));

            obj.delete2D(1,1);
            System.out.println(Arrays.deepToString(obj.arr));

            System.out.println("Array Traversal : ");
            obj.TraverseArray2D();

            obj.SearchArray2D(300);

            obj.accessCell(0, 0);

    }

}
