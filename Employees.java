package chapter_3;

public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    
    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = Math.max(0.0, salary);
    }


    public String getFullName() {
        return firstName + " " + lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    
    public void increaseSalary(double percent) {
        if (percent > 0) {
            monthlySalary += monthlySalary * percent / 100;
        }
    }

    
    public static void main(String[] args) {
        Employee emp1 = new Employee("Rohima", "Kona", 90000);
        Employee emp2 = new Employee("Sami", "Ridoy", 80000);

        
        System.out.println(emp1.getFullName() + "'s yearly salary: Tk " + emp1.getYearlySalary());
        System.out.println(emp2.getFullName() + "'s yearly salary: Tk " + emp2.getYearlySalary());

        
        emp1.increaseSalary(10);
        emp2.increaseSalary(10);

        
        System.out.println("\nAfter 10% raise:");
        System.out.println(emp1.getFullName() + "'s new yearly salary: Tk " + emp1.getYearlySalary());
        System.out.println(emp2.getFullName() + "'s new yearly salary: Tk " + emp2.getYearlySalary());
    }
}
