package memorymodel;

public class StackVsHeap {

    static class Employee {
        String name;

        Employee(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        int id = 101;            
        Employee emp = new Employee("Karthik"); 

        display(emp);
    }

    private static void display(Employee employee) {
        String message = "Employee Name: " + employee.name;
        System.out.println(message);
    }
}
