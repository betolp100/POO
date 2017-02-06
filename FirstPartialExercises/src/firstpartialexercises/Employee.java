
package firstpartialexercises;
public class Employee {
    private int Id;
    private String firstName;
    private String lastName;
    private int salary;
    
    public Employee (int id, String firstName, String lastName, int salary){
        this.Id=Id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    public int getId(){
        return this.Id;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getName(){
        return this.firstName+ " " + this.lastName; //We are getting the full name of the employee
    }
    public int getSalary(){
        return this.salary*12; //We are getting the salary of the employee
    }
    public int raiseSalary(int percentage){
        this.salary += this.salary * percentage / 100;  //In here we raise the salary of the employee. 
        return this.salary;
    }
    @Override
    public String toString(){
        return "Employee{"+ this.Id+".name = " + this.getName()+ ".salary =" + this.salary + "]";
    }
    
}
