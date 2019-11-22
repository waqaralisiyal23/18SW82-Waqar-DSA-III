import java.util.*;
public class Task2{
    public static void main(String[]args)
    {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();

        s1.setName("Waqar");
        s1.setAge(19);
        s1.setRollNo(82);

        s2.setName("Usama");
        s2.setAge(19);
        s2.setRollNo(52);

        s3.setName("Uzair");
        s3.setAge(18);
        s3.setRollNo(70);

        s4.setName("Imtiaz");
        s4.setAge(16);
        s4.setRollNo(74);

        s5.setName("Mudassir");
        s5.setAge(18);
        s5.setRollNo(68);

        Queue<Student> queue = new PriorityQueue<Student>();

        queue.add(s1);
        queue.add(s2);
        queue.add(s3);
        queue.add(s4);
        queue.add(s5);

        //Students have priorities according to rollNo in ascending order. Lower the rollNo higher the priority
        //Operation 1
        System.out.println("*****First Student*****");
        queue.element().showData();
        //Operation 2
        System.out.println("*****First Student*****");
        queue.peek().showData();
        //Operation 3 
        System.out.println("*****Removed Student*****");
        queue.poll().showData();
        //Operation 4
        System.out.println("*****Removed Student*****");
        queue.remove().showData();
        //Operation 5
        System.out.println("Size: "+queue.size());
        //Operation 6
        System.out.println("isEmpty: "+queue.isEmpty());
        //Operation 7
        Queue<Student> queue2 = new PriorityQueue<>();
        queue2.addAll(queue);
        //Operation 8
        queue.clear();
        //Operation 9
        System.out.println("Contains s4: "+queue2.contains(s4));
        //Operation 10
        
        int i=1;
        while(!queue2.isEmpty()){
            System.out.println("*****Student "+i+"*****");
            queue2.remove().showData();
            i=i+1;
        } 


    }
}