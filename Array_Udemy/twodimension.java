import java.util.Arrays;

class twodimension {
    public static void main(String[] args) {
        // Time Complexity : O(mn)
        // Space Complexity : O(mn)
        // Declare 2D array
        int [][] int2Darray;
        // Instantiate 2D array
        int2Darray = new int[2][2];
        // Initialize 2D array
        int2Darray[0][0] = 1;
        int2Darray[0][1] = 2;
        int2Darray[1][0] = 4;
        int2Darray[1][1] = 5;
        System.out.println(Arrays.deepToString(int2Darray));

        //Another Method
        // Time Complexity : O(1)
        // Space Complexity : O(mn)
        String array2D[][] = {{"a","b"},{"d","e"}};
        System.out.println(Arrays.deepToString(array2D));


    }
}