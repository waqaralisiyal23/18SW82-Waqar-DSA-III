class LinkedList{
    private Node head;

    public void insert(Object object){
        Node node = new Node(object);
        node.next = null;   //because jo insert krege value wo last mn hugi tou us mn null address huga

        if(head==null){   //if head = null means we are inserting the first object
            head = node;    //so we assign that object to head, and the head's next has null address
        }
        else{     //Now if else executed means we are not inserting the first element
            Node n = head;    //starting from the first node and gives the address of head to n 
            while(n.next!=null){    //If head is not null we will move to the last value which has null
                n=n.next;       //giving address of next value to n and travelling further to next value
            }  //when we reached last value it has null the loop will be terminated 
            n.next=node;   //last object in LinkedList gets the address of the current inserted value
        }
    }

    public void show(){
        if(head!=null){
            Node node = head;    //Assigning the node address of head  
            while(node.next!=null){   //If the current element has no null address it will print that and gives 
                System.out.println(node.getData());      //node the address of next element when it will equal to
                node=node.next;                          //null loop will be terminated and last value has null
            }
            System.out.println(node.getData());       //so printing the last value here
        }
        else{
            System.out.println("Empty LinkedList");
        }    
    }

    public void insertAtStart(Object object){
        //We will make this element the first and it will have the address of the previous first element
        Node node = new Node(object);

        node.next=head;    //previous jo head huga uska address is current inserting node mn ajyega
        head=node;      //ab ye node head hai or iske pas agle object ka address hai
    }

    //inserts the object at specified position
    public void insertAt(int index,Object object){
        Node node = new Node(object);

        if(index==0){
            insertAtStart(object);
        }
        else{
            Node n = head;
            //We have to travel 1 less than index-1 where we put the object
            for(int i=0;i<index-1;i++){
                n=n.next;
            }
            node.next = n.next;   /*n.next mn next value ka address tha jo previous object mn tha humne current value ko 
                                dediya hai q k current value beech mn insert hugi tou jis index pr insert krengy us
                                ke previous object ke pass uska address huga ab jis index pr insert krngy
                                wo ek index agy shift hugi tou uska address jo new Object put krenge uske
                                pas huga tou wo address humne current inserting object ko dediya*/

            n.next = node;        /* or jo previous object tha us mn humne current inserting node ka object dediya
                                ab jis index pr insert krege uske previous node ke pas current node ka addresss
                                hoga or current wale ka pass next node ka uga jiko ek index agy shift kiya hai*/
        }
    }

    public void deleteAt(int index){
        if (head!=null){ 
            if(index==0){
                head=head.next;   //agr head delete krna hai tou head se next element jo hai wo ab head bn jyega
            }
            else{
                Node n=head;
                Node n1=null;
                for(int i=0;i<index-1;i++){
                    n=n.next;
                }
                n1 = n.next;   //jo element delete krna hai uska address n1 ko dediya or n1 ke pas us se next node 
                n.next = n1.next;   //ka address hai wo previous ko dediya or n1 wala address delete hugya
                System.out.println(n1.getData()+" deleted");   //just to verify

                n1=null; //eligible for garbage collection otherwise it will removed from the list but has
                //the address of the deleted value
            }
        }
        else{
            System.out.println("Empty LinkedList");
        }
    }

    public boolean isEmpty(){
        return (head==null);
    }
}