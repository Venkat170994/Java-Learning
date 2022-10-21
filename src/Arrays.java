import java.util.*;
import java.io.*;
class Arrays {
    static void min(int a[]) {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println("The Minimum value is:" + min);
    }

    static int[] get() {
        return new int[]{10, 30, 50, 90, 60};
    }

    public static void main(String[] args) {

        /**********Single Dimensional Array*********************/
        int[] array = new int[10]; //declaring and initializing an array
        int a[] = {10, 20, 30, 40, 5};

        for (int i = 0; i < a.length; i++)//length is the property of array
            System.out.println(a[i]);
        for (int i : a) {
            System.out.println(i);
        }

        min(a); //passing array to method
        min(new int[]{1, 2, 4, 0, 4}); //passing anonymous array to method

        int[] b = get(); //calling method which returns an array
        for (int i : b) {
            System.out.println(i);
        }


        /**********Multi Dimensional Array*********************/

        int arr[][] = {{1, 2, 3}, {2, 4, 5}, {4, 4, 5}};
            //printing 2D array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}