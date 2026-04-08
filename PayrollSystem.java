package PROJECTS_ASSIGNMENTS;

public class PayrollSystem {
    public static void main(String[] args) {
        Employee fullTime = new FullTimeEmployee(20087,1000);
        Employee partTime = new PartTimeEmployee(30058,394);


        System.out.println("Full_time Salary :" + fullTime.calculateSalary());
        System.out.println("Part_Time Salary :" + partTime.calculateSalary());
    }
}
