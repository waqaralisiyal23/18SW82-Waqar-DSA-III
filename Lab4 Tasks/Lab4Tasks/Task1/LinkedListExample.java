import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample{
    public static void main(String[]args)
    {
        Student s1 = new Student();    
        s1.setName("Waqar");
        s1.setAge(19);
        s1.setRollNo(82);

        Student s2 = new Student();
        s2.setName("Usama");
        s2.setAge(19);
        s2.setRollNo(52);

        Student s3 = new Student();
        s3.setName("Uzair");
        s3.setAge(18);
        s3.setRollNo(70);

        Student s4 = new Student();
        s4.setName("Imtiaz");
        s4.setAge(17);
        s4.setRollNo(74);

        LinkedList<Student> list1 = new LinkedList<>();
        list1.add(s1);
        list1.add(s2);
        list1.add(s3);
        list1.add(s4);

        //Performing 10 operations on LinkedList
        //Operation1 : To get the first Object
        System.out.println("********First Student********");
        list1.getFirst().showData();

        //Operation2 : To get the last Object
        System.out.println("********Last Student********");
        list1.getLast().showData();

        //Operation3 : To get the specified index Object
        System.out.println("********Student of Specified Index********");
        list1.get(2).showData();

        //Operation4 : Getting the index of specified object
        System.out.println("Index of spcified object: "+list1.indexOf(s3));

        //Operation5 : Adding the object at start
        Student s5 = new Student();
        s5.setName("Ahmed Ali");
        s5.setAge(14);
        s5.setRollNo(56);
        list1.addFirst(s5);

        //Operation6 : Removing the Object at specified index
        list1.remove(0);

        //Operation7 : Putting all the objects in another list and clearing the list1
        LinkedList<Student> list = new LinkedList<>();
        list.addAll(list1);
        list1.clear();

        //Operation8 : Checking the size of both lists
        System.out.println("Size of List1: "+list1.size());
        System.out.println("Size of List2: "+list.size());

        //Operation9: Getting the last object and removing from the list
        list.pollLast().showData();

        //Operation10 : Showing the final list
        System.out.println();

        ListIterator<Student> iter = list.listIterator();
        int i=0;
        while(iter.hasNext()){
            Student s = (Student)iter.next();
            System.out.println("********Student "+(++i)+"********");
            s.showData();
        }



        

        
        
    }
}