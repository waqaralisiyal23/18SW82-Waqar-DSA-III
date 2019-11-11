public class Implementation{
    public static void main(String[]args)
    {
        LinkedList list = new LinkedList();
        System.out.println("Empty: "+list.isEmpty());
        list.show();
        list.deleteAt(2);
        list.insert("Waqar");
        list.insert("Ahmed");
        list.insert("Usama");
        list.insert("Checking");
        list.insertAtStart("Uzair");
        list.insertAt(1,"Abdul Nabi");
        list.deleteAt(5);
        list.insert("Imtiaz");
        list.show();
        System.out.println("Empty: "+list.isEmpty());
        
    }
}