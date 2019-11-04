class Employee{
    //Instance Variables
    private double salary;
    private int noOfHrPerDay;

    //Setters and getters
    public void setSalary(double salary){
        this.salary=salary;
    }
    public double getSalary(){
        return salary;
    }
    public void setNoOfHrPerDay(int hr){
        noOfHrPerDay=hr;
    }
    public int getNoOfHrPerDay(){
        return noOfHrPerDay;
    }

    //Method to print final salary
    public void getInfo(double salary,int hr){
        System.out.println("Final Salary: $"+salary);
    }

    //Method to increase salary based on monthly salary if it is less than 500$ then 10$ will be added
    public void addSalary(){
        if(salary<500){
            salary+=10;
        }
    }

    //Method to increase salary based on working hours per day if wotking hours>6 then 5$ will be added
    public void addWork(){
        if(noOfHrPerDay>6){
            salary+=5;
        }
    }
}
public class Task1{
    public static void main(String[]args)
    {
        Employee e1 = new Employee();
        e1.setSalary(1000);
        e1.setNoOfHrPerDay(8);
        e1.addSalary();
        e1.addWork();
        e1.getInfo(e1.getSalary(),e1.getNoOfHrPerDay());

        Employee e2 = new Employee();
        e2.setSalary(400);
        e2.setNoOfHrPerDay(5);
        e2.addSalary();
        e2.addWork();
        e2.getInfo(e2.getSalary(),e2.getNoOfHrPerDay());
    }
}