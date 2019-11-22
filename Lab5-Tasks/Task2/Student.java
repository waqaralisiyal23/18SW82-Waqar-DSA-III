class Student extends Person implements Comparable<Student>{
    private int rollNo;

    public void setRollNo(int r){
        rollNo=r;
    }
    public int getRollNo(){
        return rollNo;
    }
    public void showData(){
        System.out.println("Name: "+super.getName());
        System.out.println("Age: "+super.getAge());
        System.out.println("Roll No: "+getRollNo());
    }
    public boolean equals(Student other){
        return this.getRollNo()==other.getRollNo();
    }
    public int compareTo(Student other){
        if(this.equals(other))
            return 0;
        else if(getRollNo()>other.getRollNo())
            return 1;
        else if(getRollNo()<other.getRollNo())
            return -1;
        return -2;   //just for avoiding error
    }
}