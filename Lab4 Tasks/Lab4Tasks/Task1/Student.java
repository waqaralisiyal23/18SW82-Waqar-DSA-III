class Student extends Person{
    private int rollNo;

    public void setRollNo(int rollNo){
        this.rollNo=rollNo;
    }
    public int getRollNo(){
        return rollNo;
    }

    public void showData(){
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
        System.out.println("Roll No: "+getRollNo());
    }
}