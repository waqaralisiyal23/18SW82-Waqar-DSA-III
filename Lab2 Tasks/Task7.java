public class Task7{
    public static int removeDuplicates(int []arr){  //method which returns new length of array after removing duplicates
        int j=0;  //initializing j with 0
        for(int i=0;i<arr.length-1;i++){ 
            if(arr[i]!=arr[i+1]){
                arr[j++]=arr[i];   /*We will store elements again by comparing two elements with each other if they are
                                   not same the element will store in the array*/  
            }
        }
        arr[j++] = arr[arr.length-1]; //stores the last element of array

        for(int i=0;i<j;i++){
            System.out.println(arr[i]);
        }
        return j;  //j is the new length of the array
    }
    public static void main(String[]args)
    {
        int []a={20,20,20,30,40,50,50};  //Declaration and initialization of an array
        System.out.println("New Length of Array: "+removeDuplicates(a)); //printing new length
    }
}