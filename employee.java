

import java.util.Scanner;
class Employee {
    int eno;
    String ename;
    double esalary;  
    Employee(int eno, String ename, double esalary) {
        this.eno = eno;
        this.ename = ename;
        this.esalary = esalary;
    }    
    void display() {
        System.out.println("Employee Number: " + eno);
        System.out.println("Employee Name: " + ename);
        System.out.println("Employee Salary: " + esalary);
    }
    static Employee searchEmployee(Employee[] employees, int searchEno) {
        for (Employee emp : employees) {
            if (emp.eno == searchEno) {
                return emp;
            }
        }
        return null; 
    }
}
public class employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();        
        Employee[] employees = new Employee[n];     
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));
            System.out.print("Enter Employee Number: ");
            int eno = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Enter Employee Name: ");
            String ename = sc.nextLine();

            System.out.print("Enter Employee Salary: ");
            double esalary = sc.nextDouble();
            sc.nextLine();          
            employees[i] = new Employee(eno, ename, esalary);
        }      
        System.out.print("\nEnter the Employee Number to search: ");
        int searchEno = sc.nextInt();       
        Employee searchedEmployee = Employee.searchEmployee(employees, searchEno);      
        if (searchedEmployee != null) {
            System.out.println("\nEmployee found!");
            searchedEmployee.display();
        } else {
            System.out.println("Employee with Employee Number " + searchEno + " not found.");
        }
        sc.close();
    }
}

