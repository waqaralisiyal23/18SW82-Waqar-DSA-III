import java.util.Arrays;
public class Task3{
    public static void printArray(long []array){   //method to traverse the array
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }

    public static void main(String[]args)
    {
        long []arr1 = {3,5,6,7,1,10,8};     //Declaration and Initialization of array
        long []arr2 = {6,8,2,5,4,9,11};     //Declaration and Initialization of array

        int key=7;   //Element to search in array1
        
        int index=Arrays.binarySearch(arr1,1,5,key);   //search the element and returns its index
        System.out.println(key+" is present in array and its index is "+index);  //prints the index of searched element

        long []arr3 = Arrays.copyOf(arr2,3);  //It will copy arr2 to index=2 and put these elements in arr3
        System.out.println("Copied 3 elemnts from arr2 to arr3: ");
        printArray(arr3);   //prints the copied array

        
        long []arr4 = Arrays.copyOfRange(arr1,2,6);  //It will copy elements from index 2 to 5 from arr1 to arr4
        System.out.println("Copied elements from index 2 to 5 from arr1 to arr4:");
        printArray(arr4);   //prints the copied array

        if( Arrays.equals(arr1,arr2)){   //if arr1 and arr2 are equal it will return true otherwise false
            System.out.println("arr1 and arr2 are equal");
        }
        else{
            System.out.println("arr1 and arr2 are not equal");
        }

        Arrays.sort(arr1);   //Sorts the array named arr1
        System.out.println("Sorted arr1: ");
        printArray(arr1);   //prints the sorted array

        System.out.println(Arrays.toString(arr2));  //prints the arr2 in String representation 

    }
}