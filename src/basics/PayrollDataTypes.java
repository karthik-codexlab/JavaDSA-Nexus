public class PayrollDataTypes {
    public static void main(String[] args) {

        // Employee Details (data types)
        String employeeName = "Karthik";
        String designation = "Software Engineer";
        int employeeId = 1023;

        // Salary Components (industry used variables)
        double basicSalary = 225000.00;      // monthly base salary: 2.25 lakhs
        double hraPercent = 20.0;            // House Rent Allowance
        double daPercent = 15.0;             // Dearness Allowance
        double pfPercent = 12.0;             // Provident Fund
        double taxPercent = 10.0;            // Income Tax deduction

        // Calculations
        double hra = (hraPercent / 100) * basicSalary;
        double da = (daPercent / 100) * basicSalary;

        double grossSalary = basicSalary + hra + da;

        double pf = (pfPercent / 100) * basicSalary;
        double tax = (taxPercent / 100) * grossSalary;

        double netSalary = grossSalary - (pf + tax);

        // Output (salary slip format)
        System.out.println("----- SALARY SLIP -----");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + employeeName);
        System.out.println("Designation: " + designation);
        System.out.println("------------------------");
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA (20%): " + hra);
        System.out.println("DA (15%): " + da);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("PF (12%): " + pf);
        System.out.println("Tax (10%): " + tax);
        System.out.println("------------------------");
        System.out.println("Net Salary: " + netSalary);
        System.out.println("------------------------");
    }
}
