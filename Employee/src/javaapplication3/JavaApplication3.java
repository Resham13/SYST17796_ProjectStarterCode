
package javaapplication3;

public class JavaApplication3 {

  
    public static void main(String[] args) {
     
        Employee [] employees = new Employee [2]; 
        
        employees[0]=new Employee(12345,"Bob");
        employees[1]=new Employee(78963,"Alex");
    
        System.out.println("Employee1");
        employees[0].ShowData();
        System.out.println("Employee2");
        employees[1].ShowData();
    }
}   
    class Employee {
        int empId;
        String empName; 

        Employee(int empId, String empName) {
            this.empId = empId;
            this.empName = empName;
        }
        
        public void ShowData(){
            System.out.println("ID " + empId +" Name "+empName);   
        }
    }

