public class LinearSearch{
    //This is a general method for linear search, we can search array of any type
    public static <T> int linearSearch(T []a,T key){
        int i;   //Decalration
        for(i=0;i<a.length;i++){
            if(a[i]==key){
                return i;     //returns the index of value            
            }
        }
        return -i;   //if value not found it will return -ve i
    }
    public static void main(String[]args){
        String []arr={"Waqar","Ahmed","Abdul Nabi","Usama","Imtiaz","Uzair"};  //Initializes the String array
        Character []c = {'a','e','i','o','u'};    //Initializes the Character Array

        String key1="Usama";   //String to search
        char key2='i';         //Character to search

        int index1=linearSearch(arr, key1);   //storing the index of String in index1
        int index2=linearSearch(c, key2);     //storing the index of Character in index2

        if(index1>=0){
            System.out.println("String found in String Array, index is "+index1);  //printing the index of String
        }
        else{
            System.out.println("String not found");
        }

        if(index2>=0){
            System.out.println("Character found in Character Array, index is "+index2);  //printing the index of Char
        }
        else{
            System.out.println("Character not found");
        }

    } 
}